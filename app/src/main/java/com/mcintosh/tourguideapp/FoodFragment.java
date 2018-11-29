package com.mcintosh.tourguideapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import org.w3c.dom.Attr;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FoodFragment extends Fragment {


    public FoodFragment() {
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

        attractionList.add(new Attraction("food", "Sam LaGrassa's", "American Fast Food. Soups, " +
                "Deli, Vegetarian Friendly.", R
                .drawable
                .sam));
        attractionList.add(new Attraction("food", "Salumeria Italiana",
                "Great classic italian restaurant",
                R.drawable.salumeria_italiana));
        attractionList.add(new Attraction("food", "Monica's Mercato & " +
                "Salumeria", "Best Italian subs in town!", R.drawable.monica));
        attractionList.add(new Attraction("food", "Regina Pizzeria", "Local " +
                "chain with the best Pizza in Boston.", R.drawable.regina));
        attractionList.add(new Attraction("food", "Ruth's Chris Steakhouse",
                "Excellent steakhouse right in the heart of Boston.", R
                .drawable.ruth));
        attractionList.add(new Attraction("food", "Oleana", "Excellent Mediterranean tapas bar " +
                "located in " +
                "Cambridge's Inman Square.", R.drawable.oleana));
        attractionList.add(new Attraction("food", "Dali", "Spanish tapas bar " +
                "on the border Cambridge and Somerville.", R.drawable.dali));
        attractionList.add(new Attraction("food", "Santouka Ramen", "Voted one of the best ramen " +
                "restaurants in the U.S." +
                "", R.drawable.santouka));

        return attractionList;
    }

}
