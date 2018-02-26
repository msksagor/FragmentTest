package com.example.fondn.fragmenttest;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] name = {"Sagor","khan","Sabuj","Dhaka","Tangail","Ghatail","Bangladesh"};

        listView = (ListView) findViewById(R.id.listViewID);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fragment fragment;

        if(position == 0){
            fragment = new Sabujfragment();
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragmentID,fragment);
            transaction.commit();


        }
        else if(position ==1){

            //shortCut
            fragment = new Khan();
            getFragmentManager().beginTransaction().replace(R.id.fragmentID,fragment).commit();

        }
    }
}
