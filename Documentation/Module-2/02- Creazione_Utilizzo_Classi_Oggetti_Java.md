# Creazione e Utilizzo di Classi e Oggetti in Java

## Definizione di una Classe
Descrizione di come una classe agisce da blueprint per gli oggetti, con l'esempio della classe `Car`.

## Creazione di Oggetti
Illustrazione di come si creano istanze di oggetti dalla classe `Car`, usando gli esempi di `nissan` e `dodge`.

## Proprietà degli Oggetti
Discussione sulle proprietà degli oggetti `Car` e come queste descrivono l'oggetto.

## Istanza di un Oggetto e Riferimento
Descrizione del processo di istanziazione di un oggetto e di come le variabili memorizzano i riferimenti agli oggetti.


# Creazione e Utilizzo di Classi e Oggetti in Java

## Definizione di una Classe
In Java, una classe funge da modello o "blueprint" per gli oggetti. Per esempio, la classe `Car` definisce un tipo di oggetto che rappresenta un'automobile. Include proprietà come `make`, `price`, `year`, e `color`, che descrivono le caratteristiche di un'automobile.

## Creazione di Oggetti
Gli oggetti sono istanze di una classe. Nel file `Main.java`, creiamo oggetti della classe `Car` usando il costruttore `new Car()`. Ad esempio:

```java
Car nissan = new Car();
nissan.make = "Nissan";
nissan.price = 10000;
// Altre assegnazioni...
```

Qui, `nissan` è un oggetto della classe `Car`.

## Proprietà degli Oggetti
Le proprietà degli oggetti, come `make` e `price` nel caso di `Car`, descrivono lo stato dell'oggetto. Assegnando valori a queste proprietà, definiamo le caratteristiche specifiche dell'oggetto `nissan`, come la sua marca e il suo prezzo.

## Istanza di un Oggetto e Riferimento
Quando istanziamo un oggetto, la variabile (es. `nissan`) memorizza un riferimento all'oggetto, non l'oggetto stesso. Questo significa che `nissan` punta all'oggetto `Car` creato in memoria.

