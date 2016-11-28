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
        models.add(new Colors("abcd","hola",getActivity().getResources().getDrawable(R.mipmap.family_father) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_mother),getActivity().getString(R.string.family_mi_mother),getActivity().getResources().getDrawable(R.mipmap.family_mother) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_son),getActivity().getString(R.string.family_mi_son),getActivity().getResources().getDrawable(R.mipmap.family_son) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_daughter),getActivity().getString(R.string.family_mi_daughter),getActivity().getResources().getDrawable(R.mipmap.family_daughter) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_older_brother),getActivity().getString(R.string.family_mi_older_brother),getActivity().getResources().getDrawable(R.mipmap.family_older_brother) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_younger_brother),getActivity().getString(R.string.family_eng_younger_brother),getActivity().getResources().getDrawable(R.mipmap.family_younger_brother) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_older_sister),getActivity().getString(R.string.family_mi_older_sister),getActivity().getResources().getDrawable(R.mipmap.family_older_sister) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_younger_sister),getActivity().getString(R.string.family_mi_younger_sister),getActivity().getResources().getDrawable(R.mipmap.family_younger_sister) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_grandmother),getActivity().getString(R.string.family_mi_grandmother),getActivity().getResources().getDrawable(R.mipmap.family_grandmother) ));
        models.add(new Colors(getActivity().getString(R.string.family_eng_grandfather),getActivity().getString(R.string.family_mi_grandfather),getActivity().getResources().getDrawable(R.mipmap.family_grandfather) ));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models);
        recyclerView.setAdapter(mAdapter);
    }
}

