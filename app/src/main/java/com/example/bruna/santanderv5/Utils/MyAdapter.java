package com.example.bruna.santanderv5.Utils;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bruna.santanderv5.Model.Fund.Info;
import com.example.bruna.santanderv5.R;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<Info> infos;
    private Context context;


    public MyAdapter(ArrayList<Info> infos, Context context) {
        this.infos = infos;
        this.context = context;
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fund_items, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Info info  = infos.get(position);
        holder.textViewTaxa.setText(info.getName());
        holder.textViewValor.setText(info.getData());


    }

    @Override
    public int getItemCount() {

        if (infos != null) {
            return infos.size();
        }else {
            return 0;
        }

    }

     class ViewHolder extends RecyclerView.ViewHolder  {
        TextView textViewTaxa;
        TextView textViewValor;

        ViewHolder(View itemView) {
            super(itemView);

            textViewTaxa = itemView.findViewById(R.id.tvName);
            textViewValor = itemView.findViewById(R.id.tvData);

        }

    }

//    void setClickListener(ItemClickListener itemClickListener) {
//        this.mClickListener = itemClickListener;
//    }
//
//    public interface ItemClickListener {
//        void onItemClick(View view, int position);
//    }


}
