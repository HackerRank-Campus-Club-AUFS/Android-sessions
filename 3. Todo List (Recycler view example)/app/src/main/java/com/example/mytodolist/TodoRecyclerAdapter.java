package com.example.mytodolist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TodoRecyclerAdapter extends RecyclerView.Adapter<TodoRecyclerAdapter.ViewHolder> {
    private ArrayList<Todo> todos;

    public TodoRecyclerAdapter() {
        this.todos = new ArrayList<>();
    }

    public void addTodo(Todo todo){
        todos.add(todo);
        notifyDataSetChanged();
    }

    public void deleteFinishedTodos(){
        ArrayList<Todo> finishedTodos = new ArrayList<>();
        for (Todo todo:todos) {
            if (todo.isFinished()){
                finishedTodos.add(todo);
            }
        }
        todos.removeAll(finishedTodos);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.todo_list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView todoItemTitle = holder.getTodoItemTitle();
        CheckBox todoItemIsFinished = holder.getTodoItemIsFinished();

        Todo currentTodo = todos.get(position);

        todoItemTitle.setText(currentTodo.getTitle());
        todoItemIsFinished.setChecked(currentTodo.isFinished());
        todoItemIsFinished.setOnClickListener(v -> {
            boolean reverseState = !currentTodo.isFinished();
            currentTodo.setFinished(reverseState);
        });
    }

    @Override
    public int getItemCount() {
        return todos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mTodoItemTitle;
        CheckBox mTodoItemIsFinished;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTodoItemTitle = itemView.findViewById(R.id.todo_item_title_text_view);
            mTodoItemIsFinished = itemView.findViewById(R.id.todo_item_is_finished_check_box);
        }

        public TextView getTodoItemTitle() {
            return mTodoItemTitle;
        }

        public CheckBox getTodoItemIsFinished() {
            return mTodoItemIsFinished;
        }
    }
}
