package com.mcintosh.tourguideapp;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {


    public EventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container,
                false);

        ArrayList<Attraction> attractionList = getAttractionList();
        ListView lv = rootView.findViewById(R.id.list);
        lv.setAdapter(new AttractionAdapter(getActivity(), attractionList));

        return rootView;

    }

    private ArrayList<Attraction> getAttractionList() {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Attraction("event", "Boston Marathon", "American Fast Food. Soups," +
                " " +
                "Deli, Vegetarian Friendly.", R.drawable.sam));
        attractionList.add(new Attraction("event", "Boston Red Sox",
                "Great classic italian restaurant",
                R.drawable.salumeria_italiana));
        attractionList.add(new Attraction("event", "Boston Celtics", "Local " +
                "chain with the best Pizza in Boston.", R.drawable.regina));
        attractionList.add(new Attraction("event", "Boston Bruins",
                "Excellent steakhouse right in the heart of Boston.", R
                .drawable.ruth));
        attractionList.add(new Attraction("event", "New England Patriots", "Excellent " +
                "Mediterranean tapas bar " +
                "located in " +
                "Cambridge's Inman Square.", R.drawable.oleana));
        attractionList.add(new Attraction("event", "Boston Opera House", "Spanish tapas bar " +
                "on the border Cambridge and Somerville.", R.drawable.dali));
        

        return attractionList;
    }

}
