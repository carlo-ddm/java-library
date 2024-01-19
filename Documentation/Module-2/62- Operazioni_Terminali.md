
# Operazioni Terminali in Java

Le operazioni terminali in Java sono quelle operazioni che concludono un flusso di dati in una pipeline di Stream. Queste operazioni producono un risultato finale o un effetto collaterale (come la stampa dei dati), ma non restituiscono uno stream ulteriore. Di seguito sono presentate alcune delle operazioni terminali comuni utilizzando il codice Java fornito come esempio.

## 1. `forEach`

### Descrizione
`forEach` viene utilizzato per eseguire un'azione su ogni elemento dello stream.

### Esempio
```java
List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
usernames.stream()
         .map(username -> username.toUpperCase())
         .forEach(username -> System.out.println(username));
```
In questo esempio, `forEach` viene utilizzato per stampare ogni username trasformato in maiuscolo.

## 2. `toList`

### Descrizione
`toList` è un'operazione terminale che raccoglie gli elementi dello stream in una lista.

### Esempio
```java
// Continuazione del codice precedente
List<String> upperUsernames = usernames.stream()
                                       .map(username -> username.toUpperCase())
                                       .toList();
```
Qui, `toList` raccoglie i nomi utente convertiti in maiuscolo in una lista.

## 3. `reduce`

### Descrizione
`reduce` combina gli elementi dello stream in un singolo valore, utilizzando un valore iniziale e una funzione binaria.

### Esempio
```java
double totalEarnings = earningsStream.reduce(0.00, (x, y) -> x + y);
System.out.println("Your total earnings are: " + totalEarnings);
```
In questo caso, `reduce` somma tutti gli elementi dello stream, partendo da un valore iniziale di 0.00.

## 4. `findFirst`

### Descrizione
`findFirst` restituisce il primo elemento dello stream che soddisfa una condizione data, se presente.

### Esempio
```java
String result = aisles.stream()
                      .filter(aisle -> aisle.equals("coffee"))
                      .findFirst()
                      .orElse(null);
```
Qui, `findFirst` viene usato per trovare il primo elemento "coffee" nello stream.

## 5. `count`

### Descrizione
`count` restituisce il numero di elementi presenti nello stream.

### Esempio
```java
long count = numbers.stream()
                    .filter(number -> number == 1)
                    .count();
```
In questo esempio, `count` viene usato per contare il numero di volte che il numero 1 appare nello stream.

---

Ogni operazione terminale ha la caratteristica comune di concludere la pipeline di Stream. Alcune di queste operazioni producono un effetto collaterale (come `forEach`), mentre altre restituiscono un risultato finale (come `toList`, `reduce`, `findFirst` e `count`).
