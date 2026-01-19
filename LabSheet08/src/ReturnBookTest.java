import javax.swing.*;

public class ReturnBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programming",5);
        while (true){
        int choice = JOptionPane.showConfirmDialog(null,
                "Do you want to borrow/return book?",
                "Borrow/Return Book",JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION){
            int menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "Press 1 to borrow book"+"\nPress 2 to return book"));
            if (menu == 1 ){
                book.borrowBook();
                System.out.println("Borrowed 1 book, available "
                        + book.getAvailableBook() + " books.");
            }
            if (book.getAvailableBook() == 0){
                JOptionPane.showMessageDialog(null,
                        "No books available to borrow…",
                        "WARNING MESSAGE",JOptionPane.WARNING_MESSAGE);
            }
            if (menu == 2){
                book.returnBook();
                System.out.println("Returned 1 book, available "
                        + book.getAvailableBook() + " books.");
            }

        }else {
            break;
        }
        }
    }
}
