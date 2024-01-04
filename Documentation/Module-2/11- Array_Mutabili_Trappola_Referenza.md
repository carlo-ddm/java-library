# Array come Oggetti Mutabili in Java

Gli array in Java rappresentano un esempio classico di oggetti mutabili. Un array, una volta istanziato, può subire modifiche nei suoi elementi mantenendo lo stesso riferimento in memoria. Questa caratteristica è fondamentale nella programmazione orientata agli oggetti (OOP) in Java.

## Definizione e Inizializzazione di un Array

In Java, quando si crea un array, ad esempio `String[] spareParts = new String[4];`, si sta in effetti inizializzando un oggetto della classe `String[]`. La parola chiave `new` è utilizzata per creare un nuovo oggetto array, e non semplicemente per allocare spazio per gli elementi.

## Mutabilità degli Array

La mutabilità degli array si manifesta nella capacità di modificare i loro elementi dopo la creazione. Questo significa che, pur mantenendo lo stesso riferimento, il contenuto dell'array può essere alterato.

### Esempio Pratico

Prendiamo come esempio il seguente codice estratto dal file `Car.java`:

```java
public class Car {
    // ...
    private String[] parts;

    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts; // Trappola della referenza
    }

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts; // Trappola della referenza
    }

    public String[] getParts() {
        return this.parts;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }
}
```

E il codice nel `Main.java`:

```java
public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tires", "Keys"};
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);

        // Modificando gli elementi di spareParts
        spareParts[0] = "Windows";
        // Ora l'array spareParts, e quindi il campo parts di nissan, contiene "Windows" e "Keys"
    }
}
```

## La Trappola della Condivisione di Riferimenti

Un aspetto cruciale da considerare è la condivisione dei riferimenti di array tra oggetti diversi. Quando si assegna l'array `spareParts` a più oggetti `Car`, tutti questi oggetti condividono lo stesso array. Quindi, una modifica dell'array attraverso una delle variabili si riflette su tutti gli oggetti che condividono quel riferimento.

### Esempio della Trappola

Nel seguente esempio, vediamo come la modifica di un array tramite una variabile influisce su tutti gli oggetti che condividono quel riferimento:

```java
// ... codice precedente

Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);
spareParts[1] = "Mirror";
// Ora, sia nissan che dodge hanno un array parts che include "Windows" e "Mirror"
```

## Conclusione

Gli array in Java, in quanto oggetti mutabili, offrono flessibilità ma richiedono attenzione nella gestione dei riferimenti. La comprensione di questi concetti è fondamentale per un efficace utilizzo degli array nella programmazione orientata agli oggetti.
