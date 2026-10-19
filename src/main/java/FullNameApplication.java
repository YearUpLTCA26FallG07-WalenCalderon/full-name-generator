import java.util.Scanner;


public class FullNameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName;
        String middleInitial;
        String lastName;
        String suffix;
        String fullName;

        //Asking for input
        System.out.print("Please enter your first name: ");
        firstName = sc.nextLine();

        System.out.print("Please enter your middle initial: ");
        middleInitial = sc.nextLine();

        System.out.print("Please enter your last name: ");
        lastName = sc.nextLine();

        System.out.print("Please enter your suffix: ");
        suffix = sc.nextLine();

        //adding firstName;
        fullName = firstName;

        // if we get an middle we add middleInitial to fullName
        if (!middleInitial.isBlank()) {

            fullName += " " + middleInitial.charAt(0) + ".";

        }
        fullName += " " + lastName;


        //if we get a suffix we add it to the fullName
        if (!suffix.isBlank()) {
            fullName += ", " + suffix;
        }

        System.out.println(fullName);

    }
}