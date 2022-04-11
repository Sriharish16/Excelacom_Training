package BonusCalculation;
import java.util.*;

public class Execution {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Monthly Salary:");
		
		EmployeeService emp = new EmployeeService();
		
		//System.out.println("Bonus as the 33% of the Salary:"+emp.calculatebonus(45));
		
		int sal=sc.nextInt();
		emp.calculatebonus(sal);
		System.out.println("33% of the monthly salary:"+emp.calculatebonus(sal));
		System.out.println("Total Monthly Salary:"+(emp.calculatebonus(sal)+);
		
		sc.close();
		

	}
	

}
