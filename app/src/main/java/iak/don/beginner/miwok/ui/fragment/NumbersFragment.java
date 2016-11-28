package iak.don.beginner.miwok.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.adapter.ColorsAdapter;
import iak.don.beginner.miwok.model.Colors;

public class NumbersFragment extends Fragment{
    private RecyclerView recyclerView;
    private ColorsAdapter mAdapter;

    public NumbersFragment() {
        // Required empty public constructor
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
        models.add(new Colors("test","testing",getActivity().getResources().getDrawable(R.mipmap.number_one)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_two),getActivity().getResources().getString(R.string.numbers_mi_two),getActivity().getResources().getDrawable(R.mipmap.number_two)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_three),getActivity().getResources().getString(R.string.numbers_mi_three),getActivity().getResources().getDrawable(R.mipmap.number_three)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_four),getActivity().getResources().getString(R.string.numbers_mi_four),getActivity().getResources().getDrawable(R.mipmap.number_four)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_five),getActivity().getResources().getString(R.string.numbers_mi_five),getActivity().getResources().getDrawable(R.mipmap.number_five)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_six),getActivity().getResources().getString(R.string.numbers_mi_six),getActivity().getResources().getDrawable(R.mipmap.number_six)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_seven),getActivity().getResources().getString(R.string.numbers_mi_seven),getActivity().getResources().getDrawable(R.mipmap.number_seven)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_eight),getActivity().getResources().getString(R.string.numbers_mi_eight),getActivity().getResources().getDrawable(R.mipmap.number_eight)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_nine),getActivity().getResources().getString(R.string.numbers_mi_nine),getActivity().getResources().getDrawable(R.mipmap.number_nine)));
        models.add(new Colors(getActivity().getResources().getString(R.string.numbers_eng_ten),getActivity().getResources().getString(R.string.numbers_mi_ten),getActivity().getResources().getDrawable(R.mipmap.number_ten)));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models);
        recyclerView.setAdapter(mAdapter);


    }

}


