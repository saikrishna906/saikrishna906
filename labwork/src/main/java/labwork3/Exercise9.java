package labwork3;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DateTimeFormatter x=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the date");
		String input=br.readLine();
		LocalDate edate=LocalDate.parse(input,x);
		LocalDate cdate=LocalDate.now();
		Period duration=edate.until(cdate);
		System.out.println(duration.getDays()+"days");
		System.out.println(duration.getDays()+"months");
		System.out.println(duration.getDays()+"years");

	}

}
