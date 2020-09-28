package com.example.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogShowNote extends DialogFragment {

    private Note mNote;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_show_note,null);
        TextView txtTitle = view.findViewById(R.id.txtTitle);
        TextView txtDescription = view.findViewById(R.id.txtDescription);
        txtTitle.setText(mNote.getmTitle());
        txtDescription.setText(mNote.getmDescription());

        TextView txtTodo = view.findViewById(R.id.textViewTodo);
        TextView txtIdea = view.findViewById(R.id.textViewIdea);
        TextView txtImportant = view.findViewById(R.id.textViewImportant);

        if(!mNote.isIdea()){
            txtIdea.setVisibility(View.GONE);
        }
        if(!mNote.isImportant()){
            txtImportant.setVisibility(View.GONE);
        }
        if(!mNote.isTodo()){
            txtTodo.setVisibility(View.GONE);
        }
        Button button = view.findViewById(R.id.button);
        builder.setView(view).setMessage("Your Note");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });
        return builder.create();
    }

    public void sendNoteSelected(Note note){
        mNote = note;
    }
}
