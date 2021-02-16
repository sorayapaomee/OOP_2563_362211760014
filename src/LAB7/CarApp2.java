package LAB7;

import java.util.ArrayList;
import java.util.Scanner;

//รับค่าข้อมูลของวัตถุ car ทั้งหมด 3 จำนวน จากผู้ใช้ พร้อมทั้งแสดงทั้งหมดทางหน้าจอภาพ
public class CarApp2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many car do you have?:");
        int num = sc.nextInt();

        ArrayList<Car> myCar = new ArrayList<Car>();

        for (int i = 0; i < num; i++){
            //input data to object
            System.out.println("Please, enter car info"+(i+1)+":");
            Car c = inputDataObject();
            myCar.add(c);
        }
        //display data in ArrayList
        displayObject (myCar);



    }//main

    public static void displayObject (ArrayList<Car>mycar){
        System.out.println("All objects in ArrayList: ");
        for (Car c:mycar) {
            System.out.println(c.toString());
        }

    }
            private static Car inputDataObject() {
                Scanner sc = new Scanner(System.in);

                Car c = new Car();
                System.out.print("Enter car id: ");
                String id = sc.nextLine();
                c.setId(id);


                System.out.print("Enter car color: ");
                c.setColor(sc.nextLine());

                System.out.print("Enter car brand: ");
                c.setBrand(sc.nextLine());
                return  c;

            }


}//class
