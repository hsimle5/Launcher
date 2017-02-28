package hu.bme.aut.amorg.examples.launcher.fragments;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devspark.robototextview.widget.RobotoButton;

import hu.bme.aut.amorg.examples.launcher.R;

import static android.R.attr.phoneNumber;

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
        View layout = inflater.inflate(R.layout.fragment_dialer2, container, false);

        RobotoButton callButton = (RobotoButton) layout.findViewById(R.id.call_button);
        callButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String phoneNumber = "tel:+36201234567";
                Intent i = new Intent(
                        Intent.ACTION_CALL,
                        Uri.parse(phoneNumber)
                );
                startActivity(i);
            }});


        return layout;

}}
