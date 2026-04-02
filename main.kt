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
    println(surname?.length) // Güvenli kullanım (Nullsa yine null döner.)
    //println(surname!!.length) // Kullanıma zorlamak (NullPointerException riski)


    var nameSurname: String = "$name $surname ${20+5}" // String interpolation (Değişkenleri string içinde kullanmak)
    println(nameSurname)


    // Array => Diziler
    val numbers: Array<Int> = arrayOf(1,2,3,4,5)

    val students: Array<String> = arrayOf("Halit","Ahmet","Mehmet")
    //students.add("Ayşe") // Arrayler sabit boyutlu olduğu için add gibi bir fonksiyon yoktur.

    println(numbers[0]) // Index bazlı erişim
    println(students[2])
    students[2] = "Ayşe"
    println(students[2])

    // Listeler => Arraylere göre daha esnek ve gelişmiş yapılardır.

    // liste@456 = 1,2,3,4,5
    val numberList = listOf(1,2,3,4,5) // Immutable (değiştirilemez)
    //numberList.add(6)

    // liste@123 => 1,2,3,4,5
    val numberListMutable = mutableListOf(1,2,3,4,5) // Mutable (değiştirilebilir)
    numberListMutable.add(6)

    // Referans değişir , neden => yeni liste oluşur liste@789
    //numberListMutable = mutableListOf(7,8,9) // Yeni bir liste ataması yapabiliriz.

}