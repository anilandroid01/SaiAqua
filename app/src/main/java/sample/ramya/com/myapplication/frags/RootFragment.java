package sample.ramya.com.myapplication.frags;

import android.support.v4.app.Fragment;

import sample.ramya.com.myapplication.BackPressImpl;
import sample.ramya.com.myapplication.OnBackPressListener;


/**
 * Created by shahabuddin on 6/6/14.
 */
public class RootFragment extends Fragment implements OnBackPressListener {

    @Override
    public boolean onBackPressed() {
        return new BackPressImpl(this).onBackPressed();
    }
}
