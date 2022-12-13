package Homework12;

import java.time.LocalDate;

public class Book {
    private final String bookName;
    Author author;
    int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1900 || publishingYear > LocalDate.now().getYear()) {
            System.out.println("Введен недействительный параметр <год издания>: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }
}