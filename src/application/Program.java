package application;

import com.sun.security.jgss.GSSUtil;
import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of  employees: ");
        int n = scan.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++ ){
            System.out.println("Employee #" + (i + 1) + "data: " );
            System.out.print("Outsourced (y/n) ");
            char choose = scan.next().charAt(0);
            scan.nextLine();
                if (choose == 'y' ){
                    System.out.print("Name: ");
                    String name = scan.nextLine();
                    System.out.print("Hours: ");
                    int hours = scan.nextInt();
                    System.out.print("Value per hour: ");
                    Double valuePerHour = scan.nextDouble();
                    System.out.print("Additional charge: ");
                    Double additionalCharge = scan.nextDouble();

                    Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                    list.add(employee);

                } if (choose == 'y' ){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Hours: ");
                int hours = scan.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = scan.nextDouble();

                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);

                } else {
                System.out.println("Insira uma resposta válida");
                }

        }




















        scan.close();
    }
}
