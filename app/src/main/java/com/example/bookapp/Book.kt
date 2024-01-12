package com.example.bookapp

data class AuthorDetails(val name: String, val age: Int, val booksPublished: Int)

fun main() {

    val authorOne = AuthorDetails("Thane", 21, 2)
    println("${authorOne.name} is a ${authorOne.age} year old author who has published ${authorOne.booksPublished} books\n")

    val myBook = Book()
    val customBook = Book("DoTA", "Thane", 2024)

    println(bookDetails(myBook))
    println(bookDetails(customBook))

}

fun bookDetails(book: Book){
    println("The title of the book is:${book.title} \n By:${book.author} \n Published on ${book.yearPublished} \n")
}
