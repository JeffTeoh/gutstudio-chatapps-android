package com.example.android.chatapps_android;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment

        ImageView imageView = (ImageView) v.findViewById(R.id.image);
        imageView.setImageResource(R.drawable.com_facebook_button_icon_blue);


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

}
