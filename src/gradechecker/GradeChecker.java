package gradechecker;

import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Mark :");
        int mark = scanner.nextInt();
        
        if(mark >= 75){
            System.out.println("GRADE : A");
        }else if( mark >= 65){
            System.out.println("GRADE : B");
        }else if(mark >= 50){
            System.out.println("grade :C");
        }else{
            System.out.println("FAIL");
        }
    }
    
}
