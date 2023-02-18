/*
 * Nama	: Muhamad Fahri Yuwan Dwi Putra
 * NIM	: 221524047
 * Kelas: 1B
 */
package Task3;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author BlackStyle
 */
class Manager extends Employee implements Sortable_2 {
    public Manager (String n, double s, int d, int m, int y){ 
        super(n, s, d, m, y);
        secretaryName = "";
}

    @Override
public void raiseSalary(double byPercent){
    // add 1/2% bonus for every year of service 
    GregorianCalendar todaysDate = new GregorianCalendar(); 
    int currentYear = todaysDate.get(Calendar.YEAR);  
    double bonus = 0.5 * (currentYear - hireYear()); 
    super.raiseSalary(byPercent + bonus);
}

public String getSecretaryName(){ 
    return secretaryName;
}

    @Override
    public int compare(Sortable_2 b){ 
        Manager eb = (Manager) b;
        if (getSalary()<eb.getSalary()) 
            return -1; 
        if (getSalary()>eb.getSalary()) 
            return +1; 
        return 0;
}
    
    public static void shell_sort(Sortable_2[] a) {
        // Shell sort body
    }
private String secretaryName;
}
