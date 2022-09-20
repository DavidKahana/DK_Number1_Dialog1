package com.example.dk_number1_dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {

    RadioGroup rg;
    Dialog d;
    Button btnDate , btnGender , btnConfirm , btnSave;
    EditText etfn , etln , city;

    boolean male;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnDate = (Button) findViewById(R.id.btnDate);
        btnGender = (Button)findViewById(R.id.btnGender);
        btnSave = (Button)findViewById(R.id.btnGender);



        etfn = (EditText) findViewById(R.id.etfn);
        etln = (EditText) findViewById(R.id.etln);
        city = (EditText) findViewById(R.id.city);

        btnDate.setOnClickListener(this);
        btnGender.setOnClickListener(this);
        btnSave.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v==btnDate)
        {
            Calendar systemCalender = Calendar.getInstance();
            int year = systemCalender.get(Calendar.YEAR);
            int month = systemCalender.get(Calendar.MONTH);
            int day = systemCalender.get(Calendar.DAY_OF_MONTH);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this,new SetDate(),year,month,day);
            datePickerDialog.show();

        }
        if (v == btnGender){
            createLoginDialog();
        }
        if (v == btnConfirm){

            String string;
            if (male) {
                string = "Male";
            }
            else{
                string = "Female";
            }
            btnGender.setText(string);
            Toast.makeText(MainActivity.this,"You selected : " + string,Toast.LENGTH_LONG).show();

            d.dismiss();
        }
        if(v == btnSave){

        }

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {


        if(checkedId==R.id.rbMale){
            male = true;
        }
        else{
            male = false;
        }
    }

    public  class SetDate implements DatePickerDialog.OnDateSetListener
    {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            monthOfYear = monthOfYear +1;

            String str = "You selected :" + dayOfMonth + "/" + monthOfYear +"/" + year;
            Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
            btnDate.setText(str);

        }
    }
    public void createLoginDialog()
    {


        d= new Dialog(this);
        d.setContentView(R.layout.gender);
        d.setTitle("Login");
        d.setCancelable(true);

        rg = (RadioGroup)d.findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(this);


        btnConfirm = (Button)d.findViewById(R.id.btnConfirm);
        btnConfirm.setOnClickListener(this);

        d.show();

    }
}