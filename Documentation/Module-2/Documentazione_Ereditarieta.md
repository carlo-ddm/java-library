
# Ereditarietà in Java

## Introduzione all'Ereditarietà
L'ereditarietà è uno dei pilastri fondamentali della programmazione orientata agli oggetti. Essa permette di creare una classe base (genitore) da cui altre classi (figlie) possono ereditare campi e metodi, favorendo il riutilizzo del codice e riducendo la ridondanza.

## Esempio Pratico
Consideriamo due classi, `Shirt` e `Pants`, che condividono attributi comuni come prezzo, colore e marca. Invece di ripetere questi attributi in entrambe le classi, possiamo definire una classe genitore `Product` che li contiene.

### Classe Genitore: Product
```java
public class Product {
    private double price;
    private String color;
    private String brand;

    public void fold() {
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

    // Getter e Setter per price, color e brand
}
```
Qui, `Product` definisce campi comuni e un metodo `fold`. Le classi figlie erediteranno questi membri.

### Classe Figlia: Shirt
```java
public class Shirt extends Product {
    private Size size;
    public enum Size {SMALL, MEDIUM, LARGE}

    // Getter e Setter per size
}
```
`Shirt` estende `Product`, ereditando i suoi campi e metodi, e aggiunge un campo specifico `size`.

### Classe Figlia: Pants
```java
public class Pants extends Product {
    private int waist;
    private int length;

    // Getter e Setter per waist e length
}
```
Analogamente, `Pants` estende `Product`, ereditando gli stessi membri e aggiungendo i campi `waist` e `length`.

## Ereditarietà in Azione
Nel metodo `main`, creiamo oggetti di `Shirt` e `Pants` e vediamo come possono utilizzare sia i loro metodi specifici che quelli ereditati da `Product`.

### Main.java
```java
public class Main {
    public static void main(String[] args) {
        Shirt shirt = new Shirt();
        shirt.setSize(Shirt.Size.LARGE);
        shirt.setBrand("NIKE");
        shirt.setPrice(49.99);
        shirt.setColor("Blue");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(48);
        pants.setLength(71);
        pants.setBrand("LEVI'S");
        pants.setPrice(120.99);
        pants.setColor("Black");
        pants.fold();
    }
}
```
Qui, `shirt` e `pants` utilizzano sia i metodi definiti nella loro classe che quelli ereditati da `Product`.

## Conclusione
L'ereditarietà in Java permette di scrivere codice più pulito e riutilizzabile, riducendo la ridondanza e migliorando la manutenibilità del codice.
