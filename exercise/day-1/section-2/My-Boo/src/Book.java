public class Book extends LibraryItem{
    private String author;
    private int pages;

    public Book(String title, String itemId, boolean isCheckedOut, String author, int pages) {
        super(title, itemId, isCheckedOut);
        this.author = author;
        this.pages = pages;
    }

    @Override
    public void checkOut() {
        if(!isCheckedOut){
            isCheckedOut = true;
            System.out.println("Buku berhasil dipinjam");
        }else{
            System.out.println("Buku sedang dipinjam");
        }
    }

    @Override
    void returnItem() {
        if(isCheckedOut){
            isCheckedOut = false;
            System.out.println("Buku berhasil dikembalikan");
        }else{
            System.out.println("Buku sedang tidak dipinjam");
        }
    }

    @Override
    void printDetails() {
        System.out.println(itemId + " Title: " + title + " Author: " + author + " Pages: " + pages);
    }
}
