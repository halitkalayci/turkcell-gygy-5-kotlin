package com.example.kotlin.models
// Her dosya bir paketin altında tanımlanır.

// eğer belirtilmediyse public
class Car {
    // içi boş bir yeni tür oluşturduk.
    // Property => Özellik
    var brand: String = "";
    var model: String = "";
    var year: Int = 0;

    fun rent() {
        println("$brand $model araba kiralandi.") // Classın fonksiyonu => classın alanlarına erişebiliriz.
    }
}
// Bir kalıp
