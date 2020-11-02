package john.smith.s111111;

import java.util.Scanner;

/**
 * This class +++ Insert Description here +++
 * 
 * @author Haki
 */
public class CompanyHR {

    String[] department = {"HR", "IT", "Finance", "Legal"};
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter engineer information:\n");
       
        Engineer engineer = new Engineer();
        System.out.println("Please enter engineer name:");
        engineer.setName(input.nextLine());
        System.out.println("Please enter engineer Salary:");
        engineer.setSalary(input.nextDouble());
        System.out.println("Please enter engineer Years of Service:");
        engineer.setYearsOfService(input.nextInt());
        
       
        System.out.println("Please enter Manager information:\n");
        input = new Scanner(System.in);
        Manager manager = new Manager();
        System.out.println("Please enter Manager Name:");
        manager.setName(input.nextLine());
        System.out.println("Please enter Manager Salary:");
        manager.setSalary(input.nextDouble());
        System.out.println("Please enter Manager Years of Service:");
        manager.setYearsOfService(input.nextInt());
        
        // If engineer years of service more than 10, then employee deserve a raise by 3%
        if (engineer.getYearsOfService() > 10){
         // 1. Calculate new Salary
             
        }
        // 2. Display Engineer Name, Salary and Years of Service
        
        
       // If Manager years of service more than 15, then employee deserve a raise by 5%
       // 3. Calculate Manager new salary
       // 4. Display Manager Name, Salary and Years of Service
       
    }

}
