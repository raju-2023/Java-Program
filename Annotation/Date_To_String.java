package Annotation;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_To_String {

	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2023, 8, 13);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		String formattedDate = date.format(formatter);
		System.out.println("Formatted Date:"+formattedDate);
	}
}

//Output:Formatted Date:08/13/2023