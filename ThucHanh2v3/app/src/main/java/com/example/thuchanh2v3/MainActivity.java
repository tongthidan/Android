package com.example.thuchanh2v3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.thuchanh2v3.Model.Student;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private EditText editName;
    TextView  editID;
    RadioButton radioButtonFemale,radioButtonMale;
    RadioGroup radioGroup;
    Button btnAdd, btnRemove, btnChooseDate;
    LinearLayout linearLayoutAddNew;
    RecyclerView recyclerView;
    ArrayList<Student> mStudents = new ArrayList<>();
    StudentAdapter adapter;
    boolean isAdd = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getView();
        getData();
        setRecyclerView();
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStudents.remove(mStudents.size()-1);
                adapter.notifyDataSetChanged();

            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isAdd){
                    linearLayoutAddNew.setVisibility(View.VISIBLE);
                    btnAdd.setText("Save");
                    adapter.notifyDataSetChanged();
                    isAdd = true;
                }
                else{
                    String name = editName.getText().toString();
                    RadioButton genderSelect = findViewById(R.id.radio_male);
                    String gender = genderSelect.getText().toString();
                    String dob = btnChooseDate.getText().toString();
                    String id = editID.getText().toString();
                    mStudents.add(new Student(R.drawable.anh1,id,name,gender,dob));
                    adapter.notifyDataSetChanged();

                    linearLayoutAddNew.setVisibility(View.GONE);
                    btnAdd.setText("Add");
                    isAdd = false;

                }
            }

        });


        btnChooseDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("AppLog","Click");
           datePicker();
            }
        });

    }
    String date_time ="";
    int mYear, mMonth, mDay;
    void datePicker(){
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {

                    @Override
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        date_time = dayOfMonth + "-" + (monthOfYear + 1) + "-" + year;

                        btnChooseDate.setText(date_time);

                    }
                }, mYear, mMonth, mDay);
        datePickerDialog.show();
    }

    void getView(){
        editID = findViewById(R.id.editID);
        editName = findViewById(R.id.editName);
        btnAdd = findViewById(R.id.btnAdd);
        btnRemove = findViewById(R.id.btnRemove);
        btnChooseDate = findViewById(R.id.btnChoose);
        recyclerView = findViewById(R.id.rev);
        linearLayoutAddNew = findViewById(R.id.linearAddNew);
        radioButtonFemale = findViewById(R.id.radio_female);
        radioButtonMale = findViewById(R.id.radio_male);

    }
    void getData(){
        mStudents.add(new Student(R.drawable.anh1,"1","Dan","Female","12-4-1999"));
        mStudents.add(new Student(R.drawable.anh2,"2","Dan","Female","12-4-1999"));
        mStudents.add(new Student(R.drawable.anh3,"4","Dan","Female","12-4-1999"));
        mStudents.add(new Student(R.drawable.anh1,"5","Dan","Female","12-4-1999"));
        mStudents.add(new Student(R.drawable.anh2,"6","Dan","Female","12-4-1999"));
        mStudents.add(new Student(R.drawable.anh3,"7","Dan","Female","12-4-1999"));


    }
    void setRecyclerView(){
        adapter = new StudentAdapter(mStudents);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}