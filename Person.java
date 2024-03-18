import java.time.*;

public class Person {
	public static void main(String[] args) {

		LocalDate pdt = LocalDate.of(2004, 03, 23);
		LocalDate tdt = LocalDate.now();
		Period diff = Period.between(pdt, tdt);
		System.out.println("Name: Vineeta");
		System.out.println("Date of Birth : " + pdt);
		System.out.println("Age : " + diff.getYears());

	}
}