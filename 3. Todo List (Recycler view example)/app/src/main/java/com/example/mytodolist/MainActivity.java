package com.example.mytodolist;

import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView todoRecycler = findViewById(R.id.todo_list);
        EditText todoTitleEditText = findViewById(R.id.todo_title_edit_text);
        Button addButton = findViewById(R.id.add_button);
        Button deleteButton = findViewById(R.id.delete_button);

        TodoRecyclerAdapter todoRecyclerAdapter = new TodoRecyclerAdapter();
        todoRecycler.setAdapter(todoRecyclerAdapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this);
        todoRecycler.setLayoutManager(linearLayoutManager);

        addButton.setOnClickListener(v -> {
            String inputTitle = todoTitleEditText.getText().toString();
            Todo newTodo = new Todo(inputTitle,false);
            todoRecyclerAdapter.addTodo(newTodo);
            todoTitleEditText.setText("");
        });

        deleteButton.setOnClickListener(v -> {
            todoRecyclerAdapter.deleteFinishedTodos();
        });
    }
}