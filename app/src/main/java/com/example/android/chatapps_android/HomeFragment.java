package com.example.android.chatapps_android;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    GridLayout mainGrid;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment

        mainGrid = (GridLayout) v.findViewById(R.id.mainGrid);

        //set Event
        setSingleEvent (mainGrid);

        final SwipeRefreshLayout mSwipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.fragment_home);

        mSwipeRefreshLayout.setOnRefreshListener(
                new SwipeRefreshLayout.OnRefreshListener() {
                    @Override
                    public void onRefresh() {
                        ((tabviewChatbox) getActivity()).refreshNow();
                        Toast.makeText(getContext(), "Refreshed", Toast.LENGTH_LONG).show();
                    }
                }
        );

        return v;
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for(int i=0; i<mainGrid.getChildCount(); i++)
        {
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText (getContext(), "Clicked at activity " + finalI, Toast.LENGTH_SHORT).show();
                }
            });
        }
    }

}
