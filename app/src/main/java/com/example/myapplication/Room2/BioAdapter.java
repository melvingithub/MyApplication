package com.example.myapplication.Room2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class BioAdapter extends RecyclerView.Adapter<BioAdapter.BioViewHolder> {

    private List<BioData> bioDataList=new ArrayList<>();

    public void setDate(List<BioData> bioData){
        this.bioDataList=bioData;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.note_item,parent,false);
        return new BioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BioViewHolder holder, int position) {
        BioData bioData=bioDataList.get(position);
        holder.name.setText(bioData.getName());
        holder.address.setText(bioData.getAddress());
        holder.age.setText(""+bioData.getAge());

    }

    @Override
    public int getItemCount() {
        return bioDataList.size();
    }

    public static class BioViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView address;
        TextView age;

        public BioViewHolder(@NonNull View itemView) {
            super(itemView);

            name=itemView.findViewById(R.id.text_view_title);
            address=itemView.findViewById(R.id.text_view_description);
            age=itemView.findViewById(R.id.text_view_priority);
        }
    }
}
