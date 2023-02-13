public class Main {

    public static void main(String[] args) {
	double valueA = 0;
	double valueB = 0;

	if (valueA > valueB) // if value A is greater than value B then the output below will display
    {
        System.out.println(valueB + " is the lower number."); // if value A is greater than value B then output will display and tell the user that value B is the lower number.
    }
    else if (valueA < valueB) // if value B is greater than value A then the output below will display
    {
        System.out.println(valueA + " is the lower number."); // if value B is greater than value A then output will display and tell the user that value A is the lower number.
    }
    else if(valueA == valueB) // if values are equal then the output below will display
    {
        System.out.println("The numbers are equal."); // if values are equal, the output will tell the user that the values are equal
    }
    else
        System.out.println("Invalid entry. Try again"); // if either input is not a number, the output will tell the user to try again.
    }
}
