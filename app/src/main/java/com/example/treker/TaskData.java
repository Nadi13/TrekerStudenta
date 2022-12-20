package com.example.treker;

public class TaskData {
    String subjectName;
    String taskName;
    boolean reminderStatus;
    String dateString;
    String timeString;

    TaskData(String subjectName,
             String taskName,
             boolean reminderStatus,
             String dateString,
             String timeString){
        this.subjectName = subjectName;
        this.taskName = taskName;
        this.reminderStatus = reminderStatus;
        this.dateString = dateString;
        this.timeString = timeString;
    }
}
