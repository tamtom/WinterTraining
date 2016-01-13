package com.itdeve.fragmentcommunicator;

import android.app.FragmentTransaction;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements FragmentA.clicktoChange{
    FragmentB fragmentB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         fragmentB = new FragmentB();
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction fr = getFragmentManager().beginTransaction();
fr.add(R.id.container2,fragmentA);
        fr.add(R.id.container,fragmentB);
        fr.addToBackStack(null);
        fr.commit();

    }

    @Override
    public void changeTheText(String str) {
        Log.d("we are in main clicked ", "yay");

        fragmentB.changeText(str);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragmentB);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        fragmentTransaction.commit();


    }
}
