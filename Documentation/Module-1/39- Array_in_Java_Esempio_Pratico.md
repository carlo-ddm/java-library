
[Back to Summary](../Summary.md)

# Array in Java: Un Esempio Pratico

## Introduzione
In Java, gli array sono utilizzati per immagazzinare collezioni di elementi dello stesso tipo. Il codice fornito offre un esempio chiaro di come si possa utilizzare un array per rappresentare una serie di elementi, in questo caso, i nomi dei regni.

## Dichiarazione e Inizializzazione di Array
Il seguente estratto del codice mostra come dichiarare e inizializzare un array di stringhe:

```java
String[] kingdoms = { "Mercia", "Wessex", "Northumbria", "East Anglia" };
```

Qui, `kingdoms` è un array che contiene quattro stringhe, ognuna rappresentante un nome di un regno.

## Accesso agli Elementi dell'Array
Per accedere a un elemento dell'array, si utilizza l'indice dell'elemento, che inizia da 0. Ad esempio:

```java
System.out.println(kingdoms[0]); // Stampa "Mercia"
System.out.println(kingdoms[1]); // Stampa "Wessex"
```

## Esempi di Codice
Il codice completo per il nostro esempio di array è il seguente:

```java
public class IntroToArrays {
    public static void main(String[] args) {
        String[] kingdoms = { "Mercia", "Wessex", "Northumbria", "East Anglia" };

        System.out.println(kingdoms[0]);
        System.out.println(kingdoms[1]);
        System.out.println(kingdoms[2]);
        System.out.println(kingdoms[3]);
    }
}
```

## Conclusione
Questo esempio dimostra l'uso basilare degli array in Java, evidenziando come si possano dichiarare, inizializzare e accedere agli elementi dell'array.
