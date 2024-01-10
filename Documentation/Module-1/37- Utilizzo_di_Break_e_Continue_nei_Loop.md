[Back to Summary](../Summary.md)

# Utilizzo di Break e Continue nei Loop

## Introduzione
In Java, le istruzioni `break` e `continue` sono strumenti potenti per modificare il comportamento dei loop. Mentre `break` serve a terminare l'esecuzione di un intero ciclo, `continue` salta l'iterazione corrente e passa alla successiva. Questa documentazione fornisce una panoramica dettagliata sull'uso di queste istruzioni nei loop, illustrata con esempi pratici.

## Break: Interruzione di un Loop
L'istruzione `break` viene utilizzata per uscire immediatamente da un ciclo, sia esso un `for`, `while` o `do-while`.

### Esempio 1: Stampa dei Numeri con Interruzione
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
    System.out.println(i);
}
```
In questo esempio, il ciclo `for` stampa i numeri da 1 a 10, ma si interrompe non appena il numero 5 viene raggiunto.

### Esempio 3: Trovare un Numero Divisibile per 3
```java
for (int i = 21; i <= 31; i++) {
    if (i % 3 == 0) {
        System.out.println(i);
        break;
    }
}
```
Qui, si ricerca il più piccolo numero maggiore di 20 che è divisibile per 3. Il ciclo si interrompe non appena tale numero viene trovato.

## Continue: Saltare Iterazioni nel Loop
L'istruzione `continue` salta l'iterazione corrente di un ciclo e continua con la successiva.

### Esempio 2: Salto di un Numero Specifico
```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        continue;
    }
    System.out.println(i);
}
```
Questo esempio mostra come saltare la stampa del numero 5, continuando con i numeri successivi.

### Esempio 4: Stampa dei Numeri Pari
```java
for (int i = 1; i <= 20; i++) {
    if (i % 2 != 0) {
        continue;
    }
    System.out.println(i);
}
```
In questo esempio, il ciclo `for` stampa solo i numeri pari da 1 a 20, saltando i numeri dispari.

## Considerazioni Importanti
- **Uso con Criterio**: È importante utilizzare `break` e `continue` con criterio per mantenere la leggibilità del codice e prevenire loop infiniti o comportamenti inaspettati.
- **Cicli Annidati**: In cicli annidati, `break` e `continue` agiscono solo sul ciclo più interno a meno che non vengano usati con etichette (labels).

## Conclusioni
Le istruzioni `break` e `continue` offrono un controllo flessibile sui cicli in Java, permettendo di gestire casi specifici in modo efficiente. La comprensione del loro funzionamento e uso appropriato è essenziale per ogni programmatore Java.

---

*Fine della Documentazione su Break e Continue nei Loop in Java.*
