package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView.OnItemSelectedListener

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)

        /* Step 1: Populate this array */
        //val numberArray = IntArray(50)
        val tempArray = arrayOf<Int>(50)

        for ( i in 0 .. 50 ) {

            //val numberArray = IntArray(50)
            tempArray[i] = i * 2
        }

        //for ( i in 0 .. 50 ) {

            //val numberArray = IntArray(50)
            //numberArray[i] = i * 2
        //}


        /* Step 2: Create adapter to display items from array in Spinner */

        //var temp = 0

        val numAdapter = ArrayAdapter ( this, android.R.layout.simple_dropdown_item_1line, tempArray);

        spinner.adapter = numAdapter



            //ArrayAdapter...


        // Step 3: Change TextView's text size to the number selected in the Spinner */


        spinner.onItemSelectedListener = object: OnItemSelectedListener
        { override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long)
            { p0?.run { val color = getItemAtPosition(p2).toString()
                        val size = getItemAtPosition(p2).toString()
                        displayTextView.textSize = size.toFloat()
                        }
            }


            //override fun OnNothingSelected (p0 : AdapterView<*>?) {p0?.setSelection(0)}
            //public abstract fun onNothingSelected(p0: AdapterView<*>!): Unit defined in android.widget.AdapterView.OnItemSelectedListener
            override fun onNothingSelected(p0: AdapterView<*>?)
                { //showToast()}
                }




        }

    }
}