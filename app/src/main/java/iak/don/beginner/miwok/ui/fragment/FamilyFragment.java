package iak.don.beginner.miwok.ui.fragment;


import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.adapter.Adapter;
import iak.don.beginner.miwok.model.Model;


public class FamilyFragment extends Fragment{

    ArrayList<Model> models = new ArrayList<>();
    private RecyclerView recyclerView;
    private Adapter mAdapter;


    public FamilyFragment() {
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


        models.add(new Model(String.valueOf(R.string.family_eng_father),String.valueOf(R.string.family_mi_father),String.valueOf(R.mipmap.family_father)));
        models.add(new Model(String.valueOf(R.string.family_eng_mother),String.valueOf(R.string.family_mi_mother),String.valueOf(R.mipmap.family_mother)));
        models.add(new Model(String.valueOf(R.string.family_eng_son),String.valueOf(R.string.family_mi_son),String.valueOf(R.mipmap.family_son)));
        models.add(new Model(String.valueOf(R.string.family_eng_daughter),String.valueOf(R.string.family_mi_daughter),String.valueOf(R.mipmap.family_daughter)));
        models.add(new Model(String.valueOf(R.string.family_eng_older_brother),String.valueOf(R.string.family_mi_older_brother),String.valueOf(R.mipmap.family_older_brother)));
        models.add(new Model(String.valueOf(R.string.family_eng_younger_brother),String.valueOf(R.string.family_mi_younger_brother),String.valueOf(R.mipmap.family_younger_brother)));
        models.add(new Model(String.valueOf(R.string.family_eng_older_sister),String.valueOf(R.string.family_mi_older_sister),String.valueOf(R.mipmap.family_older_sister)));
        models.add(new Model(String.valueOf(R.string.family_eng_younger_sister),String.valueOf(R.string.family_mi_younger_sister),String.valueOf(R.mipmap.family_younger_sister)));
        models.add(new Model(String.valueOf(R.string.family_eng_grandmother),String.valueOf(R.string.family_mi_grandmother),String.valueOf(R.mipmap.family_grandmother)));
        models.add(new Model(String.valueOf(R.string.family_eng_grandfather),String.valueOf(R.string.family_mi_grandfather),String.valueOf(R.mipmap.family_grandfather)));


//        ad.notifyDataSetChanged();
    }
}

