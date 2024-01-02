
[Back to Summary](../Summary.md)

# Array Bidimensionali in Java

## Introduzione
Gli array bidimensionali in Java, conosciuti anche come matrici, sono array che contengono array come loro elementi. Sono utili per rappresentare dati strutturati in forma di griglia, come tabelle, puzzle, o matrici matematiche.

## Definizione e Inizializzazione
Un array bidimensionale può essere definito e inizializzato in Java in diversi modi. Ecco due esempi:

1. **Inizializzazione Diretta:**
   ```java
   int[][] grades1 = {
       {72, 74, 78, 76},
       {65, 64, 61, 67},
       {95, 98, 99, 100},
   };
   ```

2. **Inizializzazione e Assegnazione Manuale:**
   ```java
   int[][] grades = new int[3][4];
   grades[0][0] = 72;
   // ... altri assegnamenti ...
   grades[2][3] = 100;
   ```

## Accesso agli Elementi e Iterazione
Per accedere o modificare gli elementi di un array bidimensionale, si usano indici doppi. Ecco un esempio di accesso e stampa degli elementi:

```java
System.out.println("\tHarry: " + Arrays.toString(grades[0]));
// Stampa altri elementi...
```

## Esempi dal File `TDarrays.java`
Il file condiviso presenta esempi pratici di definizione, assegnazione e stampa di array bidimensionali.

### Esempio di Definizione e Stampa:
```java
int[][] grades1 = {
    {72, 74, 78, 76},
    {65, 64, 61, 67},
    {95, 98, 99, 100},
};
System.out.println("\tHarry: " + grades1[0][0] + " " + grades1[0][1] + " " + grades1[0][2] + " " + grades1[0][3]);
// Stampa altri elementi...
```

## Considerazioni
Gli array bidimensionali sono fondamentali per gestire dati strutturati in Java. È essenziale comprendere come definirli, accedervi e iterarli per manipolare efficacemente tali strutture dati.

## Conclusioni
Questo documento fornisce una visione generale degli array bidimensionali in Java, mostrando come definirli, accedervi e iterarli. Esempi pratici dal file `TDarrays.java` illustrano l'uso reale in un contesto di programmazione.
