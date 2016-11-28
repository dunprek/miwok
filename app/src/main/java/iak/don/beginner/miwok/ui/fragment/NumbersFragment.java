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
import iak.don.beginner.miwok.adapter.Adapter;
import iak.don.beginner.miwok.model.Model;

public class NumbersFragment extends Fragment{

    ArrayList<Model> models = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;


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

        ArrayList<Model> models = new ArrayList<>();
        models.add(new Model(String.valueOf(R.string.numbers_eng_one),String.valueOf(R.string.numbers_mi_one),String.valueOf(R.mipmap.number_one)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_two),String.valueOf(R.string.numbers_mi_two),String.valueOf(R.mipmap.number_two)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_three),String.valueOf(R.string.numbers_mi_three),String.valueOf(R.mipmap.number_three)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_four),String.valueOf(R.string.numbers_mi_four),String.valueOf(R.mipmap.number_four)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_five),String.valueOf(R.string.numbers_mi_five),String.valueOf(R.mipmap.number_five)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_six),String.valueOf(R.string.numbers_mi_six),String.valueOf(R.mipmap.number_six)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_seven),String.valueOf(R.string.numbers_mi_seven),String.valueOf(R.mipmap.number_seven)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_eight),String.valueOf(R.string.numbers_mi_eight),String.valueOf(R.mipmap.number_eight)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_nine),String.valueOf(R.string.numbers_mi_nine),String.valueOf(R.mipmap.number_nine)));
        models.add(new Model(String.valueOf(R.string.numbers_eng_ten),String.valueOf(R.string.numbers_mi_ten),String.valueOf(R.mipmap.number_ten)));


//        ad.notifyDataSetChanged();
    }

}


