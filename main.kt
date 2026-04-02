// Kotlin -> Javanın moderni
// Daha az kodla aynı işi yapabilen versiyon.

// Entrypoint => Giriş noktası
fun main() 
{
    // Scope => Kapsama alanı 
    println("Hello")

    // Değişkenler
    // Programın akışında tanımlanan ramde tutulan ve tanımlanan isimle erişilebilen, değeri değişebilen değer(ler).
    var a: Int = 5 // a ismine 5 değerini atadık.
    println(a)
    // int => integer => tam sayı

    var name: String = "Halit" // String (metinsel)
    println(name)

    val b: Int = 10 // Immutable => Değiştirilemez
    println(b)

    a = 6
    println(a)
    //b=11
    println(b)

    // Null Safety = Varsayılan davranış non-nullable'dır. Yani null değer atanamaz.
    // ? => Bu alan null olabilir.
    var surname: String? = "Kalaycı"
    surname = null
    println(surname)
}