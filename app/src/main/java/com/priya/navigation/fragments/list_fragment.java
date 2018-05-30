package com.priya.navigation.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.priya.navigation.Adapter.NumberAdapter;
import com.priya.navigation.R;

import org.w3c.dom.NameList;

public class list_fragment extends Fragment {


private String[]namelist={"Priya","Riya","Ziya","Gita","Sarita","Babita","Abhipsa","Asha","Jigyasa","Kamla","Bimla"};
private NameList nameList;
private ListView listView;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.list_fragment,container,false);
        ListView listView = view.findViewById(R.id.numberLv);

        NumberAdapter numberAdapter=new NumberAdapter(namelist, getActivity());




        return view;
    }
}
