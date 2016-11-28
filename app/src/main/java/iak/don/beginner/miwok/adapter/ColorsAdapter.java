package iak.don.beginner.miwok.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import iak.don.beginner.miwok.R;
import iak.don.beginner.miwok.model.Colors;


/**
 * Created by don on 11/29/2016.
 */
public class ColorsAdapter extends RecyclerView.Adapter<ColorsAdapter.ViewHolder> {
    private Context context;
    private List<Colors> data;


    public ColorsAdapter(Context context, List<Colors> data) {
        this.context = context;
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvMiwok;
        TextView tvEnglish;
        ImageView iv;

        public ViewHolder(View view) {
            super(view);
            tvMiwok = (TextView) itemView.findViewById(R.id.tvEn);
            tvEnglish = (TextView) itemView.findViewById(R.id.tvMi);
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        View viewItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_menu, viewGroup, false);
        return new ViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.tvMiwok.setText(data.get(position).getMiwok());
        viewHolder.tvEnglish.setText("Rp " + data.get(position).getEnglish());


    }
}


