package CodeSoft;
import java.util.Scanner;

public class Std_grade_calulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks of sub1:- ");
        int sub1 = sc.nextInt();
        System.out.print("Enter your marks of sub2:- ");
        int sub2 = sc.nextInt();
        System.out.print("Enter your marks of sub3:- ");
        int sub3 = sc.nextInt();
        System.out.print("Enter your marks of sub4:- ");
        int sub4 = sc.nextInt();
        System.out.print("Enter your marks of sub5:- ");
        int sub5 = sc.nextInt();

        int total_marks=sub1+sub2+sub3+sub4+sub5;
        int Avg_percentage=(total_marks/5);

        String Grade;
        switch (Avg_percentage / 10) {
            case 10:
            case 9:
                Grade = "A";
                break;
            case 8:
                Grade = "B";
                break;
            case 7:
                Grade = "C";
                break;
            case 6:
                Grade = "D";
                break;
            case 5:
                Grade = "E";
                break;
            default:
                Grade = "F";
                break;
        }
        System.out.println("The total marks of student :- "+total_marks);
        System.out.println("The average percentage of student:-"+Avg_percentage);
        System.out.println("Your grade is:- " + Grade);

    }
}
