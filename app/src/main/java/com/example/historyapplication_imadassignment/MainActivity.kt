package com.example.historyapplication_imadassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enterage = findViewById<EditText>(R.id.enterage)
        val btnenter = findViewById<Button>(R.id.btnenter)
        val celebinfo = findViewById<TextView>(R.id.celebinfo)
        val btnclear = findViewById<Button>(R.id.btnClear)
        val iVHistoryBook= findViewById<ImageView>(R.id.iVHistoryBook)
        //https://za.pinterest.com/pin/22377329391825833/
        val library= findViewById<ImageView>(R.id.library)
        //https://za.pinterest.com/pin/675962225333303236/
        val blankpage= findViewById<ImageView>(R.id.blankpage)
        //https://www.freepik.com/free-photo/grunge-paper-background_5203416.htm#query=old%20paper&position=3&from_view=keyword&track=ais&uuid=bdb90e9e-26f4-43c2-a56f-69c00032f820

        btnenter.setOnClickListener {
            btnclear.setOnClickListener{
                enterage.text.clear()
                celebinfo.text = ""
            }
            val age = enterage.text.toString()
            val ageText = enterage.text.toString()
            if (!ageText.isNullOrEmpty()) {
                val age = ageText.toInt()
                val name = if (age in 20..28) {
                    "Rapper and social rights activist Tupac Shakur,who was killed at the age of 25"
                    //https://www.history.com/this-day-in-history/tupac-shakur-dies
                } else if (age in 29..36) {
                    "Politician and singer Bob Marley, who died from melanoma at the age of 36"
                    //https://www.biography.com/musicians/a46803099/how-did-bob-marley-die
                } else if (age in 37..44) {
                    "Singer and social rights activist , John Lennon , who was murdered at the age of 40"
                    //https://www.britannica.com/biography/John-Lennon
                } else if (age in 45..52) {
                    "Musician and grammy winner Whitney Housten who drowned at the age of 48"
                    //https://www.britannica.com/biography/Whitney-Houston
                } else if (age in 53..60) {
                    "Austrian painter and German leader ,Adolf Hitler who passed at age 56 from suicide"
                    //https://www.britannica.com/biography/Adolf-Hitler
                } else if (age in 61..68) {
                    "Famous ruler of Mongolia , Genghis khan , who was killed in battle at the age of 65"
                    //https://www.history.com/this-day-in-history/genghis-khan-dies
                } else if (age in 69..76) {
                    "Author Roald Dahl , famous for his brilliant children's books . Died at age 74"
                    //https://www.history.com/this-day-in-history/childrens-author-roald-dahl-is-born
                } else if (age in 77..84) {
                    "Physicist and mathematician , sir Isaac Newton , who died at the age of 84"
                    //https://www.britannica.com/biography/Isaac-Newton
                } else if (age in 85..92) {
                    "American civil rights activist Rosa parks who died at the age of 92"
                    //https://www.britannica.com/biography/Rosa-Parks
                } else if (age in 93..100)
                    "The first black president of South Africa , Nelson Mandela who died at the age of 95"
                //https://www.britannica.com/biography/Nelson-Mandela
                else {
                    "Invalid age , please enter an age between 20 - 100 years"
                }
                celebinfo.text = name
            } else {
                celebinfo.text = "Please enter an age"
            }
        }
    }
    }