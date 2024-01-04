# Introduzione ai Setter in Java

Dopo aver esplorato il concetto di getter per accedere ai dati in un oggetto, è il momento di approfondire il concetto complementare in Java: i setter.

## Limitazioni dei Campi Privati
Ricordiamo la classe `Car` precedentemente definita con il campo privato `fuelLevel`:

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

Abbiamo creato un getter per il campo `fuelLevel`, che ci permette di recuperarne il valore in modo sicuro. Tuttavia, sorge un problema: se volessimo cambiare `fuelLevel` dopo aver creato l'oggetto `Car`, la nostra implementazione attuale non lo consente.

```java
Car myCar = new Car(100);
// Questo genererà un errore poiché fuelLevel è un campo privato
myCar.fuelLevel = 50;
```

Per consentire la modifica sicura dei campi privati, dobbiamo introdurre il concetto di setter.

## Introduzione ai Setter
Un setter è un metodo che ci permette di cambiare il valore di un campo privato. Questo metodo è tipicamente pubblico e viene nominato 'set' seguito dal nome del campo. Ecco come aggiungiamo un setter alla nostra classe `Car`:

```java
public class Car {
    private int fuelLevel;

    public Car(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
}
```

Il metodo `setFuelLevel` accetta un intero e assegna questo valore al campo `fuelLevel`. Ora possiamo cambiare in modo sicuro il `fuelLevel` della macchina:

```java
Car myCar = new Car(100);
// Cambio sicuro del fuelLevel
myCar.setFuelLevel(50);
```

## Incapsulamento e Robustezza
Rendendo il campo `fuelLevel` privato e utilizzando un setter per modificarne il valore, continuiamo ad implementare il principio di incapsulamento. Questa progettazione protegge i nostri dati e aiuta a garantire la robustezza, impedendo al codice esterno di causare incongruenze nello stato del nostro oggetto.
