package com.example.work00.model

import com.example.work00.Creatable
import com.example.work00.auto.Auto

class Universal(override var brand: String, override var type: String) : Auto(), Creatable<Auto> {
}