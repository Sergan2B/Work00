package com.example.work00.factory

import com.example.work00.auto.Auto

class Factory {
    companion object {
        // Фабричный метод c использованием Generic
        fun <T : Auto> createCar(carModel: T): T {
            return carModel
        }

        /*fun <Car : Auto> demo(car: Creatable<Car>): Creatable<Auto> {
            return car
        }*/
    }
}

