# Introduzione ai Getter in Java

I getter sono una componente fondamentale nella programmazione orientata agli oggetti in Java, essenziali per controllare l'accesso ai campi di una classe.

## Il Problema dell'Accesso Diretto ai Campi
Consideriamo una classe `Car` con un campo `fuelLevel`. Se questo campo è pubblicamente accessibile, potrebbe essere impostato su valori non realistici, compromettendo l'integrità dell'oggetto:

```java
public class Car {
    int fuelLevel; // Accesso diretto possibile

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
```

Esempio di creazione e modifica diretta del campo `fuelLevel`:

```java
Car myCar = new Car(100); // Impostazione corretta
myCar.fuelLevel = -10; // Modifica non sicura e non realistica
```

## La Forza dei Campi Privati
Per evitare modifiche dirette non sicure, i campi possono essere dichiarati come privati. Ciò limita l'accesso al campo solo all'interno della classe stessa, aumentando la sicurezza:

```java
public class Car {
    private int fuelLevel; // Accesso diretto non più possibile

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
```

In questo caso, il tentativo di accedere direttamente a `fuelLevel` dall'esterno della classe `Car` genera un errore.

## Abilitare l'Accesso ai Campi con i Getter
Sebbene `fuelLevel` sia ora privato, occorre un metodo per accedere al suo valore in modo controllato. I getter sono metodi che consentono di recuperare il valore di un campo privato:

```java
public class Car {
    private int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }
}
```

Con questo getter, `getFuelLevel()`, possiamo leggere il valore di `fuelLevel` in modo sicuro e controllato.

## Incapsulamento e Sicurezza
L'implementazione di campi privati e l'utilizzo di getter rientra nel principio di incapsulamento. Questo approccio protegge i dati mantenendo i campi privati e fornendo metodi pubblici per accedervi. L'incapsulamento garantisce l'integrità dei dati e previene modifiche accidentali dello stato dell'oggetto.

## Preparazione per la Prossima Lezione
Nella prossima lezione, esploreremo più approfonditamente l'utilizzo dei getter per accedere ai campi privati, visualizzando il processo per una migliore comprensione.
