package com.example.treker.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.treker.R;
import com.example.traker.model.Subject;

import java.util.List;

public class SubjectAdapter extends RecyclerView.Adapter<SubjectAdapter.SubjectViewHolder> {

    Context context;
    List<Subject> subjects;

    public SubjectAdapter(Context context, List<Subject> subjects) {
        this.context = context;
        this.subjects = subjects;
    }

    @NonNull
    @Override
    public SubjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View subjectItems = LayoutInflater.from(context).inflate(R.layout.subject_item, parent, false);
        return new SubjectViewHolder(subjectItems);
    }

    @Override
    public void onBindViewHolder(@NonNull SubjectViewHolder holder, int position) {
        holder.subjectTitle.setText(subjects.get(position).getTitle());
        holder.subjectTime.setText(subjects.get(position).getTime());
        holder.subjectData.setText(subjects.get(position).getData());
        holder.subjectKind.setText(subjects.get(position).getKind());
    }

    @Override
    public int getItemCount() {
        return subjects.size();
    }

    public static final class SubjectViewHolder extends RecyclerView.ViewHolder{

        TextView subjectTitle;
        TextView subjectTime;
        TextView subjectData;
        TextView subjectKind;

        public SubjectViewHolder(@NonNull View itemView) {
            super(itemView);

            subjectTitle = itemView.findViewById(R.id.subjectTitle);
            subjectTime = itemView.findViewById(R.id.subjectTime);
            subjectData = itemView.findViewById(R.id.subjectData);
            subjectKind = itemView.findViewById(R.id.subjectKind);
        }
    }

}