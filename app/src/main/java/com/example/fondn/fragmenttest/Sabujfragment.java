package com.example.fondn.fragmenttest;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Sabujfragment extends Fragment {

    TextView textView,textView2;
    EditText editText;
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_sabujfragment, container, false);
        textView = (TextView) view.findViewById(R.id.textSabujFragmentID);
        textView2 = (TextView) view.findViewById(R.id.textviewSecondForResultID);
        editText = (EditText) view.findViewById(R.id.editTextsabujFragmentID);
        button = (Button) view.findViewById(R.id.buttonSabujFragmentID);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name;
                name = editText.getText().toString();
                textView2.setText(name);
            }
        });




        return view;
    }


}
