package com.berivan.homeworktwo

data class Student(val name: String, val age: Int, val school: String)

fun main() {

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    var minAgeStudent: Student? = null
    var maxAgeStudent: Student? = null

    for ((index, student) in students.withIndex()) {
        if (minAgeStudent == null || student.age < minAgeStudent.age) {
            minAgeStudent = student
        }
        if (maxAgeStudent == null || student.age > maxAgeStudent.age) {
            maxAgeStudent = student

        }
    }

    println("En küçük yaşa sahip öğrenci: ${minAgeStudent?.name}, indeks: ${students.indexOf(minAgeStudent)}")
    println("En büyük yaşa sahip öğrenci: ${maxAgeStudent?.name}, indeks: ${students.indexOf(maxAgeStudent)}")


    val filteredStudents = students.filter { it.school == "Üniversite A" }

    println("Listede school değeri Üniversite A olan öğrenciler:")
    filteredStudents.forEach { println(it.name) }
    val over25 = filteredStudents.filter { it.age > 25 }
    val under25 = filteredStudents.filter { it.age <= 25 }

    println("Yaşları 25'ten büyük olan öğrenciler:")
    over25.forEach { println(it.name) }

    println("\nYaşları 25'ten küçük veya 25'e eşit olan öğrenciler:")
    under25.forEach { println(it.name) }
}
















