package Homeworks.L678HW_Java_Inheritance_Prepelita_Natalia.Payroll_System;

public class FinancialDepartment extends Employee {

    private double bonusFix = 120.50;//фиксированный ежемесячный бонус к ставке
    private double salaryRate;//ставка брутто для сотрудника



    public FinancialDepartment(String name, double salaryRate){
        super(name);
        this.salaryRate = salaryRate;
    }



    public double getBonusFix() {
        return bonusFix;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    @Override
    public double calculateSalary() {
        double grossSalary = salaryRate + bonusFix;
        return grossSalary - ((grossSalary - (grossSalary * getMedicalInsurancePercent()) - getPersonalTaxExemptionMonthly()) * getIncomeTax()) - grossSalary * getMedicalInsurancePercent();
    }
}
