
import java.util.Scanner;

public class Monthday {
    public static void main(String[] args) {
        System.out.println("Enter the month from 1 to 12");
        int month ;
        Scanner sc =  new Scanner(System.in);
        month= sc.nextInt();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println("This month in Days is :"+31);
        }
        else if(month==4||month==6||month==9||month==11){
            System.out.println("This month in Days is:"+30);
        }
        else if(month==2){
            System.out.println("This month in Days is 28 and 29:");
        }
        else{
            System.out.println("Please Enter the valid input");
        }
        sc.close();
        
    }
    
}
