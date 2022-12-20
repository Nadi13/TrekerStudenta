package com.example.treker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Activity_Page_5 extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    TaskDataAdapter adapter;
    RecyclerView taskListView;
    //ClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page5);
        List<TaskData> taskList = new ArrayList<>();
        taskListView = (RecyclerView)findViewById(R.id.recyclerView);
        /*listener = new ClickListener(){
            @Override
            public void onClick(int index){
                Toast.makeText(Activity_Page_5.this, "kok", Toast.LENGTH_SHORT).show();
            }
        };*/
        taskList = getData();
        adapter = new TaskDataAdapter(taskList, this);
        taskListView.setLayoutManager(new LinearLayoutManager(Activity_Page_5.this));
        taskListView.setAdapter(adapter);
    }

    @Override
    public void onBackPressed(){
        super.onBackPressed();
    }

    private List<TaskData> getData(){
        List<TaskData> list = new ArrayList<>();
        list.add(new TaskData("qwq", "lul", true, "date", "time"));
        list.add(new TaskData("qwq", "lul", true, "date", "time"));
        list.add(new TaskData("sjadhgfj fsafbm awenbmf wnbe fnwea bf snd nbd nfad fwe fghwe fbaemf,d svdm ,aer kjb ,bw ,fnaebsd n,vdf v dg amnsf asmn", "wehjfvqekbr kbwerkk akbdf nad gnmbas mfhwerkjq wkbd a,nm smdf ,sda gshj gjhaweiwheifu suifh iushfakjfbeaf ewam f.,me fad;rag ,rae kg sremn rmn gansg ,angf", false, "date", "time"));
        list.add(new TaskData("qwq", "lul", false, "date", "time"));
        list.add(new TaskData("Математическая логика и всякие прочие штуки", "Доделать ломашнее задание, потому что да", true, "12.04.2022", "12:00"));
        list.add(new TaskData("qwq", "lul", false, "date", "time"));
        list.add(new TaskData("qwq", "lul", false, "date", "time"));
        return list;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}