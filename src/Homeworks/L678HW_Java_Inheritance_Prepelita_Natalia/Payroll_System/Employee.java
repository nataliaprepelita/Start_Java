package Homeworks.L678HW_Java_Inheritance_Prepelita_Natalia.Payroll_System;

abstract class Employee {
    private String name;
    private double medicalInsurancePercent = 0.09;// 9% - медицинское страхование
    private int personalTaxExemptionMonthly = 2250;//личное освобождение, на которое не считается подоходный налог
    private double incomeTax = 0.12;//12% - подоходный налог
    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMedicalInsurancePercent() {
        return medicalInsurancePercent;
    }

    public int getPersonalTaxExemptionMonthly() {
        return personalTaxExemptionMonthly;
    }

    public double getIncomeTax() {
        return incomeTax;
    }

    public abstract double calculateSalary();
    public void displayInfoSalary(){
        System.out.println("Employee: " + name);
        System.out.println("Net salary is equal: " + calculateSalary());
        System.out.println();
    }
}
