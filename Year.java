import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        System.out.println("Enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0&&year%4!=0){
            System.out.println("This is Laep Year");
        }
        else{
            System.out.println("This is not Leap Year");
        }
        sc.close();
        
    }
    
}
