package com.example.treker;

import androidx.cardview.widget.CardView;

import com.example.treker.elements.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
