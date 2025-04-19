import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class LibrarySystem {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "12345");
        Member member1 = new Member("John", 1);

        Transaction.borrowBook(book1, member1);
        Transaction.returnBook(book1, member1);
    }
}