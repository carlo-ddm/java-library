# Utilizzo dei Metodi nella Programmazione Orientata agli Oggetti (OOP)

Nella programmazione orientata agli oggetti (OOP), i metodi sono funzioni o procedure associate a una classe. In Java, i metodi sono utilizzati per definire il comportamento degli oggetti.

## Concetti Chiave dei Metodi in OOP
- **Definizione**: Un metodo è definito all'interno di una classe e può accedere ai campi (variabili) e ad altri metodi della classe.
- **Accesso**: I metodi possono essere pubblici (`public`), privati (`private`), protetti (`protected`) o di pacchetto (nessun modificatore di accesso), a seconda della necessità di accesso.
- **Comportamento**: Definiscono le azioni che un oggetto della classe può eseguire.

## Esempio di Metodo in Java
Nel codice allegato, la classe `Car` include diversi metodi, tra cui `drive()`, che stampa dettagli sulla macchina:

```java
public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    public Car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    public void drive() {
        System.out.println("\nYou bought a beautiful " + this.year + " " + this.color + " " + this.make + " for " + this.price + ".");
        System.out.println("Please drive your car to the nearest exit.");
    }
}
```

## Utilizzo dei Metodi in OOP
I metodi sono utilizzati per interagire con gli oggetti. Ad esempio, nel `main` della classe `Main`, creiamo diversi oggetti `Car` e invochiamo il loro metodo `drive()`:

```java
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        nissan.drive();
        dodge.drive();
    }
}
```

Questo mostra come i metodi `drive()` di ciascuna istanza di `Car` vengono utilizzati per eseguire un'azione specifica.

## Conclusione
I metodi sono una parte essenziale della OOP in Java. Forniscono un modo per definire e controllare il comportamento degli oggetti, rendendo il codice più organizzato, riutilizzabile e manutenibile.
