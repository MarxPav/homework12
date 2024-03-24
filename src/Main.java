public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Lev", "Tolstoy");
        Author ivanTurgenev = new Author("Ivan", "Turgenev");
        Book FathersAndChildren = new Book ("Fathers and Children", ivanTurgenev, 1862);
        Book WarAndPeace = new Book ("War and Peace", levTolstoy,  1867);
        WarAndPeace.setYearOfBook(1866);
        System.out.println(WarAndPeace.getAuthorName());

    }

}