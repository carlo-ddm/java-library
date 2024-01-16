# Dichiarazione degli Enum

## Enum Interno alla Classe

### Panoramica

Quando un enum è strettamente legato a una specifica classe, può essere dichiarato internamente. Questo approccio promuove l'incapsulamento e mantiene l'enum e la sua classe di utilizzo in stretta correlazione.

### Esempio

Consideriamo una classe `Car` che utilizza un enum `BodyType`:

```java
package model;

public class Car {
    public enum BodyType { SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN }
    private BodyType bodyType;

    // costruttore, getter, setter e altri metodi
}
```

In questo esempio, `BodyType` è definito all'interno della classe `Car` e rappresenta il tipo di carrozzeria dell'auto.

## Enum in un File Separato

### Panoramica

Per enum di più ampia applicabilità o che sono utilizzati da più classi, è opportuno definirli in un file separato. Questo facilita la riutilizzabilità e mantiene il codice organizzato.

### Esempio

Definizione di `BodyType` in un file separato:

```java
package model;

public enum BodyType { SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN }
```

Utilizzo in una classe:

```java
package model;

import model.BodyType;

public class Car {
    private BodyType bodyType;

    // costruttore, getter, setter e altri metodi
}
```

In questo caso, l'enum `BodyType` è accessibile da qualsiasi classe che lo importa.

## Importazione dell'Enum

### Dettagli

Quando si utilizza un enum definito in un file separato, è essenziale importarlo nella classe che lo utilizza. Questo è particolarmente importante se l'enum si trova in un pacchetto diverso.

### Esempio con Importazione

Esempio di importazione dell'enum `BodyType` nella classe `Car`:

```java
package model;

import model.BodyType;

public class Car {
    private BodyType bodyType;

    // costruttore, getter, setter e altri metodi
}
```

## Considerazioni Finali

La scelta tra un enum interno o in un file separato dipende dal contesto specifico e dalle esigenze di progettazione. Entrambi gli approcci hanno i loro vantaggi e possono essere utilizzati efficacemente a seconda delle circostanze.