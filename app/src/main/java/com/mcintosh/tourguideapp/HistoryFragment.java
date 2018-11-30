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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
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

        attractionList.add(new Attraction(getString(R.string.category_history), getString(R
                .string.harvard), getString(R.string.desc_harvard), R.drawable.harvard));
        attractionList.add(new Attraction(getString(R.string.category_history), getString(R
                .string.granary), getString(R.string.desc_granary), R.drawable.granary));
        attractionList.add(new Attraction(getString(R.string.category_history), getString(R
                .string.bunker_hill), getString(R.string.desc_bunker_hill), R.drawable.bunker));
        attractionList.add(new Attraction(getString(R.string.category_history), getString(R
                .string.old_north), getString(R.string.desc_old_north), R.drawable.old_north));
        attractionList.add(new Attraction(getString(R.string.category_history), getString(R
                .string.paul), getString(R.string.desc_paul), R.drawable.revere));
        attractionList.add(new Attraction(getString(R.string.category_history), getString(R
                .string.uss_constitution), getString(R.string.desc_uss_constitution), R.drawable
                .uss_constitution));

        return attractionList;
    }

}
