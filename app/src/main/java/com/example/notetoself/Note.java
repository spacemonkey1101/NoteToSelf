package com.example.notetoself;

public class Note {

        private String mTitle;
        private String mDescription;
        private boolean mIdea;
        private boolean mTodo;
        private boolean mImportant;

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public void setmIdea(boolean mIdea) {
        this.mIdea = mIdea;
    }

    public void setmTodo(boolean mTodo) {
        this.mTodo = mTodo;
    }

    public void setmImportant(boolean mImportant) {
        this.mImportant = mImportant;
    }

    public boolean isIdea(){
        return  mIdea;
    }

    public boolean isTodo(){
        return mTodo;
    }

    public boolean isImportant(){
        return mImportant;
    }
}
