# Primitivi e Oggetti Immutabili in Java

Java offre due tipi di dati fondamentali: i tipi primitivi e gli oggetti immutabili. Questa documentazione spiega la differenza tra questi due, mettendo in evidenza come e perché gli oggetti immutabili occupano più memoria, possono essere null e possono chiamare metodi, a differenza dei tipi primitivi.

## Differenze di Memoria

- **Intero (int vs Integer)**: Una variabile primitiva `int` occupa 4 byte di memoria, mentre l'oggetto `Integer` corrispondente, includendo il sovraccarico dei metadati dell'oggetto e il valore del campo stesso, occupa generalmente 16 byte.

- **Long (long vs Long)**: Analogamente, un valore `long` primitivo richiede 8 byte, mentre un oggetto `Long` ne occupa circa 24.

- **Double (double vs Double)**: Un `double` primitivo occupa 8 byte, ma il suo corrispondente oggetto `Double` ne richiede circa 24.

- **Char (char vs Character)** e **Boolean (boolean vs Boolean)**: Un `char` primitivo occupa 2 byte e un `boolean` primitivo 1 bit, ma i loro corrispondenti oggetti `Character` e `Boolean` richiedono circa 16 byte.

### Esempi di Codice

```java
public class Immutable {
    public static void main(String[] args) {

        int apples = 5;
        Integer applesWrapper = 5;

        System.out.println(apples);
        System.out.println(applesWrapper);

        // ... altri esempi ...
    }
}
```

## Nullabilità e Metodi

Gli oggetti immutabili possono essere `null`, a differenza dei tipi primitivi. Inoltre, essi possono chiamare metodi, come `toString()`, che non sono disponibili per i tipi primitivi.

### Nullabilità

```java
Integer numberWrapper = null;
// Impostare un tipo primitivo a null non è possibile
```

### Chiamata di Metodi

```java
Integer numberWrapper = 5;
String stringValue = numberWrapper.toString();
// I tipi primitivi non possono chiamare metodi
```

## Conclusione

Gli oggetti immutabili occupano più memoria rispetto ai loro equivalenti primitivi e offrono funzionalità aggiuntive come la possibilità di essere `null` e di chiamare metodi. Tuttavia, dovresti preferire l'uso di tipi primitivi per risparmiare memoria, utilizzando oggetti immutabili solo quando necessario, come nel caso di collezioni che richiedono oggetti.
