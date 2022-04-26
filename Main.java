
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeList grades = new GradeList();
        System.out.println("Enter point totals, -1 stops:");

        while(true){           
            int point = Integer.valueOf(scanner.nextLine());
            if(point==-1){
                break;
            }
            grades.add(point);
        }
        System.out.println("Point average (all): "+grades.average());
        

        System.out.println("Point average (passing): "+grades.averagePassed());
        

        System.out.println("Pass percentage: "+ grades.passPercentage());
        

        System.out.println("Grade distribution: ");
        System.out.println(grades);
        

        
    }
}
