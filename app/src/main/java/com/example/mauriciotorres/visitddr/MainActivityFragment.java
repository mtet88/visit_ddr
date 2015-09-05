package com.example.mauriciotorres.visitddr;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View thisView = inflater.inflate(R.layout.fragment_main, container, false);
        ArrayList<String> fakes = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            fakes.add("Sitio numero " + (i + 1));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), R.layout.venue_cell, R.id.venue_cell, fakes);

        ListView listView = (ListView)thisView.findViewById(R.id.venues_list);
        listView.setAdapter(adapter);

        return thisView;
    }
}
