package slidnerd.vivz.bucketdrops.extras;

import android.view.View;

import java.util.List;

/**
 * Created by Kevin on 4/15/2016.
 */
public class Util {
    public static void showViews(List<View> views)
    {
        for (View view: views)
        {
            view.setVisibility(View.VISIBLE);
        }
    }

    public static void hideViews(List<View> views)
    {
        for (View view: views)
        {
            view.setVisibility(View.GONE);
        }
    }
}
