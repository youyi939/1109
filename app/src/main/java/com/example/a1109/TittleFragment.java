package com.example.a1109;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TittleFragment extends Fragment {

    private ListView listView;
    private ListViewAdapter adapter;
    public List<Person> personList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tittle, container, false);
        initDate();
        listView = view.findViewById(R.id.list);

        adapter = new ListViewAdapter(getContext(), R.layout.item, personList);
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ShowFragment mainFragment = (ShowFragment) getActivity()
                                .getSupportFragmentManager()
                                .findFragmentByTag("showFragment");
                mainFragment.setData(personList.get(position).getName(),personList.get(position).getAge());
            }
        });

        return view;
    }

    private void initDate(){

        personList.add(new Person("张三","35"));
        personList.add(new Person("李四","36"));
        personList.add(new Person("王五","37"));
        personList.add(new Person("赵六","38"));
        personList.add(new Person("炮灰乙","39"));

    }

    public void addDate(String name,String age){

        personList.add(new Person(name,age));
        adapter = new ListViewAdapter(getContext(), R.layout.item, personList);
        adapter.notifyDataSetChanged();
        listView.setAdapter(adapter);
    }


}
