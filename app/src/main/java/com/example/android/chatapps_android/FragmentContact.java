package com.example.android.chatapps_android;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeffrey on 3/1/2018.
 */

public class FragmentContact extends Fragment {

    View v;
    private RecyclerView myrecyclerview;
    private ArrayList<Contact> lstContact;

    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.contact_fragment, container, false);
        myrecyclerview = (RecyclerView) v.findViewById(R.id.contact_recyclerview);
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getContext(), lstContact);
        myrecyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerview.setAdapter(recyclerAdapter);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact = new ArrayList<>();
        lstContact.add(new Contact("Aaron", "Available", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Jason", "Busy", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Abigail", "Away", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Steven", "Offline", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Aaron", "Available", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Jason", "Busy", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Abigail", "Away", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Steven", "Offline", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Aaron", "Available", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Jason", "Busy", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Abigail", "Away", R.drawable.ic_search_black_24dp));
        lstContact.add(new Contact("Steven", "Offline", R.drawable.ic_search_black_24dp));
    }
}
