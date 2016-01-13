package com.itdeve.fragmentcommunicator;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
Button mButton ;
    int c;
clicktoChange clicktoChange;
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
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        clicktoChange = (FragmentA.clicktoChange) getActivity();
        Log.d("yay","interface init");
        mButton = (Button) getActivity().findViewById(R.id.change_text);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c++;
                clicktoChange.changeTheText("oh baby "+c);
            }
        });
    }

    static  interface clicktoChange{
        void changeTheText(String str);
    }

}


