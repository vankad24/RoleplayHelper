package com.app.roleplayhelper;

import android.os.Bundle;
import android.widget.Toast;

import com.app.roleplayhelper.utils.InventoryItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.app.roleplayhelper.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    public ArrayList<InventoryItem> inventoryItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.tab1, R.id.tab2, R.id.tab3, R.id.tab4, R.id.tab5)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_activity_main);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(binding.navView, navController);

        inventoryItems = new ArrayList<>();
        inventoryItems.add(new InventoryItem("Хрень","Описание хрени", 23, 2.1f ));
        inventoryItems.add(new InventoryItem("Хрень2","Описание хрени", 4, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень3","Описание хрени", 6, 2f ));
        inventoryItems.add(new InventoryItem("Хрень длинная","Описание очень очень очень очень очень очень длинной хрени", 24, .1f ));
        inventoryItems.add(new InventoryItem("Хрень4","Описание хрени", 4, 3.1f ));
        inventoryItems.add(new InventoryItem("Хрень5","Описание хрени", 7, 3.1f ));
        inventoryItems.add(new InventoryItem("Хрень6","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень9","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень10","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень11","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень12","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень13","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень14","Описание хрени", 1, 7.1f ));
        inventoryItems.add(new InventoryItem("Хрень15","Описание хрени", 1, 7.1f ));

    }


}