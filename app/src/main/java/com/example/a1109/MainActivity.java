package com.example.a1109;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AddFragment addFragment = new AddFragment();
        TittleFragment tittleFragment = new TittleFragment();
        ShowFragment showFragment = new ShowFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.addFragment, addFragment, "addFragment").commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.showFragment, showFragment, "showFragment").commit();
        getSupportFragmentManager().beginTransaction().replace(R.id.TittleFragment, tittleFragment, "tittleFragment").commit();

    }
}
