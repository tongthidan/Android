package com.example.zaloapp.Fragment;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import com.example.zaloapp.Person;
import com.example.zaloapp.R;
import com.example.zaloapp.RecycleViewAdapter;

import java.util.ArrayList;
import java.util.Calendar;

import static com.example.zaloapp.R.layout.fragment_message;

public class FragmentMessage extends Fragment {

    ImageView imageView;
    ArrayList<Person> mPerson = new ArrayList<>();
    EditText editTextTitle, editTextContent;
    Button btnDatePicker, btnSaveMessage;
    RecyclerView recyclerView;
    RecycleViewAdapter adapter;
    boolean isAdd = false;
    LinearLayout linearLayoutAddNew;
    Spinner spinnerAnh;

    public FragmentMessage() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewMessage =  inflater.inflate(fragment_message, container, false);
        spinnerAnh = viewMessage.findViewById(R.id.spinnerAnh);
        editTextTitle = viewMessage.findViewById(R.id.editTitle);
        editTextContent = viewMessage.findViewById(R.id.editContent);
        btnDatePicker = viewMessage.findViewById(R.id.btnDatePicker);
        btnSaveMessage = viewMessage.findViewById(R.id.btnSaveMessage);
        recyclerView = viewMessage.findViewById(R.id.rev);
        linearLayoutAddNew = viewMessage.findViewById(R.id.AddNewPerson);
        imageView= viewMessage.findViewById(R.id.avatar);
        getData();
        setRecyclerView();
        spinnerAnh.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        imageView.setImageResource(R.drawable.anh3);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.anh4);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.anh5);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.anh6);
                        break;
                    default:
                        imageView.setImageResource(R.drawable.anh3);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });
        btnDatePicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                datePicker();
            }
        });
        btnSaveMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isAdd){
                    linearLayoutAddNew.setVisibility(View.VISIBLE);
                    btnSaveMessage.setText("Save");
                    adapter.notifyDataSetChanged();

                    isAdd = true;


                }
                else{
                    btnSaveMessage.setText("Add");
                    Integer id = spinnerAnh.getId();
                    mPerson.add(new Person(id, editTextTitle.getText().toString(),
                            editTextContent.getText().toString(),btnDatePicker.getText().toString()));

                    btnSaveMessage.setText("Add");
                    linearLayoutAddNew.setVisibility(View.GONE);
                    adapter.notifyDataSetChanged();
                    isAdd= false;
                }
            }
        });
        return viewMessage;
    }
    public void getData(){
        mPerson.add(new Person(R.drawable.anh3,"ND1", "ND11111","1-1-2021"));
        mPerson.add(new Person(R.drawable.anh4,"ND1","ND11111","1-1-2021"));
        mPerson.add(new Person(R.drawable.anh5,"ND1","ND11111","1-1-2021"));
        

    }

    void setRecyclerView(){
        adapter = new RecycleViewAdapter(mPerson);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));//
    }


    String date_time ="";
    int mYear,mMonth,mDay;
    void datePicker(){
        final Calendar c = Calendar.getInstance();
        mYear = c.get(Calendar.YEAR);
        mMonth = c.get(Calendar.MONTH);
        mDay = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date_time = dayOfMonth +"- "+month +"- "+ year;
                        btnDatePicker.setText(date_time);
                    }
                },mYear,mMonth,mDay);
        datePickerDialog.show();
    }


}