import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num1,num2,num3;
        System.out.println("İlk sayıyı giriniz:");
        num1=input.nextInt();

        System.out.println("İkinci sayıyı giriniz:");
        num2=input.nextInt();

        System.out.println("Üçüncü sayıyı giriniz:");
        num3=input.nextInt();

        if(num1<num2){
             if(num2>num3){
                 System.out.println("En büyük sayı:"+ num2);
            }

             if(num3>num2){
                 System.out.println("En büyük sayı" + num3);
             }

        }else if(num1>num3){
            System.out.println("En büyük sayı: " + num1);
        }




    }
}