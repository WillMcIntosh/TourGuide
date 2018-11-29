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
public class MuseumFragment extends Fragment {


    public MuseumFragment() {
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

        attractionList.add(new Attraction("museum", "The Boston Tea Party Museum", "An " +
                "interactive experience where you can participate in tossing the tea and " +
                "protesting taxes.", R.drawable.tea));
        attractionList.add(new Attraction("museum", "Museum of Fine Arts", "Boston's oldest, " +
                "largest and best-known art institution.", R
                .drawable.art));
        attractionList.add(new Attraction("museum", "Museum of Science", "Home of the Hayden " +
                "Planetarium and over 700 interactive exhibits", R.drawable.science));
        attractionList.add(new Attraction("museum", "Boston Children's Museum", "An interactive "
                + "and educational museum designed specifically for children." + ".", R.drawable
                .childrens_museum));
        attractionList.add(new Attraction("museum", "Harvard Art Museum", "The Harvard Art " +
                "Museums house one of the largest and most renowned art collections in the United States.", R
                .drawable.harvard_art_museums));
        attractionList.add(new Attraction("museum", "MIT Museum", "Temporary and permanent " +
                "exhibitions at the nexus of art, science, and technology, as well as events, " +
                "programs, and weekend demonstrations.", R.drawable.mit_museum));


        return attractionList;
    }

}
