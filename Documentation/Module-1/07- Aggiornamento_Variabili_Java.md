[Back to Summary](../Summary.md)

# Aggiornamento delle Variabili in Java

## Introduzione
In questa documentazione, esaminiamo il concetto di variabili in Java, concentrandoci sull'aggiornamento dei loro valori, come illustrato nella trascrizione e nel codice sorgente `Bus.java` forniti.

## Inizializzazione e Aggiornamento delle Variabili
In Java, le variabili vengono inizializzate per memorizzare dati e possono essere aggiornate nel corso dell'esecuzione del programma.

### Esempio di Codice
Il seguente estratto dal codice `Bus.java` mostra come una variabile intera viene inizializzata e poi aggiornata:

```java
public class Bus {
    public static void main(String[] args) {
        int passengers = 0;
        passengers += 9; // Aggiunge 9 passeggeri
        System.out.println(passengers); // Stampa il numero attuale di passeggeri

        passengers -= 5; // Rimuove 5 passeggeri
        System.out.println(passengers); // Stampa il numero aggiornato di passeggeri
    }
}
```

## Gestione dei Limiti delle Variabili
Le variabili in Java hanno limiti di capacità. Ad esempio, una variabile intera (`int`) può memorizzare valori fino a un certo limite. Superare questo limite causa un errore, poiché il valore diventa fuori range.

## Conclusione
La comprensione di come inizializzare e aggiornare le variabili in Java è fondamentale per la gestione dei dati all'interno dei tuoi programmi. Gli esempi forniti dovrebbero aiutarti a familiarizzare con questi concetti essenziali.

