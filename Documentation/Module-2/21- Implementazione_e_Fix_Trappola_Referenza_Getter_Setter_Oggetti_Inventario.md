# La Copia Profonda nei Metodi Getter e Setter per l'Oggetto Inventario in Java

## Introduzione
Nella gestione di oggetti complessi come una collezione di auto in un `Dealership`, è essenziale evitare la trappola della referenza. Questo è particolarmente critico nei metodi getter e setter, dove una copia profonda garantisce l'indipendenza degli oggetti gestiti.

## La Trappola della Referenza nei Getter e Setter
Senza una copia profonda, i getter e setter potrebbero semplicemente passare i riferimenti agli oggetti `Car`. Questo comporta il rischio che modifiche esterne agli oggetti `Car` influenzino direttamente l'inventario di `Dealership` e viceversa.

### Esempio di Implementazione Non Sicura
```java
public Car getCar(int index) {
    return this.cars[index];
}

public void setCar(int index, Car newCar) {
    this.cars[index] = newCar;
}
```

## Implementazione della Copia Profonda
Per evitare la trappola della referenza, i metodi getter e setter devono creare nuove istanze degli oggetti `Car`, garantendo che ogni operazione sia eseguita su copie indipendenti.

### Esempio di Implementazione Sicura
```java
public Car getCar(int index) {
    return new Car(this.cars[index]);
}

public void setCar(int index, Car newCar) {
    this.cars[index] = new Car(newCar);
}
```

## Conclusioni
L'uso della copia profonda nei metodi getter e setter è cruciale per mantenere l'integrità e l'indipendenza degli oggetti in una collezione. Questo approccio è fondamentale in ambienti dove la condivisione di riferimenti può portare a comportamenti imprevisti e bug difficili da tracciare.
