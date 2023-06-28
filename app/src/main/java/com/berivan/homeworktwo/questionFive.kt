package com.berivan.homeworktwo

data class Workers(val name: String, var salary: Double)

fun main() {


    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )
    //Soru:Yukarıdaki işçiler listesini kullanarak her çalışana %35 zam yapın.
    //Cevap:1
    //Burada tüm Personelleri Listeledik.
    for ((indeks, i) in workers.withIndex()) {
        println("calışsan ${indeks + 1}.personel ${i.name} -> Maaş:${i.salary}")

    }
    println("**********************************")

    //zam miktarını belirledik.
    for (worker in workers) {
        val zamMiktari = worker.salary * 0.35
        worker.salary += zamMiktari
    }
    //zamlı mikranı for döngüsü içinde tüm personellere uyguladık.
    for ((indeks, worker) in workers.withIndex()) {
        println("Çalışanların Alacakları Zamlı Maaş-> ${indeks + 1}.personel: ${worker.name} -> Maaş:${worker.salary}")
    }

    println("********************************")
    println("Küçükten Büyüğe Sıralayın!")
    //Soru:Listeyi karıştırıp maaş değerine göre küçükten büyüğe sıralayın.
    //Cevap:2
    workers.shuffle()

    val sortedWorkers = workers.sortedBy { it.salary } // Maaşa göre sırala

    for (worker in sortedWorkers) {
        println("personel: ${worker.name} -> Maaş: ${worker.salary}")
    }
    //Soru:En yüksek ve en düşük maaş alanları konsola yazdırın.
    println("********************************")

    val highestSalaryWorker = workers.maxByOrNull { it.salary }
    val lowestSalaryWorker = workers.minByOrNull { it.salary }

    highestSalaryWorker?.let {
        println("En yüksek maaş alan işçi: ${it.name} -> ${it.salary}")
    }

    lowestSalaryWorker?.let {
        println("En düşük maaş alan işçi: ${it.name} -> ${it.salary}")


    }
    println("********************************")
//soru:Maaş ortalamasını hesaplayıp konsola yazdırın.
    val totalSalary = workers.sumByDouble { it.salary }
    val averageSalary = totalSalary / workers.size

    println("Maaş Ortalaması: $averageSalary")


}











