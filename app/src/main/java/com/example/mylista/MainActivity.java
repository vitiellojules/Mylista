package com.example.mylista;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<MyDataModel> dataList = generateData();
        MyAdapter adapter = new MyAdapter(this, dataList);

        recyclerView.setAdapter(adapter);
    }

    private List<MyDataModel> generateData() {
        List<MyDataModel> dataList = new ArrayList<>();
        dataList.add(new MyDataModel("Item 1"));
        dataList.add(new MyDataModel("Item 2"));
        dataList.add(new MyDataModel("Item 3"));


        return dataList;
    }
}
