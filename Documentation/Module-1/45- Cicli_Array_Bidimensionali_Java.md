
[Back to Summary](../Summary.md)

# Cicli sugli Array Bidimensionali in Java

## Introduzione
I cicli sugli array bidimensionali in Java sono un concetto fondamentale per la manipolazione di dati strutturati in forma di matrici o tabelle. Questi cicli permettono di accedere e manipolare ogni elemento dell'array in modo efficiente.

## Definizione di Array Bidimensionali
Come visto in precedenza, gli array bidimensionali sono definiti come array di array. Ad esempio:

```java
int[][] grades1 = {
    {72, 74, 78, 76},
    {65, 64, 61, 67},
    {95, 98, 99, 100},
};
```

## Iterazione con Cicli Annidati
Per iterare su tutti gli elementi di un array bidimensionale, utilizziamo cicli annidati. Il ciclo esterno itera sulle righe, mentre quello interno sulle colonne.

### Esempio dal File `TDarrays.java`
Nel file fornito, viene utilizzato un ciclo `for` annidato per stampare i voti degli studenti:

```java
for (int i = 0; i < grades1.length; i++) {
    // Codice per identificare lo studente
    for (int j = 0; j < grades1[i].length; j++) {
        System.out.print(grades1[i][j] + " ");
    }
    System.out.println("\n");
}
```

## Considerazioni
L'uso di cicli annidati per iterare sugli array bidimensionali è una pratica comune e molto efficace in Java. È importante prestare attenzione alla struttura dell'array e alle dimensioni di ciascuna sotto-array durante l'iterazione.

## Conclusioni
Questo documento ha fornito una panoramica su come utilizzare i cicli per iterare su array bidimensionali in Java, con un esempio pratico estratto dal file `TDarrays.java`. Questa tecnica è essenziale per la manipolazione di dati strutturati in forma di matrice.
