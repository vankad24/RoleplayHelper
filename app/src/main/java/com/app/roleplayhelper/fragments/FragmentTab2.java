package com.app.roleplayhelper.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.roleplayhelper.MainActivity;
import com.app.roleplayhelper.R;
import com.app.roleplayhelper.adapters.InventoryAdapter;

public class FragmentTab2 extends Fragment {
    Button plus_money, minus_money, plus_hp, minus_hp;
    EditText money, hp;

    RecyclerView recyclerInventory;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MainActivity mainActivity = (MainActivity) getActivity();
        View root = inflater.inflate(R.layout.fragment_tab2, container, false);

        recyclerInventory = root.findViewById(R.id.recycler_inventory);
        recyclerInventory.setLayoutManager(new LinearLayoutManager(root.getContext()));
        recyclerInventory.setAdapter(new InventoryAdapter(mainActivity.inventoryItems));

        plus_hp = root.findViewById(R.id.plus_hp);
        minus_hp = root.findViewById(R.id.minus_hp);
        plus_money = root.findViewById(R.id.plus_money);
        minus_money = root.findViewById(R.id.minus_money);
        money = root.findViewById(R.id.text_money);
        hp = root.findViewById(R.id.text_hp);


        plus_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hp.setText(String.valueOf( Integer.parseInt(hp.getText().toString())+1 ));
            }
        });

        minus_hp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hp.setText(String.valueOf( Integer.parseInt(hp.getText().toString())-1 ));
            }
        });

        plus_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                money.setText(String.valueOf( Integer.parseInt(money.getText().toString())+1 ));
            }
        });

        minus_money.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                money.setText(String.valueOf( Integer.parseInt(money.getText().toString())-1 ));
            }
        });




        return root;
    }

}