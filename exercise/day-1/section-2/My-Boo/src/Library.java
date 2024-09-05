import java.util.ArrayList;

public class Library implements LibraryManagement {
    private ArrayList<LibraryItem> items;

    public Library() {
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(LibraryItem item) {
        items.add(item);
        System.out.println("Item berhasil dimasukkan ke dalam library.");
    }

    @Override
    public void removeItem(String itemId) {
        for(LibraryItem en : items){
            if(en.itemId.equals(itemId)){
                items.remove(en);
            }
        }
    }

    @Override
    public void listAllItems() {
        for(LibraryItem en : items) {
            en.printDetails();
        }
    }

    @Override
    public void checkOutItem(String itemId) {
        for (LibraryItem en : items){
            if(en.itemId.equals(itemId)){
                if(!en.isCheckedOut){
                    en.isCheckedOut = true;
                    System.out.println("Item berhasil dipinjam");
                }else{
                    System.out.println("Item tidak tersedia");
                }
            }
        }
    }

    @Override
    public void returnItem(String itemId) {
        for (LibraryItem en : items){
            if(en.itemId.equals(itemId)){
                if (en.isCheckedOut){
                    en.isCheckedOut = false;
                    System.out.println("Item berhasil dikembalikan");
                }else {
                    System.out.println("Item sedang tidak dipinjam");
                }
            }
        }
    }

    @Override
    public LibraryItem searchByTitle(String title) {
        for (LibraryItem en : items) {
            if (en.title.equalsIgnoreCase(title)) {
                return en;
            }
        }
        System.out.println("Item judul \"" + title + "\" tidak ditemukan.");
        return null;
    }
}
