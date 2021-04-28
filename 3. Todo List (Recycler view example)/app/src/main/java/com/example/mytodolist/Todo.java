package com.example.mytodolist;

public class Todo {
    private String title;
    private boolean isFinished;

    public Todo(String title, boolean isFinished) {
        this.title = title;
        this.isFinished = isFinished;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
