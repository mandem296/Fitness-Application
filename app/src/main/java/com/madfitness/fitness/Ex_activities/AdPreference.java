package com.madfitness.fitness.Ex_activities;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.madfitness.fitness.R;
import android.app.Activity;
        import android.content.Context;
        import android.preference.Preference;
        import android.util.AttributeSet;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.LinearLayout;
public class AdPreference extends Preference {
    public AdPreference(Context context, AttributeSet attrs, int defStyle) {super    (context, attrs, defStyle);}
    public AdPreference(Context context, AttributeSet attrs) {super(context, attrs);}
    public AdPreference(Context context) {super(context);}
    @Override
    protected View onCreateView(ViewGroup parent) {
        // this will create the linear layout defined in ads_layout.xml
        View view = super.onCreateView(parent);

        view.setPadding(0,60,0,0);
        Activity activity = (Activity)getContext();
        AdView adView = new AdView(activity);
        adView.setAdSize(AdSize.SMART_BANNER);
        adView.setAdUnitId(getContext().getResources().getString(R.string.banner_ad_id));
        ((LinearLayout)view).addView(adView);
        // Initiate a generic request to load it with an ad
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        return view;
    }
}