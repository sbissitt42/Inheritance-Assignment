
public class dinnerParty extends Party {
    // Additional variable for dinner menu choice
    private int dinnerChoice;

    // Methods for dinnerChoice
    // Getter method for dinnerChoice
    public int getDinnerChoice() {
        return dinnerChoice;
    }

    // Setter method for dinnerChoice
    public void setDinnerChoice(int choice) {
        dinnerChoice = choice;
    }
    // Additional methods specific to DinnerParty
    public void serveDinner() {
        // You can add implementation for serving dinner based on dinnerChoice

        System.out.println("Dinner served at the party!");

    }

    public void thankGuests() {
        // You can add implementation for thanking guests after the dinner
        System.out.println("Thank you for attending the dinner party!");

    }

    // Additional methods specific to DinnerParty can be added here
}
