import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<Magazine>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(this.magazines.get(index));
    }

    public void setMagazine(Magazine magazine, int index) {
        // Metodo set di magazines (ovverosia dell'ArrayList)
        this.magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine) {
        this.magazines.add(new Magazine(magazine));
    }
}
