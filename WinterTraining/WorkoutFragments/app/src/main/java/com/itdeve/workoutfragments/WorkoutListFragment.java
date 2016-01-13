package com.itdeve.workoutfragments;


import android.app.Activity;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class WorkoutListFragment extends ListFragment{


    public WorkoutListFragment() {
        // Required empty public constructor
    }
    static interface WorkoutListener{
        void onItemClicked(long id);
    }
    private WorkoutListener Listener;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.Listener = (WorkoutListener) activity;

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if(Listener!=null){

            Log.d("we are in List", "onListItemClicked: ");
            Listener.onItemClicked(id);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String name [] = new String[Workout.workouts.length];
        for (int i = 0; i <name.length ; i++) {
            name[i] = Workout.workouts[i].getName();
        }
        ArrayAdapter<String> ListAdapter = new ArrayAdapter<String>(inflater.getContext(),android.R.layout.simple_list_item_1,name);
        setListAdapter(ListAdapter);
     return super.onCreateView(inflater,container,savedInstanceState);


    }

}
