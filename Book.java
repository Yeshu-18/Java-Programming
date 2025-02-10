class Book {
    int bookID;
    String title;
    String author;
    boolean availabilityStatus;

    Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.availabilityStatus = true;
    }

    boolean changeAvailableStatus() {
        availabilityStatus = !availabilityStatus;
        return availabilityStatus;
    }

    void displayBookDetails() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (availabilityStatus ? "Yes" : "No"));
    }

    boolean isAvailable() {
        return availabilityStatus;
    }

 
    public static void main(String[] args) {
        Book book1 = new Book(1, "Java Programming", "Yeshwanth");
        Book book2 = new Book(2, "Java Programming", "wanth");
        book1.displayBookDetails();
        System.out.println("Is Available? " + book1.isAvailable());
    }
}
