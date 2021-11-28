package com.unicap.pwm.appdebolamagica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val resp = arrayOf("Sim", "Não conte com isso!", "Não", "Talvez")
    val random = Random.Default

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            if(editTextTextPersonName.text.isEmpty()) {
                textView.text = "Faça uma pergunta"
            }
            else{
                val index:int = random.nextInt(until:4)
                textView.text = resp[index]
            }
        }
    }
}