abstract class LibraryItem {
    protected String title;
    protected String itemId;
    protected boolean isCheckedOut;

    public LibraryItem(String title, String itemId, boolean isCheckedOut) {
        this.title = title;
        this.itemId = itemId;
        this.isCheckedOut = isCheckedOut;
    }

    abstract void checkOut();
    abstract void returnItem();
    abstract void printDetails();

}
