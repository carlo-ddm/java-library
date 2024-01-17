
# La Parola Chiave 'abstract' in Java

## Introduzione
La parola chiave `abstract` in Java è utilizzata per creare classi astratte e metodi astratti. Una classe astratta è una classe da cui non è possibile creare direttamente oggetti, mentre un metodo astratto è un metodo che deve essere implementato nelle classi figlie.

## La Classe Astratta 'Product'
La classe `Product` è un esempio di classe astratta che definisce un metodo astratto `fold`. Essendo astratta, non può essere istanziata direttamente.

```java
public abstract class Product {
    // Campi e costruttore...

    public abstract void fold();
}
```

## Sovrascrittura del Metodo 'fold'
Le classi `Shirt` e `Pants` sovrascrivono il metodo `fold`. Nella loro implementazione, usano `super.fold()` per chiamare il metodo `fold` della classe genitore `Product` prima di aggiungere le loro specifiche istruzioni di piegatura.

### Classe 'Shirt'
```java
public class Shirt extends Product {
    @Override
    public void fold() {
        super.fold(); // Chiamata al metodo fold() di Product
        System.out.println("Lay a shirt on a flat surface.");
        System.out.println("Fold the shirt sideways.");
        System.out.println("Bring sleeves in.");
        System.out.println("Fold from bottom up.");
    }
}
```

### Classe 'Pants'
```java
public class Pants extends Product {
    @Override
    public void fold() {
        super.fold(); // Chiamata al metodo fold() di Product
        System.out.println("\nHold the pants upright.");
        System.out.println("Fold one leg over the other.");
        System.out.println("Fold pants from bottom in thirds.");
    }
}
```

In entrambe le classi, `Shirt` e `Pants`, l'uso di `super.fold()` svolge un ruolo fondamentale. Questo comando chiama il metodo `fold()` definito nella classe genitore `Product`, mantenendo così la parte generale del comportamento di piegatura. È importante sottolineare che, dato che la classe `Product` è astratta e non può essere istanziata, `super.fold()` diventa l'unico modo per eseguire il codice di piegatura generale definito in `Product`.

Quando `super.fold()` viene chiamato all'interno delle classi figlie `Shirt` e `Pants`, esso esegue prima il comportamento di base della piegatura come definito in `Product`. Successivamente, le istruzioni specifiche per ciascun tipo di indumento - camicie o pantaloni - vengono eseguite attraverso le sovrascritture del metodo `fold()` nelle rispettive classi figlie. 

Questo approccio garantisce che, nonostante l'impossibilità di creare oggetti direttamente dalla classe astratta `Product`, il codice essenziale di `Product` sia comunque riutilizzato e integrato nelle classi figlie. Di conseguenza, `super.fold()` diventa un ponte che collega l'implementazione generica in una classe genitore astratta con personalizzazioni specifiche nelle sue classi figlie concrete.

## Conclusione
L'utilizzo della parola chiave `abstract` in Java consente di definire classi e metodi che forniscono un framework astratto e flessibile. Le classi figlie possono costruire su questo framework, sovrascrivendo i metodi astratti per fornire implementazioni concrete e specifiche.
