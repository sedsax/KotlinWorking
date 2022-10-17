fun main() {
 	var notlar = arrayListOf<ArrayList<Float>>()
    var ortalamalar = arrayListOf<Float>()
    var durumlar = arrayListOf<String>()
    
    notlar.add(arrayListOf(50f,40f,40f)) // Öğrenci1 in notları
    notlar.add(arrayListOf(100f,100f,90f)) // Öğrenci2 nin notları
    notlar.forEach{println(it)}
    notlar.add(arrayListOf(70f,30f,90f)) // Öğrenci3 ün notları
    notlar.add(arrayListOf(75f,60f,80f)) // Öğrenci4 ün notları
    
    for(i in 0..notlar.size-1) {
        var ortalama = notlar[i].reduce {b,s -> b+s}/notlar[i].size
        ortalamalar.add(ortalama)
    }
    ortalamalar.forEach{println(it)}
   
    durumlar = ortalamalar.map {
        if(it < 50) {"kaldı"}
        else{"geçti"}
    }as ArrayList<String>
    durumlar.forEach{println(it)}
    
    
    for(i in 0..notlar.size-1) {
        println("${i+1}. Öğrenci Notlar: ${notlar[i]}, Ortalama: ${ortalamalar[i]}, Geçme Durumu: ${durumlar[i]}")
    }
    
}


/*
-------------OUTPUT-----------

[50.0, 40.0, 40.0]
[100.0, 100.0, 90.0]
43.333332
96.666664
63.333332
71.666664
kaldı
geçti
geçti
geçti
1. Öğrenci Notlar: [50.0, 40.0, 40.0], Ortalama: 43.333332, Geçme Durumu: kaldı
2. Öğrenci Notlar: [100.0, 100.0, 90.0], Ortalama: 96.666664, Geçme Durumu: geçti
3. Öğrenci Notlar: [70.0, 30.0, 90.0], Ortalama: 63.333332, Geçme Durumu: geçti
4. Öğrenci Notlar: [75.0, 60.0, 80.0], Ortalama: 71.666664, Geçme Durumu: geçti

*/
