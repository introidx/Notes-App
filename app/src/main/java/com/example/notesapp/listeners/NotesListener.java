package com.example.notesapp.listeners;

import com.example.notesapp.entity.Note;

public interface NotesListener {
    void onNotesClicked(Note note, int position);

}
