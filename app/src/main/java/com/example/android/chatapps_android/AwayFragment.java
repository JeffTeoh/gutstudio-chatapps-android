package com.example.android.chatapps_android;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class AwayFragment extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private List<Contact> lstContact;



    public AwayFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_away, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerViewAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Aaron", "Available", R.drawable.apex));
        lstContact.add(new Contact("David", "Busy", R.drawable.pt_logo));
        lstContact.add(new Contact("John", "Not Available", R.drawable.usm_baru_2_jpg));
        lstContact.add(new Contact("Aaron", "Available", R.drawable.skkt));
        lstContact.add(new Contact("David", "Busy", R.drawable.apex));
        lstContact.add(new Contact("John", "Not Available", R.drawable.pt_logo));
        lstContact.add(new Contact("Aaron", "Available", R.drawable.usm_baru_2_jpg));
        lstContact.add(new Contact("David", "Busy", R.drawable.skkt));
        lstContact.add(new Contact("John", "Not Available", R.drawable.apex));
        lstContact.add(new Contact("Aaron", "Available", R.drawable.pt_logo));
        lstContact.add(new Contact("David", "Busy", R.drawable.usm_baru_2_jpg));
        lstContact.add(new Contact("John", "Not Available", R.drawable.skkt));
    }
}
