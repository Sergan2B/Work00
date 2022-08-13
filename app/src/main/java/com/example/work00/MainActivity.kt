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
        val vitrins = arrayListOf<Creatable>()

        val car : Coupet = createCar(Coupet("22222", ""))

       // val demo = demo(CarModel("Sergan", ""))
        val demo1: Sedan = demo(CarModel("123", "")) as Sedan
        val demo3: Coupet = demo(CarModel("asca", "")) as Coupet

        if (car != null) {
            vitrins.add(car)
            Toast.makeText(this, car.brand, Toast.LENGTH_SHORT).show()
         //   Toast.makeText(this, demo.brand, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, demo1.brand, Toast.LENGTH_SHORT).show()
            Toast.makeText(this, demo3.brand, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "bad", Toast.LENGTH_SHORT).show()
        }
    }
}