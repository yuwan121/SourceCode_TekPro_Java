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
public class ManagerTest{
        public static void main (String[] args){ 
                Employee[] staff = new Employee[3];
                staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
                staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
                staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
                Sortable_2.shell_sort((Sortable_2[]) staff);
                int i;
                for (i = 0; i < 3; i++) staff[i].raiseSalary(5); 
                for (i = 0; i < 3; i++) staff[i].print();
        }

}