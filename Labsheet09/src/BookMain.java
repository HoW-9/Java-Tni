public class BookMain {
    public static void main(String[] args) {
        String author_Name = "Malee Aroina";
        String nationality = "Thai";
        int birthyear = 2006;
        Author author = new Author(author_Name,nationality,birthyear);
        System.out.println(author.showAuthorInfo());

        String title = "Java Programming";
        String category = "Programming Language";
        double price = 375.25;
        Book book = new Book(title,category,price,author);
        System.out.println(book);
    }
}
