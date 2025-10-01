import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

            while (true) { 
                System.out.println("Выбор действия:");
                int caseNumber = console.nextInt();  
                switch (caseNumber) {
                    case 0:
                    break;
                
                    case 1:
                    System.out.println("type");
                    int caseNumber1 = console.nextInt();
                    switch (caseNumber1) {
                        case 1:
                        //Book
                            break;
                        case 2:
                        //Newspaper
                        break;
                        case 3:
                        //Magazine 
                        break;
                    }
                    break;

                    case 2:
                    break;

                    case 3:
                    break;

                    case 4:
                    System.out.println();
                    break;
                    
                
            }
    }
}
}


