package iak.don.beginner.miwok.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.adapter.Adapter;
import iak.don.beginner.miwok.model.Model;

public class ColorsFragment extends Fragment {
    ArrayList<Model> models = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;

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

        mAdapter = new Adapter(models);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(mAdapter);

        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        prepareModelData();


        return rootView;
    }



    private void prepareModelData() {
        models.add(new Model(String.valueOf(R.string.colors_eng_red),String.valueOf(R.string.colors_mi_red),String.valueOf(R.mipmap.color_red)));
        models.add(new Model(String.valueOf(R.string.colors_eng_green),String.valueOf(R.string.colors_mi_green),String.valueOf(R.mipmap.color_green)));
        models.add(new Model(String.valueOf(R.string.colors_eng_brown),String.valueOf(R.string.colors_mi_brown),String.valueOf(R.mipmap.color_brown)));
        models.add(new Model(String.valueOf(R.string.colors_eng_gray),String.valueOf(R.string.colors_mi_gray),String.valueOf(R.mipmap.color_gray)));
        models.add(new Model(String.valueOf(R.string.colors_eng_black),String.valueOf(R.string.colors_mi_black),String.valueOf(R.mipmap.color_black)));
        models.add(new Model(String.valueOf(R.string.colors_eng_white),String.valueOf(R.string.colors_mi_white),String.valueOf(R.mipmap.color_white)));
        models.add(new Model(String.valueOf(R.string.colors_eng_dusty_yellow),String.valueOf(R.string.colors_mi_dusty_yellow),String.valueOf(R.mipmap.color_dusty_yellow)));
        models.add(new Model(String.valueOf(R.string.colors_eng_mustard_yellow),String.valueOf(R.string.colors_mi_mustard_yellow),String.valueOf(R.mipmap.color_mustard_yellow)));
        mAdapter.notifyDataSetChanged();
    }

}
