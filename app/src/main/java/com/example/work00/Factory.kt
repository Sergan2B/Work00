package com.example.work00


class Factory {
    companion object {
        fun <T : Auto> createCar(carModel: T): T {
            // return createCar(brand, type) as T
            return carModel
        }

        fun <Car : Auto> demo(car: Source<Car>): Source<Auto> {
            val objects: Source<Auto> = car // !!! Not allowed in Java
            // ...
            return objects
        }
    }
}

