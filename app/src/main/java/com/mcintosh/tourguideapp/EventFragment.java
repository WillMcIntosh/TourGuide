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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        ArrayList<Attraction> attractionList = getAttractionList();
        ListView lv = rootView.findViewById(R.id.list);
        lv.setAdapter(new AttractionAdapter(getActivity(), attractionList));

        return rootView;

    }

    private ArrayList<Attraction> getAttractionList() {
        ArrayList<Attraction> attractionList = new ArrayList<>();

        attractionList.add(new Attraction(getString(R.string.category_event), getString(R.string
                .marathon), getString(R.string.desc_marathon), R.drawable.marathon));
        attractionList.add(new Attraction(getString(R.string.category_event), getString(R.string
                .red_sox), getString(R.string.desc_red_sox), R.drawable.red_sox));
        attractionList.add(new Attraction(getString(R.string.category_event), getString(R.string
                .celtics), getString(R.string.desc_celtics), R.drawable.celtics));
        attractionList.add(new Attraction(getString(R.string.category_event), getString(R.string
                .bruins), getString(R.string.desc_bruins), R.drawable.bruins));
        attractionList.add(new Attraction(getString(R.string.category_event), getString(R.string
                .patriots), getString(R.string.desc_patriots), R.drawable.pats));
        attractionList.add(new Attraction(getString(R.string.category_event), getString(R.string
                .opera), getString(R.string.desc_opera), R.drawable.opera));


        return attractionList;
    }

}
