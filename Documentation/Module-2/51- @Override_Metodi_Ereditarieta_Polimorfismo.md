
# Sovrascrittura dei Metodi in Java

## Introduzione alla Sovrascrittura dei Metodi
La sovrascrittura dei metodi è una caratteristica fondamentale dell'ereditarietà in Java. Consente alle classi figlie di fornire una propria implementazione di un metodo ereditato dalla classe genitore.

## Implementazione nei File Forniti
Nei file esaminati, le classi `Shirt` e `Pants` sovrascrivono il metodo `fold()` ereditato dalla classe genitore `Product`.

### Classe Genitore: Product
```java
public class Product {
    public void fold() {
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }
    // Altri campi e metodi...
}
```
Il metodo `fold()` in `Product` fornisce un'implementazione di base.

### Classe Figlia: Shirt
```java
public class Shirt extends Product {
    @Override
    public void fold() {
        System.out.println("Lay a shirt on a flat surface.");
        System.out.println("Fold the shirt sideways.");
        System.out.println("Bring sleeves in.");
        System.out.println("Fold from bottom up.");
    }
    // Altri campi e metodi...
}
```
`Shirt` sovrascrive `fold()` per fornire istruzioni specifiche su come piegare una camicia. Altrimenti verrebbe richiamato il metodo `fold()` di `Product`

### Classe Figlia: Pants
```java
public class Pants extends Product {
    @Override
    public void fold() {
        System.out.println("Hold the pants upright.");
        System.out.println("Fold one leg over the other.");
        System.out.println("Fold pants from bottom in thirds.");
    }
    // Altri campi e metodi...
}
```
Analogamente, `Pants` sovrascrive `fold()` per fornire istruzioni specifiche su come piegare i pantaloni. Altrimenti verrebbe richiamato il metodo `fold()` di `Product`

## Uso del Metodo Sovrascritto nel Main
```java
public static void productStore(Product product) {
    System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName()+ ". Your total comes to " + product.getPrice());
    product.fold();
}
```
Nel metodo `productStore`, quando viene invocato `fold()` su un oggetto `Product`, verrà chiamata l'implementazione sovrascritta in base al tipo effettivo dell'oggetto (`Shirt` o `Pants`).

## Importanza dell'Annotazione @Override
L'annotazione `@Override` assicura che il metodo nella classe figlia stia effettivamente sovrascrivendo un metodo nella classe genitore. Aiuta a prevenire errori, come la mancata corrispondenza del nome del metodo, garantendo che la sovrascrittura sia intenzionale e corretta.

## Conclusione
La sovrascrittura dei metodi in Java permette alle classi figlie di definire comportamenti specifici per metodi ereditati, mantenendo allo stesso tempo una struttura comune definita nella classe genitore. Questo approccio migliora la flessibilità e la riutilizzabilità del codice.
