package dateorganizer;

/**
 * A testbed for a binary heap implementation of a priority queue using 
 * various comparators to sort Gregorian dates
 * @author Duncan, YOUR NAME
 * @see Date, PQueueAPI, PQueue
 * <pre>
 * Date: 99-99-9999
 * Course: csc 3102
 * File: DateOrganizer.java
 * Instructor: Dr. Duncan
 * </pre>
 */
 
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;
import java.util.Comparator; 

public class DateOrganizer
{
    /**
     * Gives the integer value equivalent to the day of the
     * week of the specified date 
     * @param d a date on the Gregorian Calendar
     * @return 0->Sunday, 1->Monday, 2->Tuesday, 3->Wednesday,
     * 4->Thursday, 5->Friday, 6->Saturday; otherwise, -1
     */
    public static int getDayNum(Date d)
    {
        //Implement this method
        return -1;
    }
	public static void main(String[] args) throws IOException, PQueueException
    {
        String usage = "DateOrganizer <date-file-name> <sort-code>%n";
        usage += "sort-code: -2 -month-day-year%n";
        usage += "           -1 -year-month-day%n";
        usage += "            0 +weekDayNumber+monthName+day+year%n";
        usage += "            1 +year+month+day%n";
        usage += "            2 +month+day+year";
        if (args.length != 2)
        {
            System.out.println("Invalid number of command line arguments");
            System.out.printf(usage+"%n");
            System.exit(1);
        }
        //Complete the implementation of this method
    }
}
