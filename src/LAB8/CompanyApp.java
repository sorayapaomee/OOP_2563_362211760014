package LAB8;

public class CompanyApp {
    public static void main(String[] args){


        Employee emp1 = new Employee();

        emp1.setPid("1809900362411");
        emp1.setName("Soraya paomee");
        emp1.setAge(22);
        emp1.setGender("mal");
        emp1.setTel("0987353719");

        emp1.setEmpID("epm001");
        emp1.setPosition("programmer");
        emp1.setSalary(30000.000);

        //display object data
        System.out.println(emp1.toString());



    }//main


}//class
