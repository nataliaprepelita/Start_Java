package Homeworks.L678HW_Java_Inheritance_Prepelita_Natalia.Payroll_System;

public class CommercialDepartment extends Employee {
    private double businessRevenuePerMonth;//ежемесячная выручка
    private double kpi;//ежемесячный KPI

    public CommercialDepartment(String name, double businessRevenueForMonth, double kpi){
        super(name);
        this.businessRevenuePerMonth = businessRevenueForMonth;
        this.kpi = kpi;
    }
    public double getKpi() {
        return kpi;
    }
    public double getBusinessRevenuePerMonth() {
        return businessRevenuePerMonth;
    }
    @Override
    public double calculateSalary() {
        double grossSalary = getBusinessRevenuePerMonth() * 0.3 + getKpi();
        return grossSalary - ((grossSalary - (grossSalary * getMedicalInsurancePercent()) - getPersonalTaxExemptionMonthly()) * getIncomeTax()) - grossSalary * getMedicalInsurancePercent();
    }
}
