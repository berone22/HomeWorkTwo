package com.berivan.homeworktwo

import java.util.Scanner

fun main(){
    val scanner=Scanner(System.`in`)

   val newArrayLis= ArrayList<String>()
    newArrayLis.add("Selma")
    newArrayLis.add("Ali")
    newArrayLis.add("Fatma")
    newArrayLis.add("Buse")
    newArrayLis.add("Sezen")
    println(newArrayLis.toString())


    println("lütfen İsimleri Girdiğiniz İSimleri aralarına Virgül kullanarak giriniz!")
    val isimler=scanner.nextLine()
    val names=isimler.split(",").map { it.trim() }
    if (names.size!=3){
        println("Hatalı Giriş Yaptınız Lütfen Üç İsim Giriniz!")
        return
    }
    println("Girilen İsimler:")
    names.forEach { println(it) }
    println(names.isEmpty())
    newArrayLis.add(names.toString())
    println(newArrayLis.toString())


















}