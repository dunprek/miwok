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

public class PhrasesFragment extends Fragment{

    private RecyclerView recyclerView;
    private ColorsAdapter mAdapter;
    public PhrasesFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_phrases, container, false);
        recyclerView = (RecyclerView) rootView.findViewById(R.id.rvPhrases);
        preparePhrasesData();
        return rootView;
    }
    private void preparePhrasesData() {
        ArrayList<Colors> models = new ArrayList<>();
        models.add(new Colors(R.string.phrases_eng_where_are_you,R.string.phrases_mi_where_are_you,R.raw.phrase_where_are_you_going));
        models.add(new Colors(R.string.phrases_eng_what_is_your,R.string.phrases_mi_what_is_your,R.raw.phrase_what_is_your_name));
        models.add(new Colors(R.string.phrases_eng_my_name_is,R.string.phrases_mi_my_name_is,R.raw.phrase_my_name_is));
        models.add(new Colors(R.string.phrases_eng_how_are_you,R.string.colors_mi_red,R.raw.phrase_how_are_you_feeling));
        models.add(new Colors(R.string.phrases_eng_feeling_good,R.string.phrases_mi_how_are_you,R.raw.phrase_im_feeling_good));
        models.add(new Colors(R.string.phrases_eng_are_you,R.string.phrases_mi_are_you,R.raw.phrase_are_you_coming));
        models.add(new Colors(R.string.phrases_eng_yes_im,R.string.phrases_mi_yes_im,R.raw.phrase_im_coming));
        models.add(new Colors(R.string.phrases_eng_im_coming,R.string.phrases_mi_im_coming,R.raw.phrase_yes_im_coming));
        models.add(new Colors(R.string.phrases_eng_lets_go,R.string.phrases_mi_lets_go,R.raw.phrase_lets_go));
        models.add(new Colors(R.string.phrases_eng_come_here,R.string.phrases_mi_come_here,R.raw.phrase_come_here));

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new ColorsAdapter(getActivity().getApplicationContext(),models,R.color.colorPhrases);
        recyclerView.setAdapter(mAdapter);
    }
}
