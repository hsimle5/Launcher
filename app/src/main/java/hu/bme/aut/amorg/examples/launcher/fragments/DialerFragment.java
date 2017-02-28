package hu.bme.aut.amorg.examples.launcher.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hu.bme.aut.amorg.examples.launcher.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DialerFragment extends Fragment {


    public DialerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dialer2, container, false);
    }

}
