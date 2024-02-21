import java.util.Scanner;

public class usedinnerParty {
    public static void main(String[] args) {
        // Declare variables
        int numberOfGuests;
        int dinnerChoice;

        // Create Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Create DinnerParty object
        dinnerParty aDinnerParty = new dinnerParty();

        // Prompt user for number of guests for the Party
       // System.out.print("Enter number of guests for the party >> ");
       // numberOfGuests = scanner.nextInt();

        // Set the number of guests in the Party object
       // aDinnerParty.setGuests(numberOfGuests);

        // Display the number of guests for the Party
        //System.out.println("The party has " + aDinnerParty.getGuests() + " guests");

        // Prompt user for number of guests for the DinnerParty
        System.out.print("Enter number of guests for the dinner party >> ");
        numberOfGuests = scanner.nextInt();

        // Set the number of guests for the DinnerParty
        aDinnerParty.setGuests(numberOfGuests);

        // Prompt user for dinner choice
        System.out.print("Enter the menu option -- 1 for chicken or 2 for Vegi >> ");
        dinnerChoice = scanner.nextInt();

        // Set the dinner choice for the DinnerParty
        aDinnerParty.setDinnerChoice(dinnerChoice);

        // Display the number of guests and dinner choice for the DinnerParty
        System.out.println("The dinner party has " + aDinnerParty.getGuests() + " guests");
        System.out.println("Menu option " + aDinnerParty.getDinnerChoice() + " will be served");

        // Display the invitation for the DinnerParty
        aDinnerParty.displayInvitation();

        //display thank you message to guests
        System.out.println("Dinner being served to each guest");
        int x = 1;
        while(x <= numberOfGuests){
            System.out.println("Guest " + x + " has been served.");
            x = x + 1;
        }
        aDinnerParty.thankGuests();

        //display dinner served notification

        aDinnerParty.serveDinner();

        // Close Scanner
        scanner.close();
    }
}
