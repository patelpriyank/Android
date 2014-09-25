package travel.caddy.launcher.customlayouts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * This class provides a custom view for the heterogenous layout used through
 * the application. It has an icon, a text and a custom background. Text and
 * image places can be changed two ways. </p> 1- An image at the top text at the
 * bottom </p> 2- An image on the left text on the right </p>
 *
 *
 */
/**
 * Created by PrPatel on 9/25/2014.
 */
public class CompositeImageTextLayout extends LinearLayout {

    private ImageView imageView;
    private TextView textView;

    public CompositeImageTextLayout(Context context) {
        super(context);
        imageView = new ImageView(context);
        textView = new TextView(context);
        textView.setTextColor(getResources().getColor(android.R.color.white));
        // Custom font
        final Typeface dincond = Typeface.createFromAsset(context.getAssets(), "DINCond-Regular.otf");
        textView.setTypeface(dincond);
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);

        this.setGravity(Gravity.CENTER);
        this.setClickable(true);

        this.addView(imageView);
        this.addView(textView);
    }

    public void setText(int resid) {
        textView.setText(resid);
    }

    public void setText(CharSequence text) {
        textView.setText(text);
    }

    public void setIcon(int resid) {
        imageView.setImageDrawable(getResources().getDrawable(resid));
    }

    public ImageView getImageView() {
        return imageView;
    }

    public TextView getTextView() {
        return textView;
    }
}
