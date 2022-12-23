package Homework12;

import java.time.LocalDate;
import java.util.Objects;

public class Library {
    private final Book[] books;
    private int size;

    public Library(int arraySize) {
        this.books = new Book[arraySize];
    }

    public void addBook(String bookName, String authorName, String authorSurname, int publishingYear) {
        checkPublishingYear(publishingYear);
        if (size >= books.length) {
            System.out.println("Невозможно добавить книгу, все ячейки заняты.");
        }
        Author newAuthor = new Author(authorName, authorSurname);
        Book newBook = new Book(bookName, newAuthor, publishingYear);
        books[size++] = newBook;
    }

    public void printAllBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

    public void printInfoAboutBook(String bookName) {
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (Objects.equals(book.getBookName(), bookName)) {
                System.out.println(bookName + " by " + book.getAuthor()
                        + " was published in " + book.getPublishingYear() + ".");
            }
        }
    }

    public void changePublishingYear(String bookName, int publishingYear) {
        checkPublishingYear(publishingYear);
        for (int i = 0; i < size; i++) {
            Book book = books[i];
            if (Objects.equals(book.getBookName(), bookName)) {
                book.setPublishingYear(publishingYear);
                System.out.println(book);
            }
        }
    }

    //    Блок проверки передаваемых параметров
    public void checkPublishingYear(int publishingYear) {
        if (publishingYear < 1445 || publishingYear > LocalDate.now().getYear()) {
            throw new IllegalArgumentException("Введен недействительный параметр <год издания>: " + publishingYear);
        }
    }
}
