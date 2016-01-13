package com.itdeve.fragmentcommunicator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
TextView vvv ;

    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_, container, false);
    }

    @Override
    public void onStart() {
        View view = getView();
        if (view != null) {
            vvv = (TextView) view.findViewById(R.id.text_to_change);

        }
    }
    private void changeText(String r){
        vvv.setText(r);

    }
}


