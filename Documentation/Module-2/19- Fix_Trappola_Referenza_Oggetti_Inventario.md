
# Soluzione alla Trappola della Referenza per Oggetti Inventario in Java

## Problema della Copia Superficiale con `Arrays.copyOf()`
Nella programmazione Java, una soluzione comune per evitare la trappola della referenza è l'uso di `Arrays.copyOf()`. Tuttavia, per oggetti come `Dealership` che contengono un array di oggetti `Car`, questa soluzione non è sufficiente. `Arrays.copyOf()` esegue una copia superficiale dell'array, copiando solo i riferimenti agli oggetti `Car`, non gli oggetti stessi.

### Esempio di Implementazione Non Sufficiente
```java
public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = Arrays.copyOf(cars, cars.length);
    }
}
```

Questo approccio non risolve il problema della condivisione delle referenze agli oggetti `Car` interni all'array.

## La Soluzione della Copia Profonda
Per evitare completamente la trappola della referenza, è necessario adottare una soluzione che impieghi la copia profonda. Ciò significa creare nuove istanze di ogni oggetto `Car` contenuto nell'array, assicurando che ogni elemento nell'array di `Dealership` sia completamente indipendente dall'array originale.

### Implementazione della Copia Profonda
```java
public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = new Car[cars.length];
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }
    }
}
```

Questa implementazione garantisce che ogni `Car` all'interno di `Dealership` sia una copia indipendente, prevenendo qualsiasi interferenza accidentale tra l'array originale e l'oggetto `Dealership`.

## Conclusioni
La copia profonda è essenziale per evitare la trappola della referenza in situazioni dove gli oggetti contengono altri oggetti, come nel caso di `Dealership`. Questa soluzione garantisce che ogni oggetto all'interno della collezione sia autonomo e indipendente dagli oggetti esterni all'oggetto contenitore.
