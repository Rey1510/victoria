public class DVD extends LibraryItem {
    private String director;
    private int duration;

    public DVD(String title, String itemId, boolean isCheckedOut, String director, int duration) {
        super(title, itemId, isCheckedOut);
        this.director = director;
        this.duration = duration;
    }

    @Override
    void checkOut() {
        if(!isCheckedOut){
            isCheckedOut = true;
            System.out.println("DVD berhasil dipinjam");
        }else {
            System.out.println("DVD tidak tersedia");
        }
    }

    @Override
    void returnItem() {
        if(isCheckedOut){
            isCheckedOut = false;
            System.out.println("DVD berhasil dikembalikan");
        }else{
            System.out.println("DVD sedang tidak dipinjam");
        }
    }

    @Override
    void printDetails() {
        System.out.println(itemId+" Judul: "+title+" Director: "+director+" Duration: "+duration);
    }
}
