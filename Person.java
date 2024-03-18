import java.time.*;

public class Person extends Employee_details {
	public static void main(String[] args) {

		float emp_id = 1234;
		float emp_salary = 50000;

		LocalDate pdt = LocalDate.of(2004, 03, 23);
		LocalDate tdt = LocalDate.now();
		Period diff = Period.between(pdt, tdt);
		System.out.println("Name: Vineeta");
		System.out.println("Date of Birth : " + pdt);
		System.out.println("Age : " + diff.getYears());
		System.out.println("Emp_id : " + emp_id(emp_id));
		System.out.println("Emp_salary : " + emp_salary(emp_salary));

	}
}