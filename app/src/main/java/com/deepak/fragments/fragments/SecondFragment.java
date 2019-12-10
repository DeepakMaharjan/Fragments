package com.deepak.fragments.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.deepak.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener {

    private EditText etRadius;
    private Button btnCalRadius;
    private TextView tvRadiusResult;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        etRadius = view.findViewById(R.id.etRadius);
        btnCalRadius = view.findViewById(R.id.btnRadius);
        tvRadiusResult = view.findViewById(R.id.tvRadiusResult);

        btnCalRadius.setOnClickListener(this);

        return view;

    }

    @Override
    public void onClick(View v) {
        float radius, result;

        radius = Float.parseFloat(etRadius.getText().toString());

        result = (radius * radius * 22) / 7;

       tvRadiusResult.append("The radius of "+ radius + "is " + result + ".\n");


    }
}
