package com.itdeve.workoutfragments;

import android.app.Activity;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    WorkoutDetailFragment fragment =(WorkoutDetailFragment) getFragmentManager().findFragmentById(R.id.detail_fragment);
        fragment.setWorkid(1);

    }
}
