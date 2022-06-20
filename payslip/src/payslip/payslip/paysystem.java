package payslip.payslip;

import java.util.Scanner;

public class paysystem {
	public static void main(String[] args) {
        EmployeeData TestSubject = new EmployeeData();
        Scanner Read = new Scanner(System.in);
        String tempString;
        Integer tempInt;

        System.out.println("Enter your name: ");
        tempString = StringInput();
        TestSubject.setEmployeeFirstName(tempString);

        System.out.println("Enter your surname: ");
        tempString = StringInput();
        TestSubject.setEmployeeSurname(tempString);

        System.out.println("Enter your annual salary: ");
        tempInt = IntegerInput();
        TestSubject.setSalary(tempInt);

        System.out.println("Enter your super rate: ");
        tempInt = IntegerInput();
        TestSubject.setSuperRate(tempInt);

        System.out.println("Enter your payment start date: ");
        tempString = MonthInput();
        TestSubject.setStartDate(tempString);


        System.out.println(System.lineSeparator() + "The payslip is: " + System.lineSeparator());

        System.out.println("Name: " + TestSubject.getEmployeeFirstName() + " " + TestSubject.getEmployeeSurname());
        System.out.println("Pay Period: " + TestSubject.CalculatePayMonth());
        System.out.println("Gross Income: " + TestSubject.CalculateGrossPay());
        System.out.println("Income Tax: " + TestSubject.CalculateIncomeTax());
        System.out.println("Net Income: " + TestSubject.CalculateNetIncome());
        System.out.println("Super: " + TestSubject.CalculateSuper());

        System.out.println("Thank you");
    }
	 public static boolean checkBetween(int tester, int floor, int ceiling)
	    {
	        return((tester > floor) && (tester < ceiling));
	    }

	    public static String StringInput()
	    {
	        Scanner Read = new Scanner(System.in);
	        try {
	            return Read.nextLine();
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error, please try again!");
	        }
	        return StringInput();
	    }

	    public static Integer IntegerInput()
	    {
	        Scanner Read = new Scanner(System.in);
	        try {
	            return Read.nextInt();
	        }
	        catch (Exception e)
	        {
	            System.out.println("Error, please try again!");
	        }
	        return IntegerInput();
	    }

	    public static String MonthInput()
	    {
	        Scanner Read = new Scanner(System.in);
	        String Input = StringInput();

	        String Checker = Input.split(" ")[1].toUpperCase();
	        Integer Day = Integer.parseInt(Input.split(" ")[0]);
	        System.out.println(Day);

	        if (Checker.equals("JANUARY") || Checker.equals("FEBRUARY") || Checker.equals("MARCH") || 
	        		Checker.equals("APRIL") || Checker.equals("MAY") || Checker.equals("JUNE") || Checker.equals("JULY") 
	        		|| Checker.equals("AUGUST") || Checker.equals("SEPTEMBER") || Checker.equals("OCTOBER") || Checker.equals("DECEMBER")
	                || Checker.equals("NOVEMBER"))
	            {
	                if(checkBetween(Day, 0, 32))
	                {
	                    return Input;
	                }
	            }
	        System.out.println("Error, please try again!");
	        return MonthInput();
	    }
}
