package com.example.contact;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class WhatsAppContactsListAdapter extends
        RecyclerView.Adapter<WhatsAppContactsListAdapter.ViewHolder>{

    List<Contact> items;
    public WhatsAppContactsListAdapter(List<Contact> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_whats_app_contact,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Contact contact = items.get(position);
        holder.name.setText(contact.getName());
        holder.status.setText(contact.getStatus());
    }

    @Override
    public int getItemCount() {
        if(items==null) return 0;
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView status;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            status = itemView.findViewById(R.id.status);
        }
    }
}
