package com.example.treker.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.treker.R;
import com.example.treker.TaskData;
import com.example.treker.TasksViewHolder;

import java.util.Collections;
import java.util.List;

public class TaskDataAdapter extends RecyclerView.Adapter<TasksViewHolder> {
    List<TaskData> taskList;

    Context context;
    //ClickListener listener;

    public TaskDataAdapter(List<TaskData> list, Context context/*, ClickListener listener*/){
        taskList = list;
        this.context = context;
        //this.listener = listener;
    }

    @Override
    public TasksViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        Context context = parent.getContext();
        LayoutInflater layout = LayoutInflater.from(context);

        View taskView = layout.inflate(R.layout.task_element, parent, false);

        TasksViewHolder viewHolder = new TasksViewHolder(taskView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final TasksViewHolder viewHolder, final int position){
        //final int index = viewHolder.getAdapterPosition();
        viewHolder.subjectName.setText(taskList.get(position).subjectName);
        viewHolder.taskName.setText(taskList.get(position).taskName);
        viewHolder.dateString.setText(taskList.get(position).dateString);
        viewHolder.menuButton.setImageResource(R.drawable.points);
        viewHolder.timeString.setText(taskList.get(position).timeString);

        if (taskList.get(position).reminderStatus) viewHolder.reminderStatus.setImageResource(android.R.drawable.ic_lock_idle_alarm);
        /*viewHolder.view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                listener.onClick(index);
            }
        });*/
    }

    @Override
    public int getItemCount(){
        return taskList.size();
    }
}

class ClickListener{
    public void onClick(int index){

    }
}
