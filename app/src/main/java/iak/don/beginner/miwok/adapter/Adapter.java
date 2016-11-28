package iak.don.beginner.miwok.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.model.Model;

/**
 * Created by don on 11/27/2016.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Model> moviesList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title, year, genre;

        public MyViewHolder(View view) {
            super(view);
            title = (TextView) view.findViewById(R.id.title);
        }
    }


    public Adapter(List<Model> moviesList) {
        this.moviesList = moviesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_menu, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Model movie = moviesList.get(position);
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }
}
