package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ListView list_item = (ListView) findViewById(R.id.list_item);

        String item[] = {"1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번", "11번", 
                "12번", "13번", "14번", "15번", "16번", "17번", "18번", "19번", "20번"};

        ArrayAdapter<String> list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, item);
        list_item.setAdapter(list);

        list_item.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                long idea = 1+parent.getItemIdAtPosition(position);
                parent.getPositionForView(view);
                Toast.makeText(MainActivity2.this, idea+"번", Toast.LENGTH_SHORT).show();
            }
        });

    }
}