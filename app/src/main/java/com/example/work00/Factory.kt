package com.example.work00


class Factory {
    companion object {
        fun <T : Auto> createCar(carModel: T): T {
            // return createCar(brand, type) as T
            return carModel
        }

        fun <Car : Auto> demo(car: Creatable<Car>): Creatable<Auto> {
            return car
        }
    }
}

