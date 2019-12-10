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
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btnCalcuate;
    private EditText etFirst, etSecond;
    private TextView tvResult;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        etFirst = view.findViewById(R.id.etFirst);
        etSecond = view.findViewById(R.id.etSecond);
        btnCalcuate = view.findViewById(R.id.btnCalculate);
        tvResult = view.findViewById(R.id.tvResult);

        btnCalcuate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first, second, result;

        first = Integer.parseInt(etFirst.getText().toString());
        second = Integer.parseInt(etSecond.getText().toString());
        result = first + second;

        tvResult.append("The sum of first number: " + first + " & second number: "+ second +" is " +result + ".\n");

//        Toast.makeText(getActivity(), "Sum is :" + result, Toast.LENGTH_SHORT).show();
    }
}
