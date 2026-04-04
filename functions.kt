fun main() {
    selamVer()
    selamVer()
    selamVer()
    selamVer()
    selamVer2("Atalay")
    selamVer2("Ahmet")
}

// Programlamada fonksiyon => 
// Bir işi birden fazla kez yapıyorsam => Tekrarlamak yerine, tek bir noktadan çağırmak doğrudur.

// Fonksiyonlar => Bir işi yapan, isimlendirilmiş bloklardır.

fun selamVer() {
    println("Merhaba")
}

// parametreler
fun selamVer2(isim:String) {
    println("Merhaba $isim")
}