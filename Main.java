import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean loop=true;

        while(loop){
            System.out.println("---Hello!---");
            System.out.println("Enter 1 to Add Book!:");
            System.out.println("Enter 2 to Check Availability:");
            System.out.println("Enter 3 to Print Books:");
            System.out.println("Enter 4 to exit:");
            int num=sc.nextInt();
            sc.nextLine();

            switch (num){
                case 1:{
                    System.out.println("Enter Book id to add:");
                    int id=sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Book title:");
                    String bookTitle=sc.nextLine();
                    System.out.println("Enter Author:");
                    String author=sc.nextLine();
                    MulltipleBook MulltipleBook=new MulltipleBook(id,bookTitle,author);
                    System.out.println("Book Added Successfully!");
                    break;
                }

                case 2:{
                    System.out.println("Enter the book Id to Search!:");
                    int id=sc.nextInt();
                    MulltipleBook.checkAvailability(id);
                    break;
                }

                case 3:{
                    MulltipleBook.displayBookDetails();
                    break;
                }

                case 4:{
                    System.out.println("Thank You!");
                    loop=false;
                }
            }
        }
    }
}
