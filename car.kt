class Car {
    // içi boş bir yeni tür oluşturduk.
    // Property => Özellik
    var brand: String = "";
    var model: String = "";
    var year: Int = 0;
}
// Bir kalıp

fun main() {
    // O kalıptan türeyen örnekler
    var car1: Car = Car() // Classlardan üretilen her bir örneğe (instance) denir. car1 bir instance'dır.
    car1.brand = "BMW"
    car1.model = "M3"
    car1.year = 2020
    println(car1)

    // O kalıptan türeyen örnekler
    var car2: Car = Car() 
    car2.brand = "Mercedes"
    car2.model = "C200"
    car2.year = 2021
    println(car2)

    // Veritabanı işlemleri class
    // İş kodları, validasyon yapan class
    // Bir nesneyi temsil eden class

    var name: String = "Halit";
    println("Merhaba $name")
}