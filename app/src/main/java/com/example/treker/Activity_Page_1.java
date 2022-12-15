package com.example.treker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_Page_1 extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        Button btnToSecAct_1 = (Button) findViewById(R.id.shedule);
        Button btnToSecAct_2 = (Button) findViewById(R.id.all_tasks);
        Button btnToSecAct_3 = (Button) findViewById(R.id.subjects);
        btnToSecAct_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Page_1.this, Activity_Page_2.class);
                startActivity(intent);
            }
        });
        btnToSecAct_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Page_1.this, Activity_Page_5.class);
                startActivity(intent);
            }
        });
        btnToSecAct_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_Page_1.this, Activity_Page_3.class);
                startActivity(intent);
            }
        });

    }

    public void ShowPopup(View v)
    {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()){
            case R.id.item_1:
                Toast.makeText(this, "режим редактирования", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.item_2:
                Toast.makeText(this, "задание удалено", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }
}