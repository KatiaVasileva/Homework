package Homework12;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public Book(String bookName, int publishingYear) { // у книги может не быть автора, например, Библия
        this(bookName, null, publishingYear);
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        if (publishingYear < 1445 || publishingYear > LocalDate.now().getYear()) {
            System.out.println("Введен недействительный параметр <год издания>: " + publishingYear);
            return;
        }
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return bookName + ", " + author + ", год издания: " + publishingYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author);
    }
}