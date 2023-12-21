# Documentazione sulla Classe Scanner in Java

## Introduzione
La classe `Scanner` in Java, definita nel pacchetto `java.util`, è uno strumento essenziale per leggere l'input dell'utente e analizzare i dati in modo semplice ed efficiente.

## Cosa è la Classe Scanner
`Scanner` è una classe in Java utilizzata per ottenere l'input di tipi primitivi come `int`, `double`, `string`, ecc., e stringhe da diverse fonti come flussi di input, file e stringhe.

## Creazione di un'Istanza di Scanner
Per utilizzare `Scanner`, è necessario creare un'istanza della classe. Questo si fa generalmente passando un oggetto `InputStream` come `System.in`, che rappresenta l'input standard (tastiera).

### Esempio:
```java
Scanner scanner = new Scanner(System.in);
```

## Metodi Principali di Scanner
- `nextLine()`: Legge una linea di testo.
- `nextInt()`, `nextDouble()`, ecc.: Leggono e restituiscono il prossimo token del tipo specificato (int, double, ecc.).
- `hasNext()`, `hasNextInt()`, ecc.: Verificano se c'è un altro token del tipo specificato.

## Gestione delle Risorse e Chiusura dello Scanner
È importante chiudere l'oggetto `Scanner` dopo il suo utilizzo per evitare memory leaks (perdite di memoria). Questo si fa chiamando il metodo `close()`.

### Esempio di chiusura:
```java
scanner.close();
```

## Esempi Pratici dal Codice Fornito
Nel codice fornito, lo `Scanner` viene utilizzato per raccogliere dati da un utente e calcolare le spese settimanali per caffè e cibo.

```java
Scanner scanner = new Scanner(System.in);
// Legge i dati dell'utente
String name = scanner.nextLine();
double coffeePrice = scanner.nextDouble();
// ...
scanner.close(); // Chiusura dello scanner
```

In questo esempio, vengono utilizzati i metodi `nextLine()`, `nextDouble()` e `nextInt()` per leggere diversi tipi di dati. Infine, lo `Scanner` viene chiuso per evitare perdite di memoria.

## Conclusioni
La classe `Scanner` in Java è uno strumento versatile e potente per leggere l'input dell'utente e analizzare dati di vari tipi. La sua corretta gestione, inclusa la chiusura dopo l'uso, è fondamentale per mantenere l'efficienza della memoria e delle risorse del programma.