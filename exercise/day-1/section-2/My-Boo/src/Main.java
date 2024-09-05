public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("The Great Gatsby", "B001", true, "F. Scott Fitzgerald", 180);
        Book book2 = new Book("1984", "B002", false,"George Orwell", 328);
        DVD dvd1 = new DVD("Inception", "D001", true, "Christopher Nolan", 148);
        DVD dvd2 = new DVD("The Matrix", "D002", false,"Lana Wachowski, Lilly Wachowski", 136);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(dvd1);
        library.addItem(dvd2);

        System.out.println("\nListing all items:");
        library.listAllItems();

        System.out.println("\nChecking out an item:");
        library.checkOutItem("B001");
        library.checkOutItem("D002");

        System.out.println("\nReturning an item:");
        library.returnItem("B002");
        library.returnItem("D001");

        System.out.println("\nSearching for an item by title:");
        LibraryItem searchedItem = library.searchByTitle("Inceptio");
        searchedItem = library.searchByTitle("Inception");

        if (searchedItem != null) {
            searchedItem.printDetails();
        }
    }
}