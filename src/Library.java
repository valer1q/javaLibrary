import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<Publication> publications = new ArrayList<>();
    static Scanner console = new Scanner(System.in);


    public static void addPublication(){

        System.out.println("type");
        int caseNumer = console.nextInt();
        console.nextLine();
        switch (caseNumer){
            case 1:
                System.out.println("title");
                String title = console.nextLine();
                System.out.println("author");
                String author = console.nextLine();
                System.out.println("year");
                int year = console.nextInt();
                System.out.println("ISBN");
                int ISBN = console.nextInt();
                Book book = new Book(author, year, title, "Book", ISBN);
                publications.add(book);
                System.out.println(publications.toString());
                break;
        }
        //increasePublicationCount();
    }

//    public static void setPublications(ArrayList<Publication> publications) {
//        Library.publications = publications;
//    }

    public void listPublications(){

    }

    public void searchByAuthor(String author){
    }

    public void searchByTitle(String title){
    }
}
