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

        attractionList.add(new Attraction(getString(R.string.category_museum), getString(R.string
                .tea_party), getString(R.string.desc_tea_party), R.drawable.tea));
        attractionList.add(new Attraction(getString(R.string.category_museum), getString(R.string
                .fine_arts), getString(R.string.desc_fine_arts), R.drawable.art));
        attractionList.add(new Attraction(getString(R.string.category_museum), getString(R.string
                .m_of_science), getString(R.string.desc_m_of_science), R.drawable.science));
        attractionList.add(new Attraction(getString(R.string.category_museum), getString(R.string
                .childrens), getString(R.string.desc_childrens), R.drawable.childrens_museum));
        attractionList.add(new Attraction(getString(R.string.category_museum), getString(R.string
                .harvard_art), getString(R.string.desc_harvard_art), R.drawable
                .harvard_art_museums));
        attractionList.add(new Attraction(getString(R.string.category_museum), getString(R.string
                .mit_museum), getString(R.string.desc_mit_museum), R.drawable.mit_museum));


        return attractionList;
    }

}
