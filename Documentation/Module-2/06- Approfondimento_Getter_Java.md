
# Approfondimento sui Getter in Java

I getter sono metodi fondamentali nella programmazione orientata agli oggetti in Java, utilizzati per accedere in modo sicuro ai campi privati di un oggetto.

## Accesso Diretto ai Campi e i Rischi
L'accesso diretto ai campi di un oggetto può portare a modifiche accidentali e non sicure. Per questo, è pratica comune rendere i campi delle classi privati. Questo impedisce l'accesso diretto ai campi da parte di codice esterno alla classe, aumentando la sicurezza e l'incapsulamento:

```java
public class Car {
    private String make;
    private double price;
    private int year;
    private String color;

    // Costruttore
    public Car(String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }
}
```

## Definizione e Uso dei Getter
Se i campi sono privati, i metodi getter vengono utilizzati per accedere ai loro valori. I getter sono generalmente pubblici (`public`) e restituiscono il tipo di dato del campo a cui si riferiscono. Il nome di un getter di solito inizia con 'get' seguito dal nome del campo con la prima lettera maiuscola:

```java
public class Car {
    // Campi privati...

    public String getMake() {
        return this.make;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public String getColor() {
        return this.color;
    }
}
```

In questo esempio, i metodi `getMake()`, `getPrice()`, `getYear()` e `getColor()` sono getter che permettono di accedere ai rispettivi campi privati della classe `Car`.

## Funzionamento dei Getter
Un getter restituisce il valore del campo dell'oggetto corrente che lo chiama. Questo permette di leggere i valori dei campi senza modificarli direttamente, mantenendo l'integrità dell'oggetto:

```java
public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Nissan", 10000, 2020, "Green");
        Car dodge = new Car("Dodge", 11000, 2019, "Blue");

        System.out.println("This " + nissan.getMake() + " is worth $" + nissan.getPrice() +
                           ". It was built in " + nissan.getYear() + ". It is " + nissan.getColor() + ".\n");
        System.out.println("This " + dodge.getMake() + " is worth $" + dodge.getPrice() +
                           ". It was built in " + dodge.getYear() + ". It is " + dodge.getColor() + ".\n");
    }
}
```

In `Main.java`, utilizziamo i getter per accedere ai campi dell'oggetto `Car` senza modificarli direttamente.

## Conclusioni
I getter sono uno strumento essenziale per mantenere l'integrità e la sicurezza delle classi in Java, permettendo di accedere ai campi privati in modo controllato.
