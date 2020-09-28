package com.example.notetoself;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogNewNote extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.dialog_new_note,null);

        final EditText editTitle = view.findViewById(R.id.editTitle);
        final EditText editDescription = view.findViewById(R.id.editDescription);

        final CheckBox checkBoxIdea = view.findViewById(R.id.checkBoxIdea);
        final CheckBox checkBoxTodo = view.findViewById(R.id.checkBoxTodo);
        final CheckBox checkBoxImportant = view.findViewById(R.id.checkBoxImportant);

        Button buttonOk = view.findViewById(R.id.btnOk);
        Button buttonCancel = view.findViewById(R.id.btnCancel);

        builder.setView(view)
                .setMessage("Add a new note");

        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();
            }
        });

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Note myNote = new Note();
                myNote.setmTitle(editTitle.getText().toString());
                myNote.setmDescription(editDescription.getText().toString());
                myNote.setmIdea(checkBoxIdea.isChecked());
                myNote.setmTodo(checkBoxTodo.isChecked());
                myNote.setmImportant(checkBoxImportant.
                        isChecked());

                MainActivity activity = (MainActivity) getActivity();
                activity.createNewNote(myNote);

                dismiss();
            }
        });
        return builder.create();
    }
}


