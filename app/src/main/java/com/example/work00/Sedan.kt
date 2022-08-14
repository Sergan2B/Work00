package com.example.work00

class Sedan(override var brand: String, override var type: String) : Auto(), Creatable<Auto> {
}