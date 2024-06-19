import java.util.Scanner;

public class datatypes {
    public static void main(String[] args) {
        Scanner medhas=new Scanner(System.in);
      //  String name = "Medhas";
      //  int stdId =2060614;
       // int age = 22;
      //  char gender = 'M';
       // float marks = 95.25f;
      //  System.out.println( "Name :"+name);
        //System.out.println("StdID :"+stdId);
      //  stem.out.println("Age :"+age);
       // System.out.println("Gender :"+gender);
       // System.out.println("Marks :"+marks);
       String name = medhas.nextLine();
       int stdId =medhas.nextInt();
       char gender =medhas.next().charAt();
       System.out.println("Enetr ur Name :");
       
       System.out.println("Enetr ur ID :" );
       
       System.out.println("Gender :");
       
       System.out.println("Name =" +name);
       System.out.println("ID =" +stdId);
       System.out.println("Gender =" +gender);


       System.out.println("Enter Maths marks :");
      int maths =medhas.nextInt();

      System.out.println("Enter English marks :");
      int english =medhas.nextInt();

      System.out.println("Enter science marks :");
      int science =medhas.nextInt();

      System.out.println("Maths =" +maths);
      System.out.println("English =" +english);
      System.out.println("Science =" +science);

      if(maths >= 40 && english>=40 && science >=40){
        System.out.println("you are Pass");
      }
      else{
        System.out.println("You are failed ");
      }
