package com.example.a1109;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ShowFragment extends Fragment {


    public ShowFragment() {
        // Required empty public constructor
    }

    private TextView name;
    private TextView age;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_show, container, false);
        name = view.findViewById(R.id.showName);
        age = view.findViewById(R.id.showAge);


        return view;
    }



    public void setData(String string,String string2) {
        name.setText(string);
        age.setText(string2);
    }

}
