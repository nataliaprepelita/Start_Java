package Homeworks.L678HW_Java_Inheritance_Prepelita_Natalia.Payroll_System;

public class TechnicalDepartment extends Employee {
    private double hourlyWage = 400;
    private int numberOfRegularHours = 8;
    private int numberOfWorkedHours;
    private double overTimeHourlyWage = 600;
    private int shift;

    public TechnicalDepartment(String name, int numberOfWorkedHours, int shift){
        super(name);
        this.numberOfWorkedHours = numberOfWorkedHours;
        this.shift = shift;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public int getShift() {
        return shift;
    }

    public int getNumberOfWorkedHours() {
        return numberOfWorkedHours;
    }

    public int getNumberOfRegularHours() {
        return numberOfRegularHours;
    }

    public double getOverTimeHourlyWage() {
        return overTimeHourlyWage;
    }

    @Override

    public double calculateSalary() {
        double grossSalary = 0.0;
        if (getNumberOfWorkedHours() <= getNumberOfRegularHours()){
            grossSalary = getNumberOfWorkedHours() * getHourlyWage() * getShift();
        } else if (getNumberOfWorkedHours() > getNumberOfRegularHours()) {
            grossSalary = (getNumberOfRegularHours() * getHourlyWage() + ((getNumberOfWorkedHours() - getNumberOfRegularHours()) * getOverTimeHourlyWage())) * getShift();
        }
        return grossSalary - ((grossSalary - (grossSalary * getMedicalInsurancePercent()) - getPersonalTaxExemptionMonthly()) * getIncomeTax()) - grossSalary * getMedicalInsurancePercent();
    }
}
