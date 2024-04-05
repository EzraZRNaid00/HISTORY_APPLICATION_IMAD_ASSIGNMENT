IMAD ASSIGNMENT
ESSAY

For our first imad assignment we were given the challenge to design and create a mobile application based on a given criteria. If successful, this application would allow a user to input an age between 20-100 years and then this user would subsequently be given an output text of a historical figure who had passed away around the inserted age. Let's dive into the code step by step, unravelling how it operates, the thought behind how it was designed, and the process of how I developed it. 

The coding of this application was done on Android Studio which is the official integrated development environment for the development of Android applications (Android developers)   
. It utilizes the Android software development kit to create a mobile application. The entire application was coded in the language of Kotlin due to the requirements of the criteria.

GitHub's centre capability lies in its sturdy model management system, based on Git. Version manage permits coders to see modifications made to their code over time, facilitating seamless collaboration amongst a couple of builders. By using branches, builders can collaborate on remoted functions or fixes with out affecting the principle codebase, thereby minimizing conflicts and making sure code integrity. Moreover, GitHub gives effective gear for code review, difficulty tracking, and venture management, allowing groups to coordinate efficiently and keep extraordinary requirements at some point of the improvement lifecycle.

The code begins the package name , `com.example.historyapplication_imadassignment`, as that is what I named my assignment, it then proceeds with the declarations and necessary imports. This is so my variables are identified and given the necessary functions.

	package com.example.historyapplication_imadassignment

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


The MainActivity represents where the code would be translated from the activity main.

class MainActivity : AppCompatActivity() {


The `onCreate` method is called when the application is first created. Here, the layout is initialized and the UI components are bound to variables.

@SuppressLint("MissingInflatedId")
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // UI Component Initialization
    val enterage = findViewById<EditText>(R.id.enterage)
    val btnenter = findViewById<Button>(R.id.btnenter)
    val celebinfo = findViewById<TextView>(R.id.celebinfo)
    val btnclear = findViewById<Button>(R.id.btnClear)
    val iVHistoryBook= findViewById<ImageView>(R.id.iVHistoryBook)
    val library= findViewById<ImageView>(R.id.library)
    val blankpage= findViewById<ImageView>(R.id.blankpage)

- `enterage`, `btnenter`, `celebinfo`, `btnclear`, `iVHistoryBook`, `library`, and `blankpage` are variables representing user interface elements such as EditText, Button, and TextView.
- They are initialized by finding the corresponding views using `findViewById`.
- `R.layout.activity_main` refers to the layout XML file defining the UI components for the activity.

 Button Click Listeners

Two click listeners are set for buttons: `btnenter` and `btnclear`. 

btnenter.setOnClickListener {
    btnclear.setOnClickListener{
        enterage.text.clear()
        celebinfo.text = ""
    }

- `btnenter` is associated with a lambda function that gets executed when the button is clicked.
- Inside this lambda, another click listener is set for `btnclear`. This listener clears the EditText field and resets the TextView `celebinfo` to an empty string.

Age Determination and Historical Figures

The core logic of the application lies within the `btnenter` click listener, where historical figures are associated with specific age ranges based on user input.

val age = enterage.text.toString()
val ageText = enterage.text.toString()
if (!ageText.isNullOrEmpty()) {
    val age = ageText.toInt()
    val name = if (age in 20..28) {
        "Rapper and social rights activist Tupac Shakur,who was killed at the age of 25"
        // URL: https://www.history.com/this-day-in-history/tupac-shakur-dies
    } else if (age in 29..36) {
        "Politician and singer Bob Marley, who died from melanoma at the age of 36"
        // URL: https://www.biography.com/musicians/a46803099/how-did-bob-marley-die
    } else if (age in 37..44) {
        "Singer and social rights activist , John Lennon , who was murdered at the age of 40"
        // URL: https://www.britannica.com/biography/John-Lennon
    } else if (age in 45..52) {
        "Musician and grammy winner Whitney Housten who drowned at the age of 48"
        // URL: https://www.britannica.com/biography/Whitney-Houston
    } else if (age in 53..60) {
        "Austrian painter and German leader ,Adolf Hitler who passed at age 56 from suicide"
        // URL: https://www.britannica.com/biography/Adolf-Hitler
    } else if (age in 61..68) {
        "Famous ruler of Mongolia , Genghis khan , who was killed in battle at the age of 65"
        // URL: https://www.history.com/this-day-in-history/genghis-khan-dies
    } else if (age in 69..76) {
        "Author Roald Dahl , famous for his brilliant children's books . Died at age 74"
        // URL: https://www.history.com/this-day-in-history/childrens-author-roald-dahl-is-born
    } else if (age in 77..84) {
        "Physicist and mathematician , sir Isaac Newton , who died at the age of 84"
        // URL: https://www.britannica.com/biography/Isaac-Newton
    } else if (age in 85..92) {
        "American civil rights activist Rosa parks who died at the age of 92"
        // URL: https://www.britannica.com/biography/Rosa-Parks
    } else if (age in 93..100)
        "The first black president of South Africa , Nelson Mandela who died at the age of 95"
    // URL: https://www.britannica.com/biography/Nelson-Mandela
    else {
        "Invalid age , please enter an age between 20 - 100 years"
    }
    celebinfo.text = name
} else {
    celebinfo.text = "Please enter an age"
}


Explanation:

- The age is retrieved from the `EditText` field and stored in `ageText`.
- If the `ageText` is not empty, it's converted to an integer.
- Based on the age, a historical figure associated with that age range is determined.
- The information about the historical figure is stored in `name` variable.
- The text of `celebinfo` TextView is set to display information about the historical figure.
- If the age is empty, it prompts the user to enter an age.

I retrieved images linked in the assignment to add flare to my application and motivate users to make use of the application. I decided to use and image of an animated library to imply the knowledge. I then added the necessary buttons, i.e. the clear button to clear the edit text and age input when clicked and the search button to retrieve the information of the entered age. The entered age will display in a text view which I strategically placed over an image of an antique page to add to the historical aesthetic.

BIBLIOGRAPHY

Android Developers. Android app development| google android studio .Available at : https://developer.android.com/studio?gad_source=1&gclid=CjwKCAjwwr6wBhBcEiwAfMEQs7WfLkGNka1tnBb2dZEgdZIgDM9HOHvpxUqYP5G7A_WuTuNF4KZsGBoCuN0QAvD_BwE&gclsrc=aw.ds [accessed 1 April 2024]

2024.Introduction to Mobile application development.IMAD5112/d/p/w.Module manual. available at : 2024https://advtechonline.sharepoint.com/sites/TertiaryStudents/IIE%20Student%20Materials/Forms/Default%20View.aspx?id=%2Fsites%2FTertiaryStudents%2FIIE%20Student%20Materials%2FNew%20Student%20Materials%20CAT%2FIMAD5112%2F2024%2FIMAD5112MM%2Epdf&viewid=db15e059%2D4f93%2D487f%2Dabda%2De538b821c7b8&parent=%2Fsites%2FTertiaryStudents%2FIIE%20Student%20Materials%2FNew%20Student%20Materials%20CAT%2FIMAD5112%2F2024

Kotlin Foundation, 2022c.Null safety.[Online] Available at: 
https://kotlinlang.org/docs/null-safety.html [1 April 2024].


