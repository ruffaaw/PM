package com.example.lab555

import StudentAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val studentRecyclerView = findViewById<RecyclerView>(R.id.studentRecyclerView)

        val students = ArrayList<Student>()
        students.add(Student("Rafal", "Ciupek"))
        students.add(Student("Anna", "Franczyk"))
        students.add(Student("Bartek", "Fiejdasz"))

        val adapter = StudentAdapter(students)
        studentRecyclerView.layoutManager = LinearLayoutManager(this)
        studentRecyclerView.adapter = adapter
    }
}


class Student(val name: String, val lastname: String) {
    override fun toString(): String {
        return "$name $lastname"
    }
}