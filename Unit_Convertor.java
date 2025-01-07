import java.util.*;

public class Unit_Convertor{
    public static void UnitConvertor(){
        System.out.println("Welcome to Unit Convertor.");
        System.out.println("1.Length_Convertor(meter to kilometer,centimeter to meter,inches to centimeter)");
        System.out.println("2.Weight_Convertor(kilograms to pounds,grams to ounces)");
        System.out.println("3.Temperature(Celsius to Fahrenheit,Fahrenhit to Celsius)");
        System.out.println("4.Exit.");
    }

    public static int enterChoice(){
    Scanner sc = new Scanner(System.in);
    int enter_Choice = sc.nextInt();
    return enter_Choice;
    }

    public static void Length_Convertor(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Choose anyone option out of 3.");
      System.out.println("1.Meter to Kilometer.");
      System.out.println("2.Centimeter to Meter");
      System.out.println("3.Inche to centimeter");
      int choice = sc.nextInt();
      if (choice == 1){
      Double meter = sc.nextDouble();
      Double Kilometer = meter/1000;
      System.out.println("So the give vale in meter is"+meter);
      System.out.println("So the given value in kilometer becomes:"+Kilometer);
      }
      else if (choice == 2){
      Double centimeter = sc.nextDouble();
      Double meter = centimeter/100;
      System.out.println("So the give value in centimeter is"+centimeter);
      System.out.println("So the given value in kilometer becomes:"+meter);
      }
      else if(choice == 3){
      Double inch = sc.nextDouble();
      Double centimeter = 2.54*inch;
      System.out.println("So the give value in inch is"+inch);
      System.out.println("So the given value in centimeter becomes:"+centimeter);
      }
      else{
        System.out.println("Value can't be converte.");
      }
    }
    public static void  Weight_Convertor(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Choose anyone option out of 2.");
      System.out.println("1.Weight(kilograms to pounds)");
      System.out.println("2.Weight(grams to ounces)");
      int choice = sc.nextInt();
      if(choice == 1){
        Double kilogram = sc.nextDouble();
        Double pound = kilogram*2.20462;
        System.out.println("So the give value in kilogram is"+kilogram);
        System.out.println("So the given value in pound becomes:"+pound);
      }
      else if (choice == 2){
        Double gram = sc.nextDouble();
        Double ounce = gram*0.035274;
        System.out.println("So the give value in gram is"+gram);
        System.out.println("So the given value in ounce becomes:"+ounce);
      }
      else{
        System.out.println("Value can't be convert");
      }
    }
      public static void Temperature_Convertor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose anyone option out of 2.");
        System.out.println("1.Temperature(Celsius to Fahrenheit)");
        System.out.println("2.Temperature(Fahrenhit to Celsius)");
        int choice = sc.nextInt();
        if(choice == 1){
          Double Celsius = sc.nextDouble();
          Double Fahrenheit = (Celsius*9/5)+32 ;
          System.out.println("So the give value in kilogram is"+Celsius);
          System.out.println("So the given value in pound becomes:"+Fahrenheit);
        }
        else if(choice== 2){
          Double Fahrenheit= sc.nextDouble();
          Double Celsius =  (Fahrenheit*5/9)-32;
          System.out.println("So the give value in gram is"+Fahrenheit);
          System.out.println("So the given value in ounce becomes:"+Celsius);
        }
        else{
            System.out.println("Value can't be convert");
        }
    }

       public static void main(String args[]){
           while (true){
              UnitConvertor();
              int choice = enterChoice();
               if(choice == 1){
                  Length_Convertor();
               }
               else if (choice == 2){
                Weight_Convertor();
               }
               else if (choice == 3){
                Temperature_Convertor();
               }
               else{
                System.out.println("Entered choice is not valid.");

               }
               break;

           }
        }
     }

   