package travel.caddy.launcher.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by PrPatel on 9/25/2014.
 */
public class AdapterLauncherGrid extends BaseAdapter {

    private Context _context;
    private final String[] _displayTexts;
    private final int[] _icons;

    public AdapterLauncherGrid(Context context, String[] displayTexts, int[] icons) {
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
/*
        View grid;
        LayoutInflater inflater = (LayoutInflater) mContext
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            grid = new View(mContext);
            grid = inflater.inflate(R.layout.grid_single, null);
            TextView textView = (TextView) grid.findViewById(R.id.grid_text);
            ImageView imageView = (ImageView)grid.findViewById(R.id.grid_image);
            textView.setText(web[position]);
            imageView.setImageResource(Imageid[position]);
        } else {
            grid = (View) convertView;
        }
        return grid;
*/

        return null;
    }
}
