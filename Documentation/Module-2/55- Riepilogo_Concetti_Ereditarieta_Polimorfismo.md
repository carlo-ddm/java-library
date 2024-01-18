
# Concetti Fondamentali nella Programmazione Orientata agli Oggetti

## Ereditarietà (Keyword `extends`)
L'ereditarietà è un meccanismo chiave nella programmazione orientata agli oggetti (OOP) che permette a una classe di ereditare campi (attributi) e metodi da un'altra classe. Utilizzando la keyword `extends`, le classi figlie acquisiscono le caratteristiche della classe genitore.

```java
public class Shirt extends Product {
    // Campi e metodi di Shirt, inclusi quelli ereditati da Product
}
```

## Polimorfismo
Il polimorfismo è la capacità di un oggetto di assumere molteplici forme. In particolare, permette a un oggetto figlio di essere trattato come se fosse un oggetto del suo genitore. Questo consente l'utilizzo di un'interfaccia comune per oggetti di diverse classi, aumentando la flessibilità del codice.

## Uso di `super()` nel Costruttore
La keyword `super()` viene utilizzata all'interno del costruttore della classe figlia per richiamare il costruttore della classe genitore. Questo assicura che i campi ereditati siano inizializzati correttamente.

```java
public Shirt(double price, String color, String brand) {
    super(price, color, brand); // Chiama il costruttore di Product
}
```

## Sovrascrittura di Metodi (@Override)
Le classi figlie possono sovrascrivere metodi ereditati dalla classe genitore fornendo una propria implementazione. Utilizzando l'annotazione `@Override`, si garantisce che il metodo nella classe figlia sovrascriva effettivamente un metodo nella classe genitore.

```java
@Override
public void fold() {
    // Implementazione specifica di fold in Shirt o Pants
}
```

## Accesso ai Membri del Genitore con `super`
`super` viene utilizzato per accedere ai campi e metodi della classe genitore, soprattutto in situazioni di ombreggiatura, dove i nomi dei campi o dei metodi nella classe figlia e genitore coincidono.

```java
public void someMethod() {
    super.someMethod(); // Chiama il metodo della classe genitore
}
```

## Classe Astratta (Keyword `abstract`)
Una classe astratta è una classe che non può essere istanziata. Serve come modello per le classi figlie, definendo metodi e campi comuni. Le classi astratte sono utili per rappresentare concetti astratti e base per ulteriori derivazioni.

```java
public abstract class Product {
    // Campi comuni e metodi astratti
}
```

## Metodi Astratti (Keyword `abstract`)
Un metodo astratto è un metodo senza implementazione nella classe genitore. Le classi figlie sono obbligate a fornire un'implementazione specifica per questi metodi.

```java
public abstract void wear();
```

In questo contesto, le classi figlie di `Product`, come `Shirt` e `Pants`, devono implementare il metodo `wear`.

## Conclusione
Questi concetti sono pilastri della OOP e permettono di costruire software flessibile, riutilizzabile e facilmente mantenibile, promuovendo un design modulare e una gerarchia chiara tra le classi.
