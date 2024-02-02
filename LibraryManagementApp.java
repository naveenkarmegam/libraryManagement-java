package libraryManagement;

public class LibraryManagementApp {
	public static void main(String[] args) {
		User user1 = new User("Naveen", 24, "HTT");	
        Book book1 = new Book("The Great Gatsby",1925 ,"F. Scott Fitzgerald");
        Card card1 = new Card(1001, user1, book1);
        ReminderMessage reminderMessage1 = new ReminderMessage("Please return the book by due date.");
        System.out.println(user1);
        System.out.println(book1);
        System.out.println(card1);
//        System.out.println(reminderMessage1);
	}
}
