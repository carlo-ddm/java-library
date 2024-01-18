
# Funzioni di Ordine Superiore in Java

## Introduzione alle Funzioni di Ordine Superiore

Le funzioni di ordine superiore possono rendere il codice molto più conciso. In Java, queste funzioni possono essere utilizzate efficacemente per semplificare operazioni comuni su collezioni di dati. Un esempio classico è l'utilizzo della funzione `forEach` insieme alle espressioni lambda.

## Esempio Pratico

Nell'esempio di codice fornito, viene dimostrato come utilizzare una funzione di ordine superiore con una lista di stringhe che contengono fatti su Marie Curie. Ecco i passaggi chiave:

### Creazione di una Lista

La lista viene creata utilizzando il metodo `Arrays.asList`, che è un modo conveniente per inizializzare una lista con valori predefiniti.

```java
List<String> facts = Arrays.asList(
    // ... valori ...
);
```

### Utilizzo di `forEach`

Il metodo `forEach` della lista viene utilizzato per iterare su ogni elemento. Tuttavia, `forEach` richiede di specificare un'azione da eseguire su ogni elemento, il che si ottiene tramite una lambda expression.

```java
facts.forEach(fact -> System.out.println(fact));
```

In questo esempio, la lambda expression stampa ogni elemento della lista.

### Lambda Expressions e Consumer

La lambda expression usata con `forEach` è un esempio di `Consumer` in Java, che accetta un parametro e non restituisce nulla. Questo tipo di funzione lambda è ideale per operazioni che agiscono su dati ma non restituiscono un risultato.

### Declarative vs Imperative Programming

L'uso di funzioni di ordine superiore come `forEach` con espressioni lambda è un approccio dichiarativo alla programmazione: si dichiara l'intenzione (ad esempio, stampare ogni elemento) senza specificare i dettagli del ciclo. Questo è in contrasto con l'approccio imperativo, dove si scrivono esplicitamente tutti i passaggi del ciclo.

## Conclusioni

L'uso delle funzioni di ordine superiore in Java permette di scrivere codice più conciso e leggibile, focalizzandosi sugli obiettivi piuttosto che sui dettagli di implementazione. Questo approccio può migliorare significativamente la manutenibilità e la chiarezza del codice.
