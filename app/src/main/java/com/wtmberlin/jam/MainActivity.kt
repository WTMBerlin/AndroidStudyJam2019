package com.wtmberlin.jam

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var words = listOf(
        "Android Studio",
        "Android",
        "API",
        "APK",
        "Backend",
        "Bugs",
        "Classes and Objects",
        "Clean Code",
        "Client",
        "Cloud",
        "Committing",
        "Debugging",
        "Frontend",
        "GitHub",
        "Googling",
        "Hackathon",
        "If - Else - When",
        "Iterations",
        "Java",
        "Kotlin",
        "Lifecycle",
        "Merging",
        "Methods",
        "Mobile Apps",
        "Permissions",
        "Repeating Reminders",
        "Returns",
        "Server",
        "SharedPreferences",
        "Slack",
        "Sql & Databases",
        "StackOverflow",
        "Stand-up / Daily",
        "StudyJam",
        "Testing",
        "Variables",
        "XML"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.main_button).setOnClickListener {
            buttonClicked()
        }
    }

    private fun buttonClicked() {
        findViewById<TextView>(R.id.main_text).text = words.random()
    }
}
