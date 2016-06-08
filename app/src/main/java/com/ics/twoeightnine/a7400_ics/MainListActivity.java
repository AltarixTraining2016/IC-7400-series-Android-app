package com.ics.twoeightnine.a7400_ics;


import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainListActivity extends ListActivity {

    public ArrayList<Item> list;
    public CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        loadItems();
        adapter = new CustomAdapter(this, list);
        setListAdapter(adapter);

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Item item = (Item) adapter.getItem(position);
        Toast.makeText(this, "yeah)0)", Toast.LENGTH_SHORT).show();
    }

    private void loadItems(){
        list = new ArrayList<Item>();
        //appending from .db
        list.add(new Item("7400", "quad 2-input NAND gate", 1));
        list.add(new Item("7400", "quad 2-input NAND gate", 1));
        list.add(new Item("7400", "quad 2-input NAND gate", 1));
        list.add(new Item("7400", "quad 2-input NAND gate", 1));
    }
}
