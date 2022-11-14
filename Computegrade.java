import java.util.Scanner;

public class Computegrade {
    public static void main(String[] args) {
       System.out.println("Enter the Roll Number");
       Scanner sc = new Scanner(System.in);
       int a= sc.nextInt();
       System.out.println("Enter The Name ");
       Scanner sc1 = new Scanner(System.in);
       String b = sc.next();
       System.out.println("Enter The  3 Sub Marks");
       Scanner sc2 = new Scanner(System.in);
       Scanner sc3 = new Scanner(System.in);
       Scanner sc4 = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int C = sc.nextInt();
       float Total = A+B+C;
       System.out.println("Total Marks is:"+Total);
       float Percentage = Total/3;
       System.out.println("Total Percentage is:"+Percentage);
       if(Percentage>=90){
        System.out.println("A Grade");
       }
       else if(Percentage<=90&&Percentage>=70){
        System.out.println("B Grade");
       }
       else if(Percentage<=70&&Percentage>=60){
        System.out.println("C Grade");
       }
       else if(Percentage<50){
        System.out.println("F Grade");
       }
       sc.close();
       sc1.close();
       sc2.close();
       sc3.close();
       sc4.close();
       b.strip();
       

        
    }
    
}
