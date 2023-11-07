package Annotation;
import java.time.*;
public class Current_Date_and_Time {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
	}

}


//Output:
//			2023-08-13
//			12:20:12.913261700
