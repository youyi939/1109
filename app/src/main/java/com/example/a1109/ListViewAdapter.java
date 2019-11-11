package com.example.a1109;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ListViewAdapter  extends ArrayAdapter<Person> {
    private int resourceId;


    public ListViewAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        resourceId = resource;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(getContext()).inflate(resourceId, parent, false);
        final Person person = getItem(position);
        final TextView name = view.findViewById(R.id.name);

        name.setText(person.getName());




        return view;
    }
}
