package application;

import com.sun.security.jgss.GSSUtil;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of  employees: ");
        int n = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < n; i++ ){
            System.out.println("Outsourced (y/n) ");
            String choose = scan.nextLine();
                if (choose = "y" ){
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Hours: ");
                    int hours = scan.nextInt();
                    System.out.print("Value per hour: ");
                    Double valuePerHour = scan.nextDouble();
                    System.out.print("Additional charge: ");
                    Double additionalCharge = scan.nextDouble();

                    Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

                } if (choose = "n" ){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Hours: ");
                int hours = scan.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = scan.nextDouble();

                Employee employee = new Employee(name, hours, valuePerHour);

                } else {
                System.out.println("Insira uma resposta válida");
                }

        }




















        scan.close();
    }
}
