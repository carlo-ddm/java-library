
# Costruttori in Ereditarietà e Polimorfismo in Java

## Introduzione
I costruttori giocano un ruolo cruciale nell'ereditarietà e nel polimorfismo in Java. Essi permettono di inizializzare gli oggetti quando vengono creati, garantendo che tutti i campi necessari siano impostati correttamente.

## Implementazione dei Costruttori
Nei casi di ereditarietà, le classi figlie possono avere propri costruttori che chiamano anche i costruttori delle classi genitore per inizializzare i campi ereditati.

### Classe Genitore: Product
```java
public class Product {
    public Product(double price, String color, String brand) {
        setPrice(price);
        setColor(color);
        setBrand(brand);
    }
    // Metodi setter e getter...
}
```
Il costruttore di `Product` imposta i campi `price`, `color` e `brand`.

### Classe Figlia: Shirt
```java
public class Shirt extends Product {
    public Shirt(double price, String color, String brand, Size size) {
        super(price, color, brand);
        setSize(size);
    }
    // Altri metodi...
}
```
Il costruttore di `Shirt` chiama il costruttore di `Product` con `super`, passando i valori per i campi ereditati, e poi imposta il campo `size` specifico della classe `Shirt`.

### Classe Figlia: Pants
```java
public class Pants extends Product {
    public Pants(double price, String color, String brand, int waist, int length) {
        super(price, color, brand);
        setWaist(waist);
        setLength(length);
    }
    // Altri metodi...
}
```
Il costruttore di `Pants` funziona in modo simile, utilizzando `super` per i campi ereditati e impostando i suoi campi specifici `waist` e `length`.

## Uso dei Costruttori nel Main
```java
Shirt shirt = new Shirt(49.99, "Blue", "NIKE", LARGE);
Pants pants = new Pants(120.99, "Black", "LEVI'S", 48, 80);
```
Nel metodo `main`, gli oggetti `Shirt` e `Pants` vengono creati utilizzando i rispettivi costruttori che inizializzano sia i campi ereditati che quelli specifici.

## Conclusioni
I costruttori nelle classi figlie, combinati con la chiamata al costruttore della classe genitore tramite `super`, forniscono un meccanismo efficace per inizializzare correttamente gli oggetti in scenari di ereditarietà e polimorfismo. Questo assicura che tutti i campi dell'oggetto, sia ereditati che specifici, siano impostati al momento della creazione dell'oggetto.
