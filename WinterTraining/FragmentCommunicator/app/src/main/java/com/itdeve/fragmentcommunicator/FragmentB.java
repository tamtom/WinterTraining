package com.itdeve.fragmentcommunicator;


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
public class FragmentB extends Fragment {

   TextView Text;
    String str;
    public FragmentB() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d("frag b","Yes I'v been created");
     View   view = inflater.inflate(R.layout.fragment_fragment_b, container, false);
        if(savedInstanceState!=null){
            str = savedInstanceState.getString("text");
            Text = (TextView) view.findViewById(R.id.textfrag );
            Text.setText(str);
        }
        return view;
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Text = (TextView) getActivity().findViewById(R.id.textfrag);
        Log.d("the text is ", (Text == null) + "");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    outState.putString("text",str);
    }

    public  void changeText(String str){
        this.str = str;
        Text.setText(str);
    }

}
