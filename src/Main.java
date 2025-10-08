import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

            while (true) { 
                System.out.println("Chose action:");
                System.out.print("1)Add publication 2) 3) 4) 5)Exit");
                System.out.println("");
                int caseNumber = console.nextInt();  
                switch (caseNumber) {
                    case 1:
                        Library.addPublication();
                    break;
                
                    case 2:

                    break;

                    case 3:
                    break;

                    case 4:
                    break;

                    case 5:
                        System.exit(0);
                    System.out.println();
                    break;
                    
                
            }
    }
}


}


