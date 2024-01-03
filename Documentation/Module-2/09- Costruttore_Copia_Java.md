
# Costruttore Copia in Java

Il costruttore copia è una caratteristica fondamentale nella gestione di oggetti mutabili in Java. Questa documentazione esplora il concetto di costruttore copia e la sua importanza.

## Oggetti Mutabili e Trappola del Riferimento
In Java, gli oggetti mutabili sono quegli oggetti i cui stati (campi) possono essere modificati dopo la loro creazione. Questi oggetti sono spesso dotati di setter per aggiornare i loro campi. Tuttavia, se due variabili puntano allo stesso oggetto mutabile, la modifica dello stato tramite una variabile si rifletterà anche sull'altra. Ad esempio:

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green");
Car nissan2 = nissan;

nissan2.setColor("Yellow");
// Ora anche nissan ha il colore "Yellow"
```

In questo caso, `nissan` e `nissan2` puntano allo stesso oggetto `Car`. La modifica del colore tramite `nissan2` cambia il colore anche per `nissan`.

## Definizione del Costruttore Copia
Un costruttore copia in Java è un costruttore che crea un nuovo oggetto come copia di un oggetto esistente. La sua definizione si basa sulla copia dei valori dei campi dall'oggetto originale all'oggetto appena creato:

```java
public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    // Costruttore copia
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
    }
}
```

In questo esempio, il costruttore copia prende come parametro un oggetto `Car` e ne copia tutti i campi nel nuovo oggetto.

## Utilizzo del Costruttore Copia
Il costruttore copia è utilizzato per creare una copia indipendente dell'oggetto originale. Modificare la copia non influenzerà l'oggetto originale:

```java
Car nissan = new Car("Nissan", 10000, 2020, "Green");
Car nissan2 = new Car(nissan);

nissan2.setColor("Yellow"); // Cambia solo il colore di nissan2
```

In questo caso, `nissan2` è una copia indipendente di `nissan`. Modificare `nissan2` non ha effetti su `nissan`.

## Conclusione
Il costruttore copia è uno strumento essenziale per gestire oggetti mutabili in Java, offrendo un modo per creare copie indipendenti degli oggetti e prevenire modifiche non intenzionali.
