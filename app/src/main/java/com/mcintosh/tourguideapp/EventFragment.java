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

        attractionList.add(new Attraction("event", "Boston Marathon", "A local holiday, the " +
                "marathon is always help on Patriot's day: the third Monday in April.", R
                .drawable.marathon));
        attractionList.add(new Attraction("event", "Boston Red Sox", "The Red Sox compete in " +
                "Major League Baseball as a member club of the American League East division. " +
                "The" + " Red Sox have won nine World Series championships, most recently in " +
                "2018, and " + "they have played in 13.", R.drawable.red_sox));
        attractionList.add(new Attraction("event", "Boston Celtics", "NBA Team based in Boston, a" +
                " member of the Eastern Conference Atlantic Division and former home of the great" +
                " Larry Bird.", R.drawable.celtics));
        attractionList.add(new Attraction("event", "Boston Bruins", "A professional ice hockey "
                + "team based in Boston. They are members of the Atlantic Division of the Eastern" +
                " Conference of the National Hockey League. The team has been in existence since " +
                "1924, and is the league's third-oldest team overall and the oldest in the United" +
                " States.", R.drawable.bruins));
        attractionList.add(new Attraction("event", "New England Patriots", "Home of Tom Brady amd" +
                " five time superbowl champs.", R.drawable.pats));
        attractionList.add(new Attraction("event", "Boston Opera House", "When you're completely " +
                "sick of sports, check out a show at the Boston Opera House. Originally built as " +
                "a movie palace, it opened on October 29, 1928 and was rededicated in 1980 as a " +
                "home for the Opera Company of Boston.", R.drawable.opera));


        return attractionList;
    }

}
