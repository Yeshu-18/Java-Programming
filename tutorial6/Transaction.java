package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public static void borrowBook(Book book, Member member) {
        member.borrowBook(book);
    }

    public static void returnBook(Book book, Member member) {
        member.returnBook(book);
    }
}