/*
 * Nama	: Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Task3;

/**
 *
 * @author BlackStyle
 */
public class Employee extends Sortable {
    
    public Employee(String n, double s, int day, int month, int year){ 
        name = n;
        salary = s; 
        hireday = day; 
        hiremonth = month; 
        hireyear = year;
}

    public void print(){
        System.out.println(name + " " + getSalary() + " " + hireYear());
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){ 
        salary *= 1 + byPercent / 100;
    }

    public int hireYear(){
        return hireyear;
    }

    @Override
    public int compare(Sortable b){ 
        Employee eb = (Employee) b;
        if (getSalary()<eb.getSalary()) 
            return -1; 
        if (getSalary()>eb.getSalary()) 
            return +1; 
        return 0;
}

private String name; 
private double salary; 
private int hireday; 
private int hiremonth; 
private int hireyear;

}
