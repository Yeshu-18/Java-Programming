package library.members;

import library.books.Book;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int memberId;
    private List<Book> borrowedBooks = new ArrayList<>();

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
        System.out.println(name + " borrowed: " + book.getTitle());
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
        System.out.println(name + " returned: " + book.getTitle());
    }
}