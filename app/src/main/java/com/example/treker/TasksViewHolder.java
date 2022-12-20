package com.example.treker;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class TasksViewHolder extends RecyclerView.ViewHolder {
    public TextView subjectName;
    public TextView taskName;
    public ImageView reminderStatus;
    public ImageView menuButton;
    public TextView dateString;
    public TextView timeString;
    //public View view;

    public TasksViewHolder(View itemView){
        super(itemView);
        subjectName = (TextView)itemView.findViewById(R.id.subjectName);
        taskName = (TextView)itemView.findViewById(R.id.taskName);
        reminderStatus = (ImageView)itemView.findViewById(R.id.reminderStatus);
        menuButton = (ImageView)itemView.findViewById(R.id.taskElementMenuButton);
        dateString = (TextView)itemView.findViewById(R.id.dateString);
        timeString = (TextView)itemView.findViewById(R.id.timeString);
        //view = itemView;
    }
}
