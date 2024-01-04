# Comprensione e Override del Metodo toString() in Java

## Problema della Rappresentazione di Default degli Oggetti

In Java, tentare di stampare un oggetto direttamente, come ad esempio un'istanza della classe `Car`, solitamente non fornisce un output utile. Per esempio:

```java
Car dodge = new Car("Dodge", 11000, 2019, "Blue", new String[] { "Tires", "Keys" });
System.out.println(dodge);
```

Questo codice, di default, stamperà qualcosa simile a `Car@15db9742`. Questo output è il risultato della rappresentazione standard fornita dal metodo `toString()` di `Object`, che combina il nome della classe con l'hashcode dell'oggetto:

```java
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
```

## Soluzione: Override di toString()

Per rendere l'output più informativo, è comune pratica in Java sovrascrivere il metodo `toString()` nella classe dell'oggetto. L'override permette di fornire una rappresentazione stringa personalizzata dell'oggetto, includendo dettagli significativi sul suo stato.

### Implementazione in Car.java

Nella classe `Car`, `toString()` è stato sovrascritto per fornire una descrizione dettagliata dell'oggetto auto. Ecco l'implementazione dal file `Car.java`:

```java
@Override
public String toString() {
        return "Make: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";
}
```

Questa implementazione costruisce una stringa che descrive l'oggetto `Car` in modo più significativo, includendo informazioni come la marca, il prezzo, l'anno, il colore e le parti dell'auto.

## Utilizzo di toString() Sovrascritto

Con questo override, quando si stampa l'oggetto `Car` utilizzando `System.out.println(dodge);`, viene prodotto un output dettagliato e facilmente leggibile:

```
Make: Dodge.
Price: 11000.0.
Year: 2019.
Color: Blue.
Parts: [Tires, Keys].
```

## Conclusione

L'override del metodo `toString()` è una pratica fondamentale in Java per garantire che gli oggetti siano rappresentati in modo chiaro e dettagliato quando vengono stampati. Questo miglioramento è essenziale per il debugging e per una migliore leggibilità del codice.
