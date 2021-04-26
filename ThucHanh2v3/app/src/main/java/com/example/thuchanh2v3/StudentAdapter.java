package com.example.thuchanh2v3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.thuchanh2v3.Model.Student;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    public ArrayList<Student> mStudents = new ArrayList<>();
    public StudentAdapter(ArrayList<Student> students){
        mStudents = students;
    }
    @NonNull
    @Override

    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.item_student,parent,false);
        StudentViewHolder viewHolder = new StudentViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = mStudents.get(position);
        holder.imageView.setImageResource(student.getImage());
        holder.textViewID.setText(student.getId());
        holder.textViewName.setText(student.getName());
        holder.textViewGender.setText(student.getGender());
        holder.textViewDob.setText(student.getDob());
    }

    @Override
    public int getItemCount() {
        return mStudents.size();
    }
    void subList(ArrayList<Student>students){
        mStudents.clear();
        mStudents.addAll(students);
        notifyDataSetChanged();
    }
}
