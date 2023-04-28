 import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BooksPage extends JFrame implements ActionListener {

    // Combo box to select a book
    private JComboBox<String> bookComboBox;

    // ArrayList to store the books
    private ArrayList<Book> books = new ArrayList<>();

    // Labels and buttons
    private JLabel titleLabel, authorLabel, copiesLabel;
    private JButton rentButton;

    // Number of copies rented
    private int copiesRented = 0;

    public BooksPage() {
        // Set up the window
        setTitle("Book Rental");
        setSize(850, 530);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set up the books
        books.add(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 2));
        books.add(new Book("Don Quixote", "Miguel de Cervantes", 3));
        books.add(new Book("Alice's Adventures in Wonderland", "Lewis Carroll", 4));

        // Set up the combo box
        bookComboBox = new JComboBox<String>();
        bookComboBox.setBorder(null);
        bookComboBox.setBackground(Color.WHITE);
        bookComboBox.setBounds(396, 100, 290, 34);
        for (Book book : books) {
            bookComboBox.addItem(book.getTitle());
        }
        bookComboBox.addActionListener(this);

        // Set up the labels
        titleLabel = new JLabel("");
        titleLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        titleLabel.setBounds(313, 170, 448, 41);
        authorLabel = new JLabel("");
        authorLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        authorLabel.setBounds(313, 248, 408, 34);
        copiesLabel = new JLabel("");
        copiesLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
        copiesLabel.setBounds(313, 331, 408, 34);

        // Set up the rent button
        rentButton = new JButton("");
        rentButton.setIcon(new ImageIcon(BooksPage.class.getResource("/image/Rentbutton.png")));
        rentButton.setBounds(193, 406, 468, 48);
        rentButton.addActionListener(this);

        // Add components to the window
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(bookComboBox);
        panel.add(titleLabel);
        JLabel label_1 = new JLabel();
        label_1.setBounds(109, 64, 161, 41);
        panel.add(label_1);
        panel.add(authorLabel);
        JLabel label_2 = new JLabel();
        label_2.setBounds(322, 71, 161, 70);
        panel.add(label_2);
        panel.add(copiesLabel);
        JLabel label_3 = new JLabel();
        label_3.setBounds(161, 141, 161, 70);
        panel.add(label_3);
        JLabel label_4 = new JLabel();
        label_4.setBounds(322, 141, 161, 70);
        panel.add(label_4);
        panel.add(rentButton);

        getContentPane().add(panel);
        
        JLabel Titlebackground = new JLabel("");
        Titlebackground.setIcon(new ImageIcon(BooksPage.class.getResource("/image/Titlebg.png")));
        Titlebackground.setBounds(77, 161, 702, 63);
        panel.add(Titlebackground);
        
        JLabel Authorbackground = new JLabel("");
        Authorbackground.setIcon(new ImageIcon(BooksPage.class.getResource("/image/Authorbg.png")));
        Authorbackground.setBounds(77, 235, 702, 63);
        panel.add(Authorbackground);
        
        JLabel CopiesAvailableBackground = new JLabel("");
        CopiesAvailableBackground.setIcon(new ImageIcon(BooksPage.class.getResource("/image/CopiesBg.png")));
        CopiesAvailableBackground.setBounds(77, 318, 702, 63);
        panel.add(CopiesAvailableBackground);
        
        JLabel SelectBooklabel = new JLabel("");
        SelectBooklabel.setIcon(new ImageIcon(BooksPage.class.getResource("/image/Selectbg.png")));
        SelectBooklabel.setBounds(78, 85, 701, 63);
        panel.add(SelectBooklabel);
        
        JLabel BookRentalLabel = new JLabel("Book Rental Page");
        BookRentalLabel.setForeground(Color.WHITE);
        BookRentalLabel.setFont(new Font("Segoe UI", Font.BOLD | Font.ITALIC, 30));
        BookRentalLabel.setBounds(300, 29, 259, 45);
        panel.add(BookRentalLabel);
        
        JLabel RentalpageBackground = new JLabel("");
        RentalpageBackground.setIcon(new ImageIcon(BooksPage.class.getResource("/image/LibrarySystemHPBackground.jpg")));
        RentalpageBackground.setBounds(0, 0, 834, 491);
        panel.add(RentalpageBackground);

        // Display the window
        setVisible(true);
        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bookComboBox) {
            // Update the book information labels
            int index = bookComboBox.getSelectedIndex();
            Book selectedBook = books.get(index);
            titleLabel.setText(selectedBook.getTitle());
            authorLabel.setText("" + selectedBook.getAuthor());
            copiesLabel.setText("" + selectedBook.getCopies());
        } else if (e.getSource() == rentButton) {
            // Rent a copy of the selected book
            int index = bookComboBox.getSelectedIndex();
            Book selectedBook = books.get(index);
            if (selectedBook.getCopies() > 0) {
                selectedBook.setCopies(selectedBook.getCopies() - 1);
                copiesRented++;
                JOptionPane.showMessageDialog(this, "Book rented successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Sorry, there are no copies available of this book.");
            }

            // Ask the user if they want to rent another book
            int choice = JOptionPane.showConfirmDialog(this, "Do you want to rent another book?", "Rent another book?", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
                // Reset

                // Reset the combo box selection and clear the book information labels
                bookComboBox.setSelectedIndex(0);
                titleLabel.setText("Title:");
                authorLabel.setText("Author");
                copiesLabel.setText("Copies Available:");
            } else {
                // End the program
                JOptionPane.showMessageDialog(this, "You rented " + copiesRented + " books. Thank you for using the Book Rental System.");
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new BooksPage();
    }

    private class Book {
        private String title;
        private String author;
        private int copies;

        public Book(String title, String author, int copies) {
            this.title = title;
            this.author = author;
            this.copies = copies;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getCopies() {
            return copies;
        }

        public void setCopies(int copies) {
            this.copies = copies;
        }
    }
    }
