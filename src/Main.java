public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев" , "Толстой");
        Author ivanTurgenev = new Author("Иван", "Тургеньев");
        Book warAndPeace = new Book("Война и Мир", 1867, levTolstoy);
        Book fathersAndChildrens = new Book("Отцы и дети", 1861, ivanTurgenev);
        System.out.println("Год публикации: " + fathersAndChildrens.getPublicationYear());
        fathersAndChildrens.setPublicationYear(1862);
        System.out.println("Год публикации: " + fathersAndChildrens.getPublicationYear());
        System.out.println("Год публикации: " + warAndPeace.getPublicationYear());

    }

}