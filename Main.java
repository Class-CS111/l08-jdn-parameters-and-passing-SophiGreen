// PARTNER NAME: Sophia Platas
// PARTNER NAME: 
// CS111 SECTION #: Lab 08
// DATE: 5/7/25


public class Main
{
    public static void main(String[]args)
 {

//Declaration
int month = 0;
int day = 0;
int year = 0;
int jdnDate = 0;
 //Input

 //Calculation
month = 05;
day = 07;
year = 2025;
jdnDate = Main.calculateJulianDay(month, day, year);

 //Output
 System.out.println("The calculated Julian date for today is: " + jdnDate);
 month = 01;
 day = 01;
 year = 2025;

 
 jdnDate = Main.calculateJulianDay(month, day, year);
System.out.println("The calculated date for New Years 2025 is: " + jdnDate);

month = 12;
 day = 25;
 year = 2025;
 jdnDate = Main.calculateJulianDay(month, day, year);
 System.out.println("The calculated date for Christmas 2025 is: " + jdnDate);



 }
 //Description: calc julian date given month/day/year
 //Precondition: valid ints for m/d/y, m < 12
 //Postcondition: return on integer, julian date

 public static int calculateJulianDay(int month, int day, int year){
    int a = 0;
    int m = 0;
    int y = 0;
    int jdnToday = 0;

        a = (14 - month) / 12;
		m = month + 12 * a - 3;
		y = year + 4800 - a;
		jdnToday =  day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

        return jdnToday;


}

}