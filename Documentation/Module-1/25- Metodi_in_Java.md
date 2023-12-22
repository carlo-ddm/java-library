[Back to Summary](../Summary.md)

# Metodi in Java

## Introduzione
I metodi in Java sono blocchi di codice che eseguono un'azione specifica e possono essere chiamati da altre parti del programma. Sono fondamentali per organizzare il codice in unità logiche e riutilizzabili.

## Dichiarazione di un Metodo
La dichiarazione di un metodo include diverse componenti:

- **Livello di Accesso**: Indica la visibilità del metodo (ad es. `public`, `private`).
- **Valore di Ritorno**: Specifica il tipo di dato che il metodo restituisce. Usa `void` se non restituisce nulla.
- **Nome del Metodo**: Un identificatore unico.
- **Parametri**: Lista dei parametri accettati dal metodo (non trattati in questa documentazione).
- **Corpo del Metodo**: Il codice eseguito quando il metodo è chiamato.

### Esempio
```java
public static void singChorus() {
    // Corpo del metodo
}
```

### Livello di Accesso
Il livello di accesso (`public`, `private`, ecc.) determina da quali altre classi il metodo può essere chiamato. `public` rende il metodo accessibile da qualsiasi altra classe.

### Valore di Ritorno
Il valore di ritorno indica il tipo di dato restituito dal metodo. `void` significa che il metodo non restituisce nulla.

### Metodo Statico
Un metodo statico appartiene alla classe piuttosto che a un'istanza della classe. È per questo motivo che `singChorus` può essere chiamato da `main`, anch'esso un metodo statico.

## Richiamare un Metodo
Un metodo viene richiamato usando il nome della classe (per i metodi statici) o un'istanza della classe (per i metodi non statici), seguito dal nome del metodo e parentesi.

### Esempio di Richiamo
Nel codice fornito, `singChorus` viene richiamato nel metodo `main`:

```java
public class Chorus {
    public static void main(String[] args) {
        singChorus(); // Richiamo del metodo
    }
}
```

## Conclusione
I metodi sono un aspetto cruciale della programmazione in Java, permettendo di strutturare il codice in modo efficiente e leggibile. La loro corretta comprensione è fondamentale per sviluppare applicazioni Java efficaci.
