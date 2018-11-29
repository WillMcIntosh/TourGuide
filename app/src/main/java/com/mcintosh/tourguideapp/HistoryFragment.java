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

        attractionList.add(new Attraction("history", "Harvard University", "Harvard University "
                + "is America's oldest University, founded in 1636.", R.drawable.harvard));
        attractionList.add(new Attraction("history", "Granary Burial Ground", "A small cemetery " +
                "that serves as the final resting place for a number of " + "important characters" +
                " from the American revolution including John Hancock" + " himself.", R.drawable
                .granary));
        attractionList.add(new Attraction("history", "The Bunker Hill Monument", "An obelisk and " +
                "" + "monument to the Battle of Bunker Hill.", R.drawable.bunker));
        attractionList.add(new Attraction("history", "The Old North Church", "The famous spot of " +
                "" + "the signal that warned residents of Cambridge that the British were " +
                "approaching " + "by sea in 1775.", R.drawable.old_north));
        attractionList.add(new Attraction("history", "Paul Revere's House", "Former home of Paul " +
                "Revere when he set out on his famous ride toward Lexington.", R.drawable.revere));
        attractionList.add(new Attraction("history", "The USS Constitution", "Constructed in the " +
                "" + "North End and steeped in Boston history." + ".", R.drawable
                .uss_constitution));

        return attractionList;
    }

}
