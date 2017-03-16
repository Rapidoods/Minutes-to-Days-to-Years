package com.company;

import java.time.Year;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Double mins, days, years;
        int oneDaytoMins = 1440, oneYeartoMins = 525600;

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter minutes: ");

        mins = sc.nextDouble();

        //1 hour = 60 minutes
        //1 day = 1440 minutes
        //1 year = 525600 minutes

        days = mins/oneDaytoMins;
        years = mins/oneYeartoMins;

        System.out.println("Minutes to Days: " + days + " day(s)");
        System.out.println("Minutes to Years: " + years + " year(s)");
    }
}
