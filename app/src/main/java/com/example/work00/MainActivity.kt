package com.example.work00

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.work00.auto.Auto
import com.example.work00.databinding.ActivityMainBinding
import com.example.work00.factory.Factory.Companion.createCar
import com.example.work00.model.Coupet
import com.example.work00.model.Sedan
import com.example.work00.model.Universal

open class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        thiser()
    }

    private fun thiser() {
        val vitrins = arrayListOf<Creatable<Auto>>()

        binding.btnCoupe.setOnClickListener {
            val car: Coupet = createCar(Coupet(binding.etNameAuto.text.toString(), ""))
            vitrins.add(car)
            Toast.makeText(this, car.brand, Toast.LENGTH_LONG).show()
        }

        binding.btnSedan.setOnClickListener {
            val car1: Sedan = createCar(Sedan(binding.etNameAuto.text.toString(), ""))
            vitrins.add(car1)
            Toast.makeText(this, car1.brand, Toast.LENGTH_LONG).show()
        }

        binding.btnUni.setOnClickListener {
            val car2: Universal = createCar(Universal(binding.etNameAuto.text.toString(), ""))
            vitrins.add(car2)
            Toast.makeText(this, car2.brand, Toast.LENGTH_LONG).show()
        }
    }

    private fun work() {
        val car: Coupet = createCar(Coupet("Coupe", ""))
        Toast.makeText(this, car.brand, Toast.LENGTH_LONG).show()
        val car1: Sedan = createCar(Sedan("Sedan", ""))
        Toast.makeText(this, car1.brand, Toast.LENGTH_LONG).show()
        val car2: Universal = createCar(Universal("Universal", ""))
        Toast.makeText(this, car2.brand, Toast.LENGTH_LONG).show()
    }
}