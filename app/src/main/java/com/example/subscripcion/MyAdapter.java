package com.example.subscripcion;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private List<dataClase> dataList;

    public MyAdapter(Context context, List<dataClase> dataList) {
        this.context = context;
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Glide.with(context).load(dataList.get(position).getDataImg()).into(holder.recImage);
        holder.recTitle.setText(dataList.get(position).getDataNombre());
        holder.recDesc.setText(dataList.get(position).getDataDesc());
        holder.recLang.setText(dataList.get(position).getDataPrec());

        holder.recCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context, Detalle.class);
                i.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImg());
                i.putExtra("Desciption", dataList.get(holder.getAdapterPosition()).getDataDesc());
                i.putExtra("Title", dataList.get(holder.getAdapterPosition()).getDataNombre());
                i.putExtra("Key", dataList.get(holder.getAdapterPosition()).getKey());
                i.putExtra("Languaje", dataList.get(holder.getAdapterPosition()).getDataPrec());
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void searchDataList(ArrayList<dataClase> searchList){
        dataList = searchList;
        notifyDataSetChanged();
    }


}
class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView recImage;

    TextView recTitle,recDesc,recLang;
    CardView recCard;

    public MyViewHolder(@NonNull View itemView){
        super(itemView);
        recCard = itemView.findViewById(R.id.reCard);
        recImage = itemView.findViewById(R.id.recImage);
        recTitle = itemView.findViewById(R.id.recTitle);
        recDesc = itemView.findViewById(R.id.recDesc);
        recLang = itemView.findViewById(R.id.recPriority);
    }
}

