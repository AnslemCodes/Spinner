package com.example.spinnaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity  implements AdapterView.OnItemSelectedListener{

   @Override
  protected void onCreate(Bundle savedInstanceState)

   {
     super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

       //Spinner element
       Spinner stateSpinner = (Spinner) findViewById(R. id. States_spinner);

       Spinner lgaSpinner = (Spinner) findViewById(R. id. LG_spinner);

       //Spinner click listener
       stateSpinner .setOnItemSelectedListener( this );
       lgaSpinner.setOnItemSelectedListener(this);



       // Spinner Drop down elements
       List <String> State = new ArrayList<String>();
       State .add( "Abia");
       State .add("Adamawa");
       State .add("Anambra");
       State .add( "Akwa Ibom");
       State .add("Bauchi");
       State .add("Bayelsa");
       State .add("Benue");
       State .add("Borno");
       State .add("Cross River");
       State .add("Delta");
       State .add("Ebonyi");
       State .add( "Enugu");
       State .add("Edo");
       State .add("Ekiti");
       State .add( "FCT - Abuja");
       State .add( "Gombe");
       State .add("Imo");
       State .add("Jigawa");
       State .add( "Kaduna");
       State .add("Kano");
       State .add("Katsina");
       State .add("Kebbi");
       State .add("Kogi");
       State .add("Kwara");
       State .add("Lagos");
       State .add("Nasarawa");
       State .add("Niger");
       State .add("Ogun");
       State .add("Ondo");
       State .add("Osun");
       State .add("Oyo");
       State .add("Plateau");
       State .add("Rivers");
       State .add("Sokoto");
       State .add("Taraba");
       State .add("Yobe");
       State .add("Zamfara");

       // Creating adapter for spinner
       ArrayAdapter <String> stateAdapter = new ArrayAdapter<String>( this,android.R.layout.simple_spinner_item, State);

       //Drop down layout style - list view with radio button
       stateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       //attaching data adapter to spinner
       stateSpinner .setAdapter(stateAdapter);



       // Spinner Drop down elements for LG

       List<String> LGA = new ArrayList<String>();

       LGA .add("Abak");
       LGA .add("Eastern Obolo");
       LGA .add("Eket");
       LGA .add("Esit-Eket");
       LGA .add("Essien Udim");
       LGA .add("Etim-Ekpo");
       LGA .add("Etinan");
       LGA .add("Ibeno");
       LGA .add("Ibesikpo-Asutan");
       LGA .add("Ibiono-Ibom");
       LGA .add("Ika");
       LGA .add("Ikono");
       LGA .add("Ikot Abasi");
       LGA .add("Ikot Ekpene");
       LGA .add("Ini");
       LGA .add("Itu");
       LGA .add("Mbo");
       LGA .add("Mkpat-Enin");
       LGA .add("Nsit-Atai");
       LGA .add("Nsit-Ibom");
       LGA .add("Nsit-Ubium");
       LGA .add("Obot-Akara");
       LGA .add("Okobo");
       LGA .add("Onna");
       LGA .add("Oron");
       LGA .add("Oruk Anam");
       LGA .add("Ukanafun");
       LGA .add("Udung-Uko");
       LGA .add("Uruan");
       LGA .add("Urue-Offong/Oruko");
       LGA .add("Uyo");

       // Creating adapter for spinner

       ArrayAdapter<String> lgaAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, LGA);

       // Drop down layout style - list view with radio button

       lgaAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       // attaching data adapter to spinner

       lgaSpinner. setAdapter(lgaAdapter);





   }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
    {
        // On Selecting a spinner item

        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast .makeText(parent.getContext(), "Selected: "+ item, Toast .LENGTH_LONG). show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent)
    {
        //TODO Auto-generated method stub




    }


}
