package com.example.kotlin

// import => başka bir package içeriğini tanımak
import com.example.kotlin.models.Car

fun main() {
    // O kalıptan türeyen örnekler
    var car1: Car = Car() // Classlardan üretilen her bir örneğe (instance) denir. car1 bir instance'dır.
    car1.brand = "BMW"
    car1.model = "M3"
    car1.year = 2020
    car1.rent()
    println(car1)

    // O kalıptan türeyen örnekler
    var car2: Car = Car() 
    car2.brand = "Mercedes"
    car2.model = "C200"
    car2.year = 2021
    car2.rent()
    println(car2)

    // Veritabanı işlemleri class
    // İş kodları, validasyon yapan class
    // Bir nesneyi temsil eden class

    var name: String = "Halit";
    println("Merhaba $name")
}