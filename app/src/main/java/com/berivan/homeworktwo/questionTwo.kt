package com.berivan.homeworktwo

import java.util.Scanner

fun main(){

    val scanner=Scanner(System.`in`)
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
    println("Listeyi İsme Göre Sırala-> ${names.sorted()}")
    println("lütfen Aramak İstediğiniz ismi Giriniz:")
    val isim=scanner.next()
    if(isim!=null&& isim in names){

        println("İsim Dizi Listesinde Bulunuyor!-> $isim ")
        val opposite=isim.reversed()
        println("İsmin Tersten Yazılışı->$opposite")
       val uppercase=isim.uppercase()
        println("Harflerin büyük olaması Durumu->$uppercase")

    }else{

        println("isim listede bulunmuyor!")

    }






}