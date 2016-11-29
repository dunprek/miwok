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


public class FamilyFragment extends Fragment{


    private RecyclerView recyclerView;
    private ColorsAdapter mAdapter;


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

        prepareFamilyData();

        return rootView;
    }


    private void prepareFamilyData() {
        ArrayList<Colors> models = new ArrayList<>();
        models.add(new Colors(R.string.family_eng_father,R.string.family_mi_father,R.mipmap.family_father,R.raw.family_father));
        models.add(new Colors(R.string.family_eng_mother,R.string.family_mi_mother,R.mipmap.family_mother,R.raw.family_mother));
        models.add(new Colors(R.string.family_eng_son,R.string.family_mi_son,R.mipmap.family_son,R.raw.family_son));
        models.add(new Colors(R.string.family_eng_daughter,R.string.family_mi_daughter,R.mipmap.family_daughter,R.raw.family_daughter));
        models.add(new Colors(R.string.family_eng_older_brother,R.string.family_mi_older_brother,R.mipmap.family_older_brother,R.raw.family_older_brother));
        models.add(new Colors(R.string.family_eng_younger_brother,R.string.family_eng_younger_brother,R.mipmap.family_younger_brother,R.raw.family_younger_brother));
        models.add(new Colors(R.string.family_eng_older_sister,R.string.family_mi_older_sister,R.mipmap.family_older_sister,R.raw.family_older_sister));
        models.add(new Colors(R.string.family_eng_younger_sister,R.string.family_mi_younger_sister,R.mipmap.family_younger_sister,R.raw.family_younger_sister));
        models.add(new Colors(R.string.family_eng_grandmother,R.string.family_mi_grandmother,R.mipmap.family_grandmother,R.raw.family_grandmother));
        models.add(new Colors(R.string.family_eng_grandfather,R.string.family_mi_grandfather,R.mipmap.family_grandfather,R.raw.family_grandfather));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models,R.color.colorFamily);
        recyclerView.setAdapter(mAdapter);
    }
}

