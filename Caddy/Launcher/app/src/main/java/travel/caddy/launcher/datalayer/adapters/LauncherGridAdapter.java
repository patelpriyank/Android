package travel.caddy.launcher.datalayer.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by PrPatel on 9/25/2014.
 */
public class LauncherGridAdapter extends BaseAdapter {

    private Context _context;
    private final String[] _displayTexts;
    private final int[] _icons;

    public LauncherGridAdapter(Context context,String[] displayTexts, int[] icons ) {
        _context = context;
        this._displayTexts = displayTexts;
        this._icons = icons;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
