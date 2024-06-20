import java.util.Scanner;

public class day2j {
    public static void main(String[] args) {
        System.out.println("Enter ur case :");
        Scanner sc = new Scanner(System.in);
         int day = sc.nextInt();
        String dayName;

        switch(day){
            case 1 :
            dayName= "Monday";
          //  System.out.println(" Today is Monday");
            break;
            case 2 :
            dayName = "Tuesday";
           // System.out.println(" Today is tuesday");
            break;
            default:
            dayName ="Invalid";
          //  System.out.println("Invalid day");
            break;

        }
        System.out.println("The day is "+dayName);
    }
    
}
