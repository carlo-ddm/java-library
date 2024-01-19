
# Funzioni di Ordine Superiore e Lambda: Utilizzo del Consumer

Le funzioni di ordine superiore possono rendere il tuo codice molto più conciso.

In questa lezione, invocherai una funzione di ordine superiore che si affida a un consumer.

## Passo 1: Intendere l'Utilizzo delle Funzioni di Ordine Superiore
Le tue funzioni di ordine superiore devono conoscere la tua intenzione per poter essere eseguite. 
`Arrays.asList` è un modo conveniente per creare un nuovo `ArrayList` con valori predefiniti.

Ecco un esempio di `ArrayList` che contiene fatti su Marie Curie, e da questo `ArrayList` invochiamo il metodo `forEach`.

```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> facts = Arrays.asList(
            "Marie Curie was the first woman to win a Nobel Prize.",
            "She received the Nobel Prize in Physics in 1903, and the Nobel Prize in Chemistry in 1911.",
            "Curie was a pioneer in the field of radioactivity, and her work led to the development of X-ray technology.",
            "She was the first woman to become a professor at the Sorbonne, and the first woman to be entombed on her own merits in the Panthéon.",
            "Curie died at the age of 66 from complications related to her prolonged exposure to radiation.",
            "She is remembered as one of the most influential scientists in history.",
            "Her legacy lives on through the Marie Curie Cancer Care charity, which provides care and support to people with terminal illnesses.",
            "Curie's contributions to science and medicine have been recognized and celebrated worldwide."
        );

        facts.forEach(fact -> System.out.println(fact));
        
    }
}
```

## Passo 2: Esprimere la Tua Intenzione con un'Espressione Lambda
Devi esprimere la tua intenzione sotto forma di espressione lambda.
Il metodo `forEach` necessita di conoscere la tua intenzione sotto forma di un `Consumer`, che riceve un parametro e non restituisce nulla.

```java
// Continuazione del codice Java con esempi di espressioni lambda
```

### Visualizzazione Runtime e Semplificazione del Lambda
Mettendo un breakpoint e analizzando il runtime, possiamo osservare che `forEach` itera ogni singolo elemento nell'`ArrayList`, e per ogni elemento utilizza la nostra espressione lambda per eseguire il suo compito. Inoltre, se il lambda contiene una sola linea di logica, è possibile rimuovere le parentesi graffe.

```java
// Codice Java finale, mostrando la versione semplificata dell'espressione lambda
```

### Perché Usare Funzioni di Ordine Superiore Invece di Loop Regolari?
Utilizzare una funzione di ordine superiore è un modo dichiarativo di codifica perché tutto ciò che devi fare è dichiarare la tua intenzione. La logica effettiva del ciclo è nascosta all'interno della funzione `forEach`. Utilizzare un loop sarebbe un modo imperativo di codifica perché devi codificare esplicitamente ogni singolo passo.

Nella lezione hai chiamato una funzione di ordine superiore che si affida a un consumer.
