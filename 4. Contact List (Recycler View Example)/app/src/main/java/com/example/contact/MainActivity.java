package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    WhatsAppContactsListAdapter adapter;
    List<Contact> contactList;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addTestData();
        recyclerView=findViewById(R.id.recycler_view);
        adapter=new WhatsAppContactsListAdapter(contactList);
        layoutManager = new GridLayoutManager(this,2);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
    public void addTestData(){
        contactList=new ArrayList<>();
        contactList.add(new Contact("Mohamed","busy"));
        contactList.add(new Contact("Ahmed","Available"));
        contactList.add(new Contact("Mahmoud","busy"));
        contactList.add(new Contact("mostafa","busy"));
        for(int i=0;i<100;i++){
            contactList.add(new Contact("contanct "+i,"status "+i));
        }

    }

}