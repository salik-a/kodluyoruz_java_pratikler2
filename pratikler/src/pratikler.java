/**
 * This code written by
 * @author salika
 */
import java.util.Scanner;
import java.util.Arrays;
public class pratikler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("------------------------------Birinci pratik---------------------------------------");
        System.out.println();

        int number1,number2,select,result;
        System.out.println("Enter first number : ");
        number1= scan.nextInt();
        System.out.println("Enter second number : ");
        number2= scan.nextInt();
        System.out.println("Choose an operation with number : 1-Addition 2-Subtraction 3-Multiplication 4-Division");
        select=scan.nextInt();


        switch(select)
        {
            case 1:
                result=number1+number2;
                System.out.println("Result : "+result);
                break;
            case 2:
                result=number1+number2;
                System.out.println("Result : "+result);
                break;
            case 3:
                result=number1+number2;
                System.out.println("Result : "+result);
                break;
            case 4:
                result=number1+number2;
                System.out.println("Result : "+result);
                break;

            default: System.out.println("You didn't choose any operation");
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        //----------------------------------------------------------------------------
        // ikinci pratik
        System.out.println("------------------------------İkinci pratik---------------------------------------");
        System.out.println();

        String username,password,newpassword;

        System.out.println("Enter your username : ");
        username= scan.nextLine();
        System.out.println("Enter your password : ");
        password= scan.nextLine();

        if(!username.equals("patika")){
            System.out.println("Username wrong ");
        }else if(!password.equals("java123")){
            System.out.println("Password wrong ");
            System.out.println("Do you wanna change password: Enter 1 for Yes ; 2 for No ");
            int choise=scan.nextInt();
            if (choise==1){
                System.out.println("Enter password :");
                password = scan.nextLine();
                if(password.equals("java123")){
                    System.out.println("Same password,change it ");
                }else {
                    System.out.println("Password changed");
                }
            }else {
                System.out.println("Enter password again");
                password= scan.nextLine();
            }


        }else {
            System.out.println("Correct");
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        //----------------------------------------------------------------------------
        // Üçüncü pratik
        System.out.println("------------------------------Üçüncü pratik---------------------------------------");
        System.out.println();

        int math,physics,chemical,language,music;

        System.out.println("Enter math score");
        math=scan.nextInt();
        System.out.println("Enter physics score");
        physics=scan.nextInt();
        System.out.println("Enter chemical score");
        chemical=scan.nextInt();
        System.out.println("Enter language score");
        language=scan.nextInt();
        System.out.println("Enter music score");
        music=scan.nextInt();

        int total=0,value=0;

        if(0<math && math<100){
            total += math;
            value++;
        }
        if(0<music && music<100){
            total += music;
            value++;
        }
        if(0<language && language<100){
            total += language;
            value++;
        }
        if(0<physics && physics<100){
            total += physics;
            value++;
        }
        if(0<chemical && chemical<100){
            total += chemical;
            value++;
        }

        double average= total/value;

        if (average<=55){
            System.out.println("You didn't pass the class");
        }
        else {
            System.out.println("Congratulations");
        }


        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        //----------------------------------------------------------------------------
        // Dördüncü pratik
        System.out.println("------------------------------Dördüncü pratik---------------------------------------");
        System.out.println();

        int temperature;
        System.out.println("Enter weather temperature");
        temperature= scan.nextInt();

        if(temperature<5){
            System.out.println("Go to ski");
        }else if(temperature>=5 && temperature<15){
            System.out.println("Go to cinema");
        }else if(temperature>=15 && temperature<25){
            System.out.println("Go to picnic");
        }else if(temperature>=25){
            System.out.println("Go to swimming");
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------");
        //----------------------------------------------------------------------------
        // Beşinci pratik
        System.out.println("------------------------------Beşinci pratik---------------------------------------");
        System.out.println();

        int a,b,c;
        System.out.println("1.sayi a: ");
        a= scan.nextInt();

        System.out.println("2.sayi b: ");
        b= scan.nextInt();

        System.out.println("3.sayi c: ");
        c= scan.nextInt();

        if ((a<b) && (a<c)){
            if (b<c){
                System.out.println("a<b<c");
            } else{
                System.out.println("a<c<b");
            }

        }
        else if((b<a) && (b<c)){
            if(a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }


        }else{
            if(a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }








    }
}
