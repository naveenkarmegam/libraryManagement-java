package libraryManagement;

public class Card {
	 int cardNumber;
	    User user;
	    Book borrowedBook;
	    boolean isBookReturned;

	    public Card(int cardNumber, User user, Book borrowedBook) {
	        this.cardNumber = cardNumber;
	        this.user = user;
	        this.borrowedBook = borrowedBook;
	        this.isBookReturned = false;
	    }

	    public String toString() {
	        return "Card Number: " + cardNumber + "\n" + user + "\n" + borrowedBook + "\nBook Returned: " + isBookReturned;
	    }
}
