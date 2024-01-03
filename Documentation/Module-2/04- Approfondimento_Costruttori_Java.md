# Approfondimento sui Costruttori in Java

## Livello di Accessibilità del Costruttore
Discussione sull'importanza della scelta del livello di accessibilità del costruttore, con enfasi sul perché tendono ad essere dichiarati come `public`.

## Uso della Keyword 'this'
Spiegazione dettagliata dell'uso di 'this' nel costruttore per distinguere tra i campi dell'oggetto e i parametri passati.

## Richiamo del Costruttore
Esempi pratici tratti da `Main.java` che mostrano come i costruttori vengono richiamati per creare nuovi oggetti.


# Approfondimento sui Costruttori in Java

## Livello di Accessibilità del Costruttore
I costruttori in Java sono spesso dichiarati come `public` per permettere la creazione di oggetti da qualsiasi altra classe. Ad esempio, il costruttore della classe `Car` è pubblico, consentendo di istanziare oggetti `Car` in `Main.java`.

```java
public class Car {
    // Campi dell'oggetto
    String make;
    double price;
    int year;
    String color;

    // Costruttore pubblico
    public Car(String make, double price, int year, String color) {
        // ...
    }
}
```

## Uso della Keyword 'this'
Nel costruttore di `Car`, usiamo `this` per riferirci ai campi dell'oggetto e distinguerli dai parametri del costruttore. Questo è essenziale quando i nomi dei parametri sono gli stessi dei nomi dei campi.

```java
public Car(String make, double price, int year, String color) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
}
```

## Richiamo del Costruttore
Il costruttore viene richiamato quando creiamo un nuovo oggetto. In `Main.java`, istanziamo due oggetti `Car` usando il costruttore di `Car`.

```java
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");
        // ...
    }
}
```

In questo esempio, i costruttori di `nissan` e `dodge` sono chiamati con i valori specifici per ogni oggetto.
