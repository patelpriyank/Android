package travel.caddy.launcher.Helpers;

/**
 * Created by PrPatel on 9/28/2014.
 */
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

public class VersionUtils {

    public static int getVersionCode( Context context ) throws NameNotFoundException {
        PackageInfo manager= context.getPackageManager().getPackageInfo(
                context.getPackageName(), 0);
        return manager.versionCode;
    }
}
