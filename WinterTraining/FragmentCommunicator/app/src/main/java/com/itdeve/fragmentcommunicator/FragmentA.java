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



/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment implements View.OnClickListener {
Button mButton ;
    int c;
ClicktoChange clicktoChange;
    public FragmentA() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d("we are ","frag A created!");
     View view=   inflater.inflate(R.layout.fragment_, container, false);
        // Inflate the layout for this fragment
        if(savedInstanceState!=null){
            c = savedInstanceState.getInt("counter");
            mButton = (Button) view.findViewById(R.id.change_text);
            Log.d("here we set the","the listener");
            mButton.setOnClickListener(this);
        }
        return view;

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter",c);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(mButton!=null)
        mButton.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        clicktoChange = (ClicktoChange) getActivity();
        Log.d("yay","interface init");
        mButton = (Button) getActivity().findViewById(R.id.change_text);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d("we are in","onClick yay");
        c++;
        clicktoChange.changeTheText("oh baby "+c);
    }



}


