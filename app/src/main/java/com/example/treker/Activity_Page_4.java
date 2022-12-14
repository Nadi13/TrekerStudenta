package com.example.treker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.treker.model.Subject;
import com.example.treker.adapter.SubjectAdapter;

import java.util.ArrayList;
import java.util.List;


public class Activity_Page_4 extends AppCompatActivity {

    RecyclerView subjectRecycler;
    SubjectAdapter subjectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);

        List<Subject> subjectList = new ArrayList<>();
        subjectList.add(new Subject(1, "Практикум по программированию", "8:00\n9:40", "02.10.2022", "ПЗ"));
        subjectList.add(new Subject(2, "Физическая культура и спорт", "9:40\n11:10","05.11.2022", "ПЗ"));
        subjectList.add(new Subject(3, "Математический анализ", "8:00\n9:30", "10.11.2022", "ПЗ"));
        subjectList.add(new Subject(4, "Иностранный язык", "11:35\n13:05","11.12.2022", "ПЗ"));
        subjectList.add(new Subject(5, "Математический анализ", "8:00\n9:30", "12.12.2022", "Л"));
        subjectList.add(new Subject(6, "Иностранный язык", "9:40\n11:10", "15.12.2022", "ПЗ"));

        setSubjectRecycler(subjectList);
    }

    private void setSubjectRecycler(List<Subject> subjectList) {

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        subjectRecycler = findViewById(R.id.subjectRecycler);
        subjectRecycler.setLayoutManager(layoutManager);

        subjectAdapter = new SubjectAdapter(this, subjectList);
        subjectRecycler.setAdapter(subjectAdapter);
    }
}