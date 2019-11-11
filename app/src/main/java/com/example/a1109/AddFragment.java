package com.example.a1109;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class AddFragment extends Fragment {


    public AddFragment() {
        // Required empty public constructor
    }

    private EditText name;
    private EditText age;
    private Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add, container, false);


        name = view.findViewById(R.id.addName);
        age = view.findViewById(R.id.ageName);
        button = view.findViewById(R.id.add);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TittleFragment tittleFragment =
                        (TittleFragment) getActivity()
                                .getSupportFragmentManager()
                                .findFragmentByTag("tittleFragment");
             tittleFragment.addDate(name.getText().toString(),age.getText().toString());
            }
        });


        return view;
    }

}
