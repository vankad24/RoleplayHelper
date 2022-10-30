package com.app.roleplayhelper.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.roleplayhelper.R;
import com.app.roleplayhelper.utils.InventoryItem;

import java.util.ArrayList;

public class InventoryAdapter extends RecyclerView.Adapter<InventoryAdapter.InventoryViewHolder>{
    ArrayList<InventoryItem> inventoryItems;
    public InventoryAdapter(ArrayList<InventoryItem> items) {
        inventoryItems = items;
    }

    @NonNull
    @Override
    public InventoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.inventory_item, parent, false);
        return new InventoryViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull InventoryViewHolder holder, int position) {
        InventoryItem item = inventoryItems.get(position);

        holder.weight.setText(item.weight+" кг");
        holder.amount.setText(String.valueOf(item.amount));
        holder.description.setText(item.description);
        holder.name.setText(item.name);
    }

    @Override
    public int getItemCount() {
        return inventoryItems.size();
    }


    class InventoryViewHolder extends RecyclerView.ViewHolder {
        TextView name, amount, description, weight;
        public InventoryViewHolder(@NonNull View root) {
            super(root);
            name = root.findViewById(R.id.item_name);
            amount = root.findViewById(R.id.amount);
            description = root.findViewById(R.id.description);
            weight = root.findViewById(R.id.weight);
        }
    }
}
