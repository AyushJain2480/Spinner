package com.example.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

/* Spinners -> spinners are used to let the user to choose btw many different values
   The behaviour of spinner is same as the radioGroup but if you have many different values like country name
   than radioGroup would be a bad choice because button will take more space on the screen and spinner solve that problem
   becuase it is drop down view which will show all available options with scrollbar attached */

class MainActivity : AppCompatActivity() {

    private lateinit var spMonths : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spMonths = findViewById(R.id.spinner)


        val customList = listOf("First","Second","Third","Fourth")
        val adapter = ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,customList)
        spMonths.adapter = adapter


        spMonths.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(adapterView : AdapterView<*>?, view : View?, position : Int, p3: Long) {
               Toast.makeText(this@MainActivity,
                   "You selected ${adapterView?.getItemAtPosition(position)}",Toast.LENGTH_SHORT).show()
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {


            }
        }
    }
}