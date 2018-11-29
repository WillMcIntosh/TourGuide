package com.mcintosh.tourguideapp;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

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

        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.sam), getString(R.string.desc_sam), R.drawable.sam));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.sals),
                getString(R.string.desc_sals),
                R.drawable.salumeria_italiana));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.monicas), getString(R.string.desc_monicas), R.drawable.monica));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.regina), getString(R.string.desc_regina), R.drawable.regina));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.ruths),
                getString(R.string.desc_ruths), R.drawable.ruth));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.oleana), getString(R.string.desc_oleana), R.drawable.oleana));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.dali), getString(R.string.desc_dali), R.drawable.dali));
        attractionList.add(new Attraction(getString(R.string.category_food), getString(R.string.santouka), getString(R.string.desc_santouka), R.drawable.santouka));

        return attractionList;
    }

}
