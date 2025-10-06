public class Magazine extends Publication implements Printable{
    private int issueNumber;

    public void setIssueNumber(int issueNumber){
        this.issueNumber = issueNumber;
    }
    public int getIssueNumber(){
        return issueNumber;
    }

    @Override
    public void printDetails(){
        System.out.println(this.getTitle());
        System.out.println(this.getAuthor());
        System.out.println(this.getYear());
        System.out.println(this.getIssueNumber());
    }

    public Magazine(String author, int year, String title, String type, String issueNumber){
        this.setType("Magazine");
    }
}
