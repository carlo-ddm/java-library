# Introduzione ai Costruttori in Java

## L'importanza dei Costruttori
Senza un costruttore, l'inizializzazione di un oggetto avviene in modo frammentario, assegnando i valori ai campi uno dopo l'altro. Questo processo può diventare ingombrante e meno efficiente man mano che aumentano i campi dell'oggetto.

## Creazione di un Oggetto con un Costruttore
Un costruttore migliora questo processo. Ad esempio:
```java
Car toyota = new Car("Toyota", 10000, 2020, "Green");
```
Qui, un oggetto `Car` è creato e i suoi campi sono inizializzati simultaneamente tramite il costruttore.

## Funzionamento di un Costruttore
Il costruttore di `Car` potrebbe apparire così:
```java
public class Car {
    String make;
    int price;
    int year;
    String color;

    public Car(String make, int price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }
}
```
Questo costruttore inizializza i campi dell'oggetto `Car` con i valori forniti.

## Il ruolo della parola chiave `this`
`this` è usato per riferirsi all'oggetto corrente. Nel costruttore, `this.make = make` assegna il valore del parametro `make` al campo `make` dell'oggetto.
