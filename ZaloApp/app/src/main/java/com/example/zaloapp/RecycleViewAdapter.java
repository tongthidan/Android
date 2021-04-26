package com.example.zaloapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecycleViewAdapter extends RecyclerView.Adapter<PersonViewHolder> {
    ArrayList<Person> mPerson = new ArrayList<>();

    public RecycleViewAdapter(ArrayList<Person> people) {
        mPerson= people;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View contactView = inflater.inflate(R.layout.item_message,parent,false);
        PersonViewHolder viewHolder = new PersonViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {

        Person p = mPerson.get(position);
        holder.imageView.setImageResource(p.getImg());
        holder.textViewTitle.setText(p.getTitle());
        holder.textViewContent.setText(p.getContent());
        holder.textViewTime.setText(p.getTime());
    }

    @Override
    public int getItemCount() {
        return mPerson.size();
    }
    void subList(ArrayList<Person> people){
        mPerson.clear();
        mPerson.addAll(people);
        notifyDataSetChanged();
    }
}
