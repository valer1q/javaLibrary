import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static ArrayList<Publication> publications = new ArrayList<>();
    static Scanner console = new Scanner(System.in);


    public static void addPublication(){

        System.out.print("1)Book 2)Magazine 3)Newspaper");
        System.out.println("");
        int caseNumer = console.nextInt();
        console.nextLine();
        switch (caseNumer){
            case 1:
                System.out.println("Title");
                String title = console.nextLine();
                System.out.println("Author");
                String author = console.nextLine();
                System.out.println("Year");
                int year = console.nextInt();
                System.out.println("ISBN");
                int ISBN = console.nextInt();
                Book book = new Book(author, year, title, "Book", ISBN);
                publications.add(book);
                Publication.increasePublicationCount();
                System.out.println(publications.toString());
                System.out.println(Publication.getPublicationCount());

                break;

            case 2:
                System.out.println("Title");
                String title = console.nextLine();
                System.out.println("Author");
                String author = console.nextLine();
                System.out.println("Year");
                int year = console.nextInt();
                System.out.println("ISBN");
                int ISBN = console.nextInt();
                Book book = new Book(author, year, title, "Magazine", ISBN);
                publications.add(book);
                Publication.increasePublicationCount();
                System.out.println(publications.toString());
                System.out.println(Publication.getPublicationCount());

        }

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
