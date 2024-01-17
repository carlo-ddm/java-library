
# Uso della Parola Chiave 'super' in Java per Accedere ai Membri della Classe Genitore

## Introduzione
In Java, la parola chiave `super` è utilizzata per fare riferimento direttamente ai membri (metodi o campi) della classe genitore di una classe. Questo è particolarmente utile nelle situazioni di ereditarietà, dove una classe figlia necessita di accedere a metodi o campi definiti nella sua classe genitore.

## Accesso ai Metodi della Classe Genitore con `super`
Quando una classe figlia sovrascrive un metodo ereditato dalla classe genitore, può utilizzare `super` seguito dalla sintassi a punto per chiamare la versione del metodo della classe genitore.

### Esempio nel Codice
Nelle classi `Shirt` e `Pants`, entrambe estendono la classe `Product` e sovrascrivono il suo metodo `fold()`. Tuttavia, prima di eseguire il loro codice specifico, chiamano il metodo `fold()` della classe genitore usando `super`.

#### Classe Shirt
```java
public class Shirt extends Product {
    @Override
    public void fold() {
        super.fold(); // Chiamata al metodo fold() di Product
        // Istruzioni specifiche per piegare una camicia
    }
}
```

#### Classe Pants
```java
public class Pants extends Product {
    @Override
    public void fold() {
        super.fold(); // Chiamata al metodo fold() di Product
        // Istruzioni specifiche per piegare i pantaloni
    }
}
```

In entrambi i casi, `super.fold()` invoca prima il metodo `fold()` definito nella classe genitore `Product`, dopodiché viene eseguito il codice specifico della classe figlia.

## Uso di `super` nei Costruttori
Come accennato in una precedente documentazione, `super` viene anche utilizzato nei costruttori delle classi figlie per chiamare i costruttori della classe genitore. Questo assicura che l'inizializzazione definita nella classe genitore venga eseguita prima di qualsiasi inizializzazione specifica della classe figlia.

## Conclusione
L'uso della parola chiave `super` per accedere ai membri della classe genitore permette una maggiore flessibilità e riutilizzabilità del codice in scenari di ereditarietà. Permette alle classi figlie di costruire sui comportamenti definiti nella classe genitore, estendendo o personalizzando il loro comportamento in base alle esigenze.
