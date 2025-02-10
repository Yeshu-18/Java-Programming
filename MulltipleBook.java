import java.util.HashSet;

public class MulltipleBook {
    private int bookID;
    private String title;
    private String authorName;
    //private static HashSet<MulltipleBook> bookAvailability = new HashSet<>();
    
    public MulltipleBook(int bookID, String title, String authorName) {
        this.bookID = bookID;
        this.title = title;
        this.authorName = authorName;
        bookAvailability.add(this);
    }
    
    public static void checkAvailability(int id) {
        for (MulltipleBook book : bookAvailability) {
            if (book.getBookID() == id) {
                System.out.println("Yes");
                System.out.println("Book ID: " + book.getBookID());

                return;
            }
        }
        System.out.println("No");
    }
    
    public static void displayBookDetails() {
        for (MulltipleBook book : bookAvailability) {
            System.out.println("Book Id: " + book.bookID);
            System.out.println("Book Title: " + book.title);
            System.out.println("Author: " + book.authorName);
            System.out.println("--------");
        }
    }

    // Getters and Setters

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
