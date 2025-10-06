public class Newspaper extends Publication implements Printable{
    private String publicationDay;

    public void setPublicationDay(String publicationDay){
        this.publicationDay = publicationDay;
    }
    public String getPublicationDay(){
        return publicationDay;
    }

    @Override
    public void printDetails(){
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
        System.out.println(this.getYear());
        System.out.println(this.getPublicationDay());
    }

    public Newspaper(String author, int year, String title, String type, String publicationDay){
        this.setType("Newspaper");
    }
}
