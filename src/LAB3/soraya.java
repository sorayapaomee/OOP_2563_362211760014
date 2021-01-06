package LAB3;

import java.util.Scanner;

public class soraya {
    public static void main(String[] args) {
        Scanner pu = new Scanner(System.in);
        int count = 0;

        while(count<3){
            System.out.print("Username : ");
            String sor = pu.nextLine();

            System.out.print("Password : ");
            String aya = pu.nextLine();
            if(sor.equals("admin") && aya.equals("saiyai"))
            {
                System.out.println("Welcome to MT Website.");
                break;
            }
            else {
                System.out.println("username or password not correct." );
                count++;
            }
            if(count==3)
            {
                System.out.println("You account has been locked.Please, contect admin.");
            }
        }//while


    }//main
}//class