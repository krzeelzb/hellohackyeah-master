package com.example.kb.hackyeaaah;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.firebase.*;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by ela on 29.10.17.
 */

public class AddNote extends AppCompatActivity {
    public DatabaseReference mRef;


    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formularz);
        Button button3 = (Button) findViewById(R.id.button3);
        final EditText name = (EditText) findViewById(R.id.editTextImie);
        final EditText surname = (EditText) findViewById(R.id.editTextNazwisko);
        final EditText phonenumber = (EditText) findViewById(R.id.editTextPhoneNumber);
        final EditText numerflat = (EditText) findViewById(R.id.editMIeszkanie);
        final EditText street = (EditText) findViewById(R.id.editAddress);
        final EditText numer = (EditText) findViewById(R.id.editDom);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Address adres=new Address(street.getText().toString(),numer.getText().toString(),numerflat.getText().toString());

//                Address.Builder adres = Address.builder();
//                adres.addStreet(street.getText().toString());
//                adres.addNumberOfHouse(numer.getText().toString());
//                adres.addNumberOfFlat(numerflat.getText().toString());
//                Address()=
                Form form = new Form(name.getText().toString(), surname.getText().toString(), phonenumber.getText().toString(),adres);
                //form.name = name.getText().toString();
               // name.setText(form.name+form.name);
                //startActivityForResult(intent, 1);
                //Form new_person = new Form();
                mRef = FirebaseDatabase.getInstance().getReference();
                mRef.child("form").push().setValue(form);

            }
        });


    }
}
