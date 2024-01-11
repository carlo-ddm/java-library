
# Eccezioni di Compile Time in Java

## Panoramica
Le eccezioni di compile time, note anche come eccezioni controllate, sono insuccessi prevedibili che il compilatore controlla prima dell'esecuzione del codice. A differenza delle eccezioni runtime (non controllate), queste eccezioni sono verificate durante la compilazione.

## Esempi di Eccezioni di Compile Time
- `FileNotFoundException`
- `MalformedURLException`
- `SQLException`
- `IOException`
- `NetworkException`

## Gestione delle Eccezioni di Compile Time
Le eccezioni di compile time richiedono un'attenzione particolare durante la scrittura del codice. Il compilatore impone al programmatore di gestire queste eccezioni, spesso attraverso blocchi `try-catch` o dichiarazioni `throws` nei metodi.

### Esempio Pratico
Consideriamo il seguente scenario: vogliamo aprire una connessione con un file, ma c'è il rischio che il file non esista. In questo caso, il compilatore prevede un potenziale insuccesso (ad esempio, `FileNotFoundException`) e richiede che venga gestito.

#### Codice di Esempio
```java
FileInputStream fileStream = new FileInputStream("path_to_greetings.txt");
```

Se il file specificato non esiste, si verifica un'eccezione `FileNotFoundException`. Per gestire questa situazione, utilizziamo un blocco `try-catch`.

```java
try {
    FileInputStream fileStream = new FileInputStream("path_to_greetings.txt");
    // Logic to read from the file
} catch (FileNotFoundException e) {
    System.out.println("File non trovato: " + e.getMessage());
} finally {
    // Codice di pulizia, eseguito indipendentemente dall'esito
    System.out.println("Processo completato.");
}
```

## Propagazione delle Eccezioni
In alternativa alla gestione diretta delle eccezioni, possiamo "propagare" l'eccezione. Questo significa che un metodo dichiara la sua incapacità di gestire l'eccezione, trasferendo la responsabilità al chiamante.

### Esempio di Propagazione
```java
public void readFile() throws FileNotFoundException {
    FileInputStream fileStream = new FileInputStream("path_to_greetings.txt");
    // Altra logica
}
```

In questo caso, chi chiama `readFile` deve gestire l'eccezione `FileNotFoundException`.

## Conclusione
Le eccezioni di compile time rappresentano situazioni prevedibili ma incontrollabili. La loro gestione corretta è cruciale per garantire la stabilità e l'affidabilità del software. In questa lezione, abbiamo esplorato le basi della gestione delle eccezioni di compile time in Java, dimostrando l'importanza di prevedere e gestire in modo adeguato queste eccezioni.

