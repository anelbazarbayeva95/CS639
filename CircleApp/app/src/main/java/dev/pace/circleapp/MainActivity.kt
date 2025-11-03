package dev.pace.circleapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radiusInput = findViewById<EditText>(R.id.radiusInput)
        val resultText = findViewById<TextView>(R.id.resultText)
        val calculateButton = findViewById<Button>(R.id.calculateButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener {
            radiusInput.text.clear()
            resultText.text = "Area = "
        }
        calculateButton.setOnClickListener {
            val radiusStr = radiusInput.text.toString().trim()

            if (radiusStr.isEmpty()) {
                Toast.makeText(this, "Please enter a radius", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val radius = radiusStr.toDoubleOrNull()
            if (radius == null || radius <= 0.0) {
                Toast.makeText(this, "Enter a valid non-negative number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val area = Math.PI * radius * radius
            resultText.text = "Area = %.2f".format(area)
        }
    }
}