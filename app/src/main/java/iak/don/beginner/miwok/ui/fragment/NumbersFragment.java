package iak.don.beginner.miwok.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.adapter.ColorsAdapter;
import iak.don.beginner.miwok.model.Colors;

public class NumbersFragment extends Fragment{
    private RecyclerView recyclerView;
    private ColorsAdapter mAdapter;
    private LinearLayout ll;

    public NumbersFragment() {
        // empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.rvNumbers);
        prepareNumbersData();

        return rootView;
    }

    private void prepareNumbersData() {
        
        ArrayList<Colors> models = new ArrayList<>();
        models.add(new Colors(R.string.numbers_eng_one,R.string.numbers_mi_one,R.mipmap.number_one,R.raw.number_one));
        models.add(new Colors(R.string.numbers_eng_two,R.string.numbers_mi_two,R.mipmap.number_two,R.raw.number_two));
        models.add(new Colors(R.string.numbers_eng_three,R.string.numbers_mi_three,R.mipmap.number_three,R.raw.number_three));
        models.add(new Colors(R.string.numbers_eng_four,R.string.numbers_mi_four,R.mipmap.number_four,R.raw.number_four));
        models.add(new Colors(R.string.numbers_eng_five,R.string.numbers_mi_five,R.mipmap.number_five,R.raw.number_five));
        models.add(new Colors(R.string.numbers_eng_six,R.string.numbers_mi_six,R.mipmap.number_six,R.raw.number_six));
        models.add(new Colors(R.string.numbers_eng_seven,R.string.numbers_mi_seven,R.mipmap.number_seven,R.raw.number_seven));
        models.add(new Colors(R.string.numbers_eng_eight,R.string.numbers_mi_eight,R.mipmap.number_eight,R.raw.number_eight));
        models.add(new Colors(R.string.numbers_eng_nine,R.string.numbers_mi_nine,R.mipmap.number_nine,R.raw.number_nine));
        models.add(new Colors(R.string.numbers_eng_ten,R.string.numbers_mi_ten,R.mipmap.number_ten,R.raw.number_ten));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models,R.color.colorNumbers);
        recyclerView.setAdapter(mAdapter);


    }

}


