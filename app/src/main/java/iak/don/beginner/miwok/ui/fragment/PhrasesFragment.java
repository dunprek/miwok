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

public class PhrasesFragment extends Fragment{

    ArrayList<Model> models = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;


    public PhrasesFragment() {
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

        models.add(new Model(String.valueOf(R.string.phrases_eng_where_are_you),String.valueOf(R.string.phrases_mi_where_are_you)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_what_is_your),String.valueOf(R.string.phrases_mi_what_is_your)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_my_name_is),String.valueOf(R.string.phrases_mi_my_name_is)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_how_are_you),String.valueOf(R.string.colors_mi_red)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_feeling_good),String.valueOf(R.string.phrases_mi_how_are_you)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_are_you),String.valueOf(R.string.phrases_mi_are_you)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_yes_im),String.valueOf(R.string.phrases_mi_yes_im)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_im_coming),String.valueOf(R.string.phrases_mi_im_coming)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_lets_go),String.valueOf(R.string.phrases_mi_lets_go)));
        models.add(new Model(String.valueOf(R.string.phrases_eng_come_here),String.valueOf(R.string.phrases_mi_come_here)));
//        ad.notifyDataSetChanged();
    }
}
