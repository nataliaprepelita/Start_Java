package Homeworks.L678HW_Java_Inheritance_Prepelita_Natalia.Payroll_System;

public class Salary {
    public static void main(String[] args) {
        FinancialDepartment financialManager1 = new FinancialDepartment("Mark", 25000);
        financialManager1.calculateSalary();
        financialManager1.displayInfoSalary();

        CommercialDepartment commercialManager1 = new CommercialDepartment("Anny",150000,1000);
        commercialManager1.calculateSalary();
        commercialManager1.displayInfoSalary();

        TechnicalDepartment technicalEmployee1 = new TechnicalDepartment("Marry", 12,5);
        technicalEmployee1.calculateSalary();
        technicalEmployee1.displayInfoSalary();

        TechnicalDepartment technicalEmployee2 = new TechnicalDepartment("Stephen",6,8 );
        technicalEmployee2.calculateSalary();
        technicalEmployee2.displayInfoSalary();
    }
}
