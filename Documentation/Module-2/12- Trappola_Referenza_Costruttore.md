# La Trappola della Referenza nel Costruttore di Array in Java

La trappola della referenza è un problema comune nella programmazione orientata agli oggetti in Java, specialmente quando si lavora con array come oggetti mutabili. Questa documentazione analizza come si verifica questo bug nel costruttore della classe `Car`, usando il codice fornito.

## Il Problema nel Costruttore
Nel file `Car.java`, il costruttore assegna direttamente l'array `parts` passato come parametro all'attributo dell'oggetto. Questo comportamento può portare a una condivisione involontaria del riferimento dell'array tra più oggetti `Car`.

```java
public Car(String make, double price, int year, String color, String[] parts) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
    this.parts = parts; // Assegnazione diretta, potenziale trappola della referenza
}
```

## Dimostrazione del Bug nel Main.java
Il file `Main.java` mostra chiaramente come il bug si manifesta in un caso d'uso reale. Qui, creiamo un oggetto `Car` denominato `nissan`, al quale passiamo un array `spareParts`. Lo stesso array viene poi passato a un altro oggetto `Car`, `dodge`. Quando modificato, l'array `spareParts` influisce su entrambi gli oggetti `Car`.

```java
String[] spareParts = new String[] {"Tires", "Keys"};
Car nissan = new Car("Nissan", 10000, 2020, "Green", spareParts);
Car dodge = new Car("Dodge", 11000, 2019, "Blue", spareParts);

spareParts[0] = "Window"; // Modifica che influisce su entrambi gli oggetti Car
```

## Conclusione
Questo bug dimostra l'importanza di un'attenta gestione degli array in Java, specialmente in contesti OOP dove l'incapsulamento e l'indipendenza degli oggetti sono cruciali. Nella prossima documentazione, esploreremo come risolvere questo problema attraverso pratiche di programmazione adeguate.
