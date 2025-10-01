public class Book extends Publication implements Printable{
    private String ISBN;

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){
        return ISBN;
    }

    @Override
    public void printDetails(){
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
        System.out.println(this.getYear());
        System.out.println(this.getISBN());
    }
}
