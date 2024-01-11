# La Stringa come Oggetto Immutabile in Java

In Java, le stringhe sono esempi di oggetti immutabili. Imparare che lo stato di un oggetto immutabile non può essere modificato aiuta a prevenire effetti collaterali indesiderati e rende il codice più prevedibile. Di conseguenza, possono essere condivisi liberamente tra diverse parti dell'applicazione.

## Caratteristiche di Stringa in Java

La classe `String` in Java è un oggetto immutabile che immagazzina testo. A differenza dei tipi primitivi, una stringa è un oggetto complesso con numerosi campi e metodi.

### Esempio di Stringa

```java
String text = "Hi"; // Assegnazione di una stringa

// Visualizzazione dell'oggetto stringa
System.out.println(text); // Stampa "Hi"
```

In questo esempio, `text` è un riferimento a un oggetto `String` che contiene il testo "Hi".

### Immutabilità di Stringa

Quando creiamo un oggetto `String`, non possiamo modificarne il valore senza creare un nuovo oggetto. Questo è il concetto chiave dell'immutabilità.

```java
text = "Hello"; // Crea un nuovo oggetto String
```

Qui, assegnando un nuovo valore a `text`, stiamo in realtà creando un nuovo oggetto `String`, non modificando il precedente.

### Sicurezza e Condivisione

Le stringhe immutabili sono sicure da condividere tra diverse parti dell'applicazione, in quanto non possono essere modificate in modo imprevisto. Questa proprietà le rende ideali per l'uso in ambienti multi-thread e per il passaggio di dati tra componenti dell'app.

## Conclusione

Le stringhe in Java, essendo oggetti immutabili, offrono sicurezza, prevedibilità e facilità di condivisione nel codice. La loro immutabilità garantisce che qualsiasi manipolazione del testo comporti la creazione di un nuovo oggetto, preservando l'originale.