public class Book {
    private String bookName;
    private Author authorName;
    private int yearOfBook;

    public Book(String bookName, Author authorName, int yearOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfBook = yearOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName.getFirstName() + ' ' + authorName.getLastName();
    }

    public void setYearOfBook (int yearOfBook) {
        this.yearOfBook = yearOfBook;
    }
}
