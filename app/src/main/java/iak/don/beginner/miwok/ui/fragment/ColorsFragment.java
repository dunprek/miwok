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

public class ColorsFragment extends Fragment {
    private RecyclerView recyclerView;
    private ColorsAdapter mAdapter;


    public ColorsFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_colors, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.rvColors);
        prepareColorsData();
        return rootView;
    }

    private void prepareColorsData() {
        ArrayList<Colors> models = new ArrayList<>();
        models.add(new Colors(getActivity().getString(R.string.colors_eng_red),getActivity().getString(R.string.colors_mi_red),getActivity().getResources().getDrawable(R.mipmap.color_red)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_green),getActivity().getString(R.string.colors_mi_green),getActivity().getResources().getDrawable(R.mipmap.color_green)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_brown),getActivity().getString(R.string.colors_mi_brown),getActivity().getResources().getDrawable(R.mipmap.color_brown)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_gray),getActivity().getString(R.string.colors_mi_gray),getActivity().getResources().getDrawable(R.mipmap.color_gray)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_black),getActivity().getString(R.string.colors_mi_black),getActivity().getResources().getDrawable(R.mipmap.color_black)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_white),getActivity().getString(R.string.colors_mi_white),getActivity().getResources().getDrawable(R.mipmap.color_white)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_dusty_yellow),getActivity().getString(R.string.colors_mi_dusty_yellow),getActivity().getResources().getDrawable(R.mipmap.color_dusty_yellow)));
        models.add(new Colors(getActivity().getString(R.string.colors_eng_mustard_yellow),getActivity().getString(R.string.colors_mi_mustard_yellow),getActivity().getResources().getDrawable(R.mipmap.color_mustard_yellow)));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models);
        recyclerView.setAdapter(mAdapter);
    }
}
