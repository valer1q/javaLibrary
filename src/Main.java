import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

            while (true) { 
                System.out.println("Выбор действия:");
                int caseNumber = console.nextInt();  
                switch (caseNumber) {
                    case 0:
                        Library.addPublication();
                    break;
                
                    case 1:

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


