public interface LibraryManagement {

    public void addItem(LibraryItem item);

    public void removeItem(String itemId);

    public void listAllItems();

    public void checkOutItem(String itemID);

    public void returnItem(String itemID);

    LibraryItem searchByTitle(String title);

}
