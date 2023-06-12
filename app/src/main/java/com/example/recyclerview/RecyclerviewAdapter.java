package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//this vieeholder is the viewholder that we have created(AT THE BOTTOM IN THIS CODE)
public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.Viewholder> {

    public RecyclerviewAdapter(List<String> namelist) {
        this.namelist = namelist;
    }

    List<String> namelist;

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view =  layoutInflater.inflate(R.layout.page_layout,parent,false);

        //VIEWHOLDER THAT WE HAVE CREATED
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.textview.setText(namelist.get(position));
    }

    @Override
    public int getItemCount() {
        return namelist.size();
    }


    //VIEW HOLDER THAT WE HAVE CREATED
    class Viewholder extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageview;
        TextView textview;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageview);
            textview = itemView.findViewById(R.id.textview);
            itemView.setOnClickListener(this);



            //to remove list on long press
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    namelist.remove(getAdapterPosition());
                    notifyItemRemoved(getAdapterPosition());
                    return true;
                }
            });
        }


        //To make a click handle on itemclick
        @Override
        public void onClick(View v) {
            Toast.makeText(v.getContext(), namelist.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();
        }
    }
}
