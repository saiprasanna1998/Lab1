package lab3;

import java.time.LocalDate;
import java.time.Period;

public class Exercise7 {

	
	public static void main(String[] args)
    {
        LocalDate pastDate = LocalDate.of(1998,05,02);
        LocalDate presentDate = LocalDate.now();
 
        Period diff = Period.between(pastDate, presentDate);   // Function to print difference in 
        														// time past date and present date 
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", diff.getYears(), diff.getMonths(), diff.getDays());
  }

}