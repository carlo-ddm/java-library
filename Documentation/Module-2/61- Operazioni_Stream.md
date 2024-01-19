
# Operazioni con Stream: Semplificazione e Dichiarazione d'Intenti

Le operazioni con gli Stream rendono il codice espressivo e più facile da leggere.

Quando suddividi la tua fonte di dati in uno stream, puoi elaborarlo in una pipeline di operazioni.

La maggior parte delle operazioni con gli Stream sono funzioni di ordine superiore.

## Passo 1: Convertire la Fonte dei Dati in uno Stream
Una pipeline di stream non è progettata per elaborare un'intera fonte di dati in una volta. È necessario suddividere la tua fonte di dati, qualunque essa sia, in uno stream.

```java
// Esempio di conversione di una lista in uno stream
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
        .filter(price -> {
            return price > 100;
        })
        .map(price -> {
            return price - 20;
        })
        .sorted((right, left) -> {
            return right.compareTo(left);
        })
        .map(price -> {
            return "$ " + price; 
        }).forEach(price -> System.out.println(price));

    }
}
```

## Passo 2: Aggiungere un'Operazione di Filtro alla Pipeline
L'operazione di filtro riceve uno stream di elementi e restituisce uno stream filtrato. Il filtro si basa sulla tua intenzione sotto forma di un predicato.

```java
// Esempio di operazione di filtro
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
        .filter(price -> {
            return price > 100;
        })
        .map(price -> {
            return price - 20;
        })
        .sorted((right, left) -> {
            return right.compareTo(left);
        })
        .map(price -> {
            return "$ " + price; 
        }).forEach(price -> System.out.println(price));

    }
}
```

## Passo 3: Aggiungere un'Operazione di Mappatura alla Pipeline
L'operazione di mappatura trasforma ogni elemento nello stream. Si basa sulla tua intenzione sotto forma di funzione.

```java
// Esempio di operazione di mappatura
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
        .filter(price -> {
            return price > 100;
        })
        .map(price -> {
            return price - 20;
        })
        .sorted((right, left) -> {
            return right.compareTo(left);
        })
        .map(price -> {
            return "$ " + price; 
        }).forEach(price -> System.out.println(price));

    }
}
```

## Passo 4: Aggiungere un'Operazione di Ordinamento alla Pipeline
L'operazione di ordinamento prende uno stream come input e restituisce uno stream ordinato. Si basa su un comparatore per indirizzare l'ordinamento.

```java
// Esempio di operazione di ordinamento
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
        .filter(price -> {
            return price > 100;
        })
        .map(price -> {
            return price - 20;
        })
        .sorted((right, left) -> {
            return right.compareTo(left);
        })
        .map(price -> {
            return "$ " + price; 
        }).forEach(price -> System.out.println(price));

    }
}
```

## Passo 5: Aggiungere un'Altra Operazione di Mappatura alla Pipeline
Questa operazione di mappatura trasforma ogni elemento in uno stringa.

```java
// Esempio di un'altra operazione di mappatura
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
        .filter(price -> {
            return price > 100;
        })
        .map(price -> {
            return price - 20;
        })
        .sorted((right, left) -> {
            return right.compareTo(left);
        })
        .map(price -> {
            return "$ " + price; 
        }).forEach(price -> System.out.println(price));

    }
}
```

## Passo 6: Aggiungere un'Operazione di forEach alla Pipeline
L'operazione `forEach` riceve uno stream e produce un output. È un'operazione terminale perché, dopo aver prodotto l'output, termina la pipeline.

```java
// Esempio di utilizzo dell'operazione forEach
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        prices.stream()
        .filter(price -> {
            return price > 100;
        })
        .map(price -> {
            return price - 20;
        })
        .sorted((right, left) -> {
            return right.compareTo(left);
        })
        .map(price -> {
            return "$ " + price; 
        }).forEach(price -> System.out.println(price));

    }
}
```

In questa lezione, hai usato le operazioni con gli Stream per semplificare un comportamento sofisticato in poche righe di codice, dichiarando semplicemente la tua intenzione e lasciando che le funzioni di ordine superiore facciano il resto.
