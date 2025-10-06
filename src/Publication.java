public abstract class Publication{
    private String title;
    private String author;
    private int year;
    private String type;

    private static int publicationCount = 0;

    public static void increasePublicationCount(){
        publicationCount += 1;
    }
    public static void decreasePublicationCount(){
        publicationCount -= 1;
    }
    public static int getPublicationCount(){
        return publicationCount;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }



}



