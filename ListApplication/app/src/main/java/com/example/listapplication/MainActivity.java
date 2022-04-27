package com.example.listapplication;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    private String bans[];
   private ArrayAdapter<String> adapterBans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bans = new String[]{"МИХАЙЛОВ!!!!", "Зелековский", "Антонова", "Полукарова", "Поликарпов"};
        adapterBans = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, bans);
        setListAdapter(adapterBans);

    }

    @Override
    protected void onListItemClick(ListView listView, View v, int position, long id){
        super.onListItemClick(listView, v, position, id);
        String message = (String) getListAdapter().getItem(position);
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        bans[1] = "АНТОНОВА!!!!";
        bans[2] = "Зелековский";
        adapterBans.notifyDataSetInvalidated();
    }
}