### Le Espressioni Lambda: Consumer

Le espressioni lambda in Java rappresentano un concetto fondamentale per scrivere codice più conciso e funzionale. Sono particolarmente utili quando si tratta di manipolare collezioni o eseguire operazioni ripetitive.

#### Introduzione alle Espressioni Lambda

Nel mondo della programmazione, ci imbattiamo spesso in attività ripetitive che devono essere eseguite su un insieme di dati. Ad esempio, iterare attraverso una lista per eseguire un'operazione su ogni elemento. Questo processo può essere semplificato con l'uso di funzioni di ordine superiore.

Le funzioni di ordine superiore sono quelle funzioni che accettano altre funzioni come argomenti, rendendo il codice notevolmente più conciso. Fanno molto lavoro dietro le quinte; tutto ciò che devi fare è fornire loro un'espressione lambda per guidarle.

#### Interfacce Funzionali e Lambda

Ecco alcune interfacce funzionali comuni e come possono essere utilizzate con le espressioni lambda:

| Interfaccia Funzionale | Espressione Lambda            | Esempio                                    |
| ---------------------- | ----------------------------- | ------------------------------------------ |
| Consumer               | `(argomento) -> { codice }`   | `(n) -> { System.out.println(n); }`        |
| Predicate              | `(argomento) -> espressione`  | `(n) -> n > 0`                             |
| Function               | `(argomento) -> espressione`  | `(n) -> n * 2`                             |
| BiConsumer             | `(arg1, arg2) -> { codice }`  | `(a, b) -> { System.out.println(a + b); }` |
| Comparator             | `(arg1, arg2) -> espressione` | `(a, b) -> a.compareTo(b)`                 |
| BinaryOperator         | `(arg1, arg2) -> espressione` | `(a, b) -> a * b`                          |

#### Esempio di Loop Imperativo

Ecco un tipico loop attraverso un `ArrayList`:

```java
ArrayList<String> list = Arrays.asList("item1", "item2", "item3");
for (String item : list) {
    System.out.println(item);
}
```

Questo è un esempio di codifica imperativa, in cui si specifica ogni singolo passaggio. È funzionale, ma piuttosto verboso.

#### Metodo forEach e Consumer

Java fornisce una funzione di ordine superiore che ha già incorporata questa logica di looping: il metodo `forEach`.

```java
void forEach(Consumer<? super T> action) {
    Objects.requireNonNull(action);
    for (T t : this) {
        action.accept(t);
    }
}
```

Il metodo `forEach` richiede un `Consumer`. Il `Consumer` è un'azione che dichiara la tua intenzione per ogni elemento della lista.

Esprimiamo questa intenzione usando un'espressione lambda quando chiamiamo `forEach`:

```java
ArrayList<String> list = Arrays.asList("item1", "item2", "item3");
list.forEach((String item) -> { System.out.println(item); });
```

In questo esempio, l'espressione lambda svolge il ruolo del nostro `Consumer`, indirizzando il metodo `forEach` sull'azione da intraprendere per ogni elemento.

#### Espressioni Lambda e Concisione

Se un'espressione lambda contiene solo una riga di codice, può spesso essere abbreviata, rendendo il codice più pulito. Rimuoviamo le parentesi dal nostro esempio precedente:

```java
ArrayList<String> list = Arrays.asList("item1", "item2", "item3");
list.forEach(item -> System.out.println(item));
```

In questo modo, l'uso delle espressioni lambda non solo rende il codice più elegante, ma aumenta anche la leggibilità e la concisione, elementi chiave nella programmazione funzionale moderna.
