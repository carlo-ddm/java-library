[Back to Summary](../Summary.md)

# Cicli Annidati in Java: Una Guida Completa

## Introduzione
I cicli annidati in Java sono un concetto fondamentale nella programmazione, permettendo di eseguire una serie di cicli all'interno di un altro ciclo. Sono particolarmente utili per gestire strutture dati bidimensionali come array o matrici, o per eseguire operazioni complesse che richiedono cicli multipli.

## Sintassi di Base
La sintassi di base per i cicli annidati è un ciclo all'interno di un altro ciclo. Ad esempio, un ciclo `for` annidato all'interno di un altro ciclo `for`:

```java
for (inizializzazione; condizione; incremento) {
    // Codice esterno
    for (inizializzazione; condizione; incremento) {
        // Codice interno
    }
}
```

## Esempio Pratico
Consideriamo il seguente esempio di cicli annidati:

```java
public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("run: " + i);
            for (int j = 0; j < 3; j++) {
                System.out.println(j);
            }
        }
    }
}
```

In questo esempio, abbiamo un ciclo `for` esterno e un ciclo `for` interno. Il ciclo esterno controlla il valore di `i` mentre il ciclo interno controlla il valore di `j`.

### Output dell'Esempio
L'output di questo codice sarà:

```
run: 0
0
1
2
run: 1
0
1
2
run: 2
0
1
2
```

Ogni volta che il ciclo esterno incrementa `i`, il ciclo interno esegue completamente, stampando i valori di `j` da 0 a 2.

## Considerazioni Importanti
- **Prestazioni**: I cicli annidati possono influenzare negativamente le prestazioni se non utilizzati con attenzione, soprattutto in contesti con grandi quantità di dati.
- **Leggibilità**: La complessità dei cicli annidati può rendere il codice più difficile da leggere e manutenere.
- **Uso Appropriato**: Utilizzare cicli annidati quando è necessario lavorare con strutture o operazioni multi-dimensionali.

## Conclusioni
I cicli annidati sono uno strumento potente in Java, essenziali per navigare e manipolare collezioni di dati complesse e per realizzare algoritmi che richiedono operazioni ripetute in più livelli.

---

*Fine della Documentazione sui Cicli Annidati in Java.*
