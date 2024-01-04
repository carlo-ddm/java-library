# Fix dei Costruttori in Java: Evitare la Trappola delle Referenze

In Java, è cruciale comprendere e gestire correttamente il comportamento dei riferimenti, specialmente nei costruttori. Questa documentazione illustra come i costruttori nel codice fornito evitano la trappola delle referenze, specialmente nel caso di array e oggetti mutabili.

## Costruttore Standard e Costruttore Copia

### Costruttore Standard
Nel costruttore standard della classe `Car`, troviamo un esempio di come gestire correttamente gli array per evitare la condivisione indesiderata di riferimenti. 

```java
public Car(String make, double price, int year, String color, String[] parts) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
    this.parts = Arrays.copyOf(parts, parts.length);
}
```

Qui, `Arrays.copyOf()` è utilizzato per creare una copia dell'array `parts` anziché assegnare direttamente il riferimento. Questo assicura che ogni oggetto `Car` abbia una copia unica dell'array, prevenendo modifiche accidentali attraverso altri oggetti.

```java
public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tires", "Keys"};
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);

        Car nissan2 = new Car(nissan);
        nissan2.setColor("Yellow");

        spareParts[0] = "Window";

        nissan.drive();
        dodge.drive();
        nissan2.drive();
    }
}
```

In questo esempio, la modifica dell'array `spareParts` non influisce su `nissan` e `dodge`, dimostrando che il costruttore copia ha creato un array `parts` separato.

### Costruttore Copia
Analogamente, nel costruttore copia, vediamo un approccio simile:

```java
public Car(Car source) {
    this.make = source.make;
    this.price = source.price;
    this.year = source.year;
    this.color = source.color;
    this.parts = Arrays.copyOf(source.parts, source.parts.length);
}
```

Utilizzando `Arrays.copyOf()` nel costruttore copia, si garantisce che il nuovo oggetto `Car` abbia una propria copia indipendente dell'array `parts`, isolata da quella dell'oggetto sorgente.

## Applicazione nel Main.java
Per dimostrare l'efficacia di questi fix, diamo uno sguardo al file `Main.java`:

```java
public class Main {
    public static void main(String[] args) {
        String[] spareParts = new String[] {"Tires", "Keys"};
        Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
        Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);

        Car nissan2 = new Car(nissan);
        nissan2.setColor("Yellow");

        spareParts[0] = "Window";

        nissan.drive();
        dodge.drive();
        nissan2.drive();
    }
}
```

In questo esempio, la modifica dell'array `spareParts` non influisce su `nissan2`, dimostrando che il costruttore copia ha creato un array `parts` separato.

## Conclusione
I costruttori in Java devono essere attentamente progettati per gestire correttamente i riferimenti, specialmente quando si trattano oggetti mutabili. La pratica di creare copie indipendenti di oggetti e array nei costruttori aiuta a prevenire errori e rende il codice più robusto e sicuro.
