package iak.don.beginner.miwok.ui.fragment;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import java.util.ArrayList;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.adapter.ColorsAdapter;
import iak.don.beginner.miwok.model.Colors;

public class ColorsFragment extends Fragment  {
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
        final ArrayList<Colors> models = new ArrayList<>();
        models.add(new Colors(R.string.colors_eng_red,R.string.colors_mi_red,R.mipmap.color_red,R.raw.color_red));
        models.add(new Colors(R.string.colors_eng_green,R.string.colors_mi_green,R.mipmap.color_green,R.raw.color_green));
        models.add(new Colors(R.string.colors_eng_brown,R.string.colors_mi_brown,R.mipmap.color_brown,R.raw.color_brown));
        models.add(new Colors(R.string.colors_eng_gray,R.string.colors_mi_gray,R.mipmap.color_gray,R.raw.color_gray));
        models.add(new Colors(R.string.colors_eng_black,R.string.colors_mi_black,R.mipmap.color_black,R.raw.color_black));
        models.add(new Colors(R.string.colors_eng_white,R.string.colors_mi_white,R.mipmap.color_white,R.raw.color_white));
        models.add(new Colors(R.string.colors_eng_dusty_yellow,R.string.colors_mi_dusty_yellow,R.mipmap.color_dusty_yellow,R.raw.color_dusty_yellow));
        models.add(new Colors(R.string.colors_eng_mustard_yellow,R.string.colors_mi_mustard_yellow,R.mipmap.color_mustard_yellow,R.raw.color_mustard_yellow));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models,R.color.colorColors);
        recyclerView.setAdapter(mAdapter);

    }


}
