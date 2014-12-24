package travel.caddy.launcher.Helpers;

/**
 * Created by PrPatel on 9/28/2014.
 */
import java.io.IOException;
import java.util.Arrays;

import android.content.res.AssetManager;

public class AssetUtils {

    public static boolean exists(String fileName, String path, AssetManager assetManager) throws IOException {
        for (String currentFileName : assetManager.list(path)) {
            if (currentFileName.equals(fileName)) {
                return true;
            }
        }
        return false;
    }

    public static String[] list(String path, AssetManager assetManager) throws IOException {
        String[] files = assetManager.list(path);
        Arrays.sort(files);
        return files;
    }
}