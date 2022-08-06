package com.example.recycler_view_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MessageModel> list;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    messageAdapter adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        define();
        fillList();

    }

    private void define() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }


    private void fillList() {

        list = new ArrayList<>();

        MessageModel message1 = new MessageModel("Alekhine", "Hello! I'm Alekhine", R.drawable.alekhine);
        MessageModel message2 = new MessageModel("Botvinnik", "Hello! I'm Botvinnik", R.drawable.botvinnik);
        MessageModel message3 = new MessageModel("Fischer", "Hello! I'm Fischer", R.drawable.fischer);
        MessageModel message4 = new MessageModel("Steinitz", "Hello! I'm Steinitz", R.drawable.steinitz);
        MessageModel message5 = new MessageModel("Tal", "Hello! I'm Tal", R.drawable.tal);

        list.add(message1);
        list.add(message2);
        list.add(message3);
        list.add(message4);
        list.add(message5);

        adp = new messageAdapter(this, list);

        recyclerView.setAdapter(adp);

    }
}