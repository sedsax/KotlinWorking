// Turkcell Geleceği Yazanlar Kotlin 201 dersinde Collections anlatılıyor ve kendi ben de sertifikamı almadan önce notlarımı eklemek istedim :)
// Unuttuğumda veya eksik kullanımlarımda faydalanabileceğim derli toplu güzel bir çalışma oldu :)<3

fun main() {
 	var array1 = arrayListOf<String>("a","b","c") // arrayOf tan farklı olarak dinamiktir, sonradan eleman eklenebilir.
    array1.add("d")
    println(array1[array1.size-1]) // array1.size = 4 yani eleman sayısını verir. son eleman 4. elemandır ve indexi 3 tür.
    
    for(i in 0..array1.size-1) {
        println("${i+1}. eleman array1[${i}] ${array1[i]}")
    }
    println("------------------------------------------------------------")
    for(a in array1) {
        println("${a} nın indexi ${array1.indexOf(a)}")
    }
    println("------------------------------------------------------------")
    var filtreliList = array1.filter {it.length > 0} // array1 deki her bir elemanın boyunun 0 dan büyüklüğünü kontrol ediyor.
    println(filtreliList.size) // 4 elemanın da boyu 1 olduğundan, 0 dan büyük olduğundan yeni listeye 4 elemanın sonucu da atıyor.
    // Peki kontrol sonuçlarını ne olarak kaydetti, filtreliList array Listesinin elemanları neler?
    for(f in filtreliList) {
        println(f) // yani array1 deki şartı sağlayan elemanları tutuyormuş
    }
     println("------------------------------------------------------------")
     //set yapısı
     var set1 = setOf<Int>(1,2,1,3,2,4,2,5) // normal bir array tanımlamış olsaydık elemanların aynı olmasını önemsemeden tutardı.
     set1.forEach {println(it)} // for döngüsüne almadan collections sonuna bu şekilde forEach ekleyerek döngüye alabiliyoruz.
     // forEach içinde bulunan "it" kavramı collections içindeki her bir elemanı temsil diyor. 
     // set yapısı, tekrarlanan elemanlardan sadece birisini tutar. Haliyle burdaki eleman sayısı 8 değil 5 tir.
     println("set1 collection ının eleman sayısı ${set1.size} tir.") // arrayOf' ta olduğu gibi sonradan eleman eklenemez.
     println("------------------------------------------------------------")
     //HashSet yapısı
     var hashSet1 = HashSet<Int>() // set1 deki aynı elemanları ekledim.Burda farklı olarak sonradan eleman ekleniyor.
     // set1' de olduğu gibi ilk başta veri eklediğimde çalışmadı, hata verdi, sebebini anlamadım. Sonradan ekleme yapalım.
     hashSet1.add(1) // evet böyle ekleyince çalıştı
     hashSet1.add(2)
     hashSet1.add(1)
     hashSet1.add(3)
     hashSet1.add(4)
     hashSet1.forEach{println(it)} // hashSet1 in her bir elemanını "it" ile geziyor.
     println("hashSet1 in eleman sayısı ${hashSet1.size}")
     println("------------------------------------------------------------")
     //HashMap (bazı programlama dillerinde "Dictionary" olarak da kullanılır)
     var hashMap1 = hashMapOf<String, String>() // ilk başta da ekleme yapılabilir
     hashMap1.put("Delivery","Teslimat")
     println(hashMap1["Delivery"])
     hashMap1["Delivery"] = "Teslim etme"
     println(hashMap1["Delivery"])
     hashMap1.put("Sufficient", "Yeterli")
     hashMap1.put("Restrict", "Kısıtlama")
     hashMap1.forEach{println(it)} // Delivery verisini ilk eklememe rağmen value sunu değiştirdiğim için sanırım en son yazdı.??
     println("---")
     var hashMap2 = hashMapOf<String,String>("Commence" to "Başlatmak", "Strive" to "Çabalamak", "Significant" to "Önemli")
     hashMap2.forEach{println(it)}
     hashMap2.put("Encourage", "Cesaretlendirmek")
     hashMap2.put("Adequate", "Yeterli")
     hashMap2.put("Encounter", "Karşılaşma, Raslantı")
     println("---")
     hashMap2.forEach{println(it)} // ekleme sırasıyla ya da value değiştirmeyle alakası yok sanırım, verilerin sırası farklı.
     println("---")
     hashMap2.forEach{println("${it.key} : ${it.value}")}
     println("---")
     hashMap2.put("Enough", "Yeterli")
     hashMap2.put("Sufficient", "Yeterli")
     var filtreliHash = hashMap2.filter { it.value == "Yeterli"}
     filtreliHash.forEach{println("${it.key} : ${it.value}")}
     
}


/*
-----------OUTPUT----------
d
1. eleman array1[0] a
2. eleman array1[1] b
3. eleman array1[2] c
4. eleman array1[3] d
------------------------------------------------------------
a nın indexi 0
b nın indexi 1
c nın indexi 2
d nın indexi 3
------------------------------------------------------------
4
a
b
c
d
------------------------------------------------------------
1
2
3
4
5
set1 collection ının eleman sayısı 5 tir.
------------------------------------------------------------
1
2
3
4
hashSet1 in eleman sayısı 4
------------------------------------------------------------
Teslimat
Teslim etme
Sufficient=Yeterli
Restrict=Kısıtlama
Delivery=Teslim etme
---
Significant=Önemli
Commence=Başlatmak
Strive=Çabalamak
---
Adequate=Yeterli
Significant=Önemli
Encourage=Cesaretlendirmek
Encounter=Karşılaşma, Raslantı
Commence=Başlatmak
Strive=Çabalamak
---
Adequate : Yeterli
Significant : Önemli
Encourage : Cesaretlendirmek
Encounter : Karşılaşma, Raslantı
Commence : Başlatmak
Strive : Çabalamak
---
Enough : Yeterli
Sufficient : Yeterli
Adequate : Yeterli


*/
