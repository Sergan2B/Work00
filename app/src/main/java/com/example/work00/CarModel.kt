package com.example.work00

open class CarModel(override var brand: String, override var type: String) : Auto(), Source<Auto> {
}