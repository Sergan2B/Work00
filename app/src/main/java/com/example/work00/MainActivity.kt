package com.example.work00

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.work00.Factory.Companion.createCar
import com.example.work00.Factory.Companion.demo

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        thiser()
    }

    private fun thiser() {
        val vitrins = arrayListOf<Creatable<Auto>>()
        val car : Coupet = createCar(Coupet("22222", ""))
        val car1 : Sedan = createCar(Sedan("dfaef", ""))
        val car2 : Universal = createCar(Universal("222xczvxv22", ""))
        vitrins.add(car)
        vitrins.add(car1)
        vitrins.add(car2)
        Toast.makeText(this, vitrins.size.toString(), Toast.LENGTH_SHORT).show()
    }
}