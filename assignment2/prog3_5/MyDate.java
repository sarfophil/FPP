package problem34;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MyDate {
	
	public static void main(String args[]) {
		inputDate();
	}
	
	private int day;
	private int month;
	private String monthName;
	private int year;
	private int dayOfYear;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public MyDate(String monthName, int day, int year) {
		this.day = day;
		this.monthName = monthName;
		this.year = year;
	}

	public MyDate(int dayOfYear, int year) {
		this.dayOfYear = dayOfYear;
		this.year = year;
	}

	/** computes date Format depending on input's choice */
	public String computeDate(int choice) {
		try {
			LocalDate localDate;
			switch (choice) {
			case 1:
				localDate = LocalDate.of(year, month, day);
				break;
			case 2:
				Month monthFormat = Month.valueOf(monthName);
				localDate = LocalDate.of(year, monthFormat, day);
				break;
			default:
				localDate = LocalDate.ofYearDay(year, dayOfYear);
				break;
			}

			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyy");
			DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
			DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("DDD yyy");

			return "MM/dd/yyyy: " + dateTimeFormatter.format(localDate) + "\n" + "MMMM dd,yyyy: "
					+ dateTimeFormatter2.format(localDate) + "\n" + "DDD yy: " + dateTimeFormatter3.format(localDate);
		
		
		} catch (DateTimeException e) {
			return "Invalid Month. \n" + e;
		}
	}

	

	static void inputDate() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1 for format: MM/DD/YYYY \n" + "Enter 2 for format: Month DD, YYYY \n"
				+ "Enter 3 for format: DDD YYYY \nEnter 4 to exit.\n\nChoose your Choice:");
		
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			System.out.print("Choice: " + choice + "\nEnter Month:\n");
			int month = sc.nextInt();

			System.out.print("Enter Day:\n");
			int day = sc.nextInt();

			System.out.println("Enter Year:\n");
			int year = sc.nextInt();

			MyDate myDate = new MyDate(month, day, year);

			System.out.print(myDate.computeDate(1) + "\n");
			System.out.print("Do you want to Continue?(y/n)");

			// Restart
			restartInputDate(sc.next());

			break;
		case 2:
			System.out.print("Choice: " + choice + "\nEnter Month:\n");
			String secondMonth = sc.next();

			System.out.print("Enter Day:\n");
			int secondDay = sc.nextInt();

			System.out.println("Enter Year: \n");
			int secondYear = sc.nextInt();

			MyDate secondMyDate = new MyDate(secondMonth, secondDay, secondYear);

			System.out.print(secondMyDate.computeDate(2) + "\n");
			System.out.print("Do you want to Continue?(y/n)");

			// Restart
			restartInputDate(sc.next());

			break;
		case 3:

			System.out.print("Choice: " + choice + "\nEnter Day of the Year:\n");
			int dayOfYear = sc.nextInt();

			System.out.println("Enter Year: \n");
			int thirdYear = sc.nextInt();

			MyDate thirdMyDate = new MyDate(dayOfYear, thirdYear);

			System.out.print(thirdMyDate.computeDate(3) + "\n");
			System.out.print("Do you want to Continue?(y/n)");

			// Restart
			restartInputDate(sc.next());

			break;
		case 4:
			System.out.println("\nTerminated");
			break;
		default:
			System.out.println("Enter a valid choice. Terminated.");
			
			System.out.print("Do you want to Continue?(y/n)");

			// Restart
			restartInputDate(sc.next());
			break;
		}
		sc.close();
	}

	static void restartInputDate(String response) {
		if (response.equals("y")) {
			System.out.println("\n");
			inputDate();
		} else {
			System.out.println("\nTerminated.");
		}

	}

}
