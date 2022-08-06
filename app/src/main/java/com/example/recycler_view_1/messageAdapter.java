package com.example.recycler_view_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class messageAdapter extends RecyclerView.Adapter<messageAdapter.define> {

    Context context;
    List<MessageModel> list;

    public messageAdapter(Context context, List<MessageModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public define onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.main_layout, parent, false);
        return new define(view);
    }

    @Override
    public void onBindViewHolder(@NonNull define holder, int position) {

        holder.message.setText(list.get(position).getMessage());
        holder.person.setText(list.get(position).getName());
        holder.img.setImageResource(list.get(position).getPictureId());

        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, list.get(position).getName(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class define extends RecyclerView.ViewHolder {

        ImageView img;
        TextView person;
        TextView message;

        public define(@NonNull View itemView) {
            super(itemView);

            img = (ImageView) itemView.findViewById(R.id.picture);
            person = (TextView) itemView.findViewById(R.id.person);
            message = (TextView) itemView.findViewById(R.id.mess);
        }
    }
}
