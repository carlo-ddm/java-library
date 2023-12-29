[Back to Summary](../Summary.md)

# Iterazione su Array in Java: Esempi Pratici

## Introduzione
Iterare su array in Java è una pratica comune e fondamentale. I cicli, come il ciclo `for`, sono utilizzati per attraversare gli array e manipolare o accedere ai loro elementi.

## Iterazione su Array di Integers
Un esempio classico è l'iterazione su un array di numeri interi. Si utilizza un ciclo `for` per percorrere l'array e accedere a ciascun elemento. Ecco un esempio:

```java
int[] numbers = {22, 24, 26, 29, 30};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

## Iterazione su Array di Strings
Analogamente, possiamo iterare su un array di stringhe. La logica rimane la stessa, cambia solo il tipo di dato:

```java
String[] strArray = {"apple", "banana", "cherry"};
for (int i = 0; i < strArray.length; i++) {
    System.out.println(strArray[i]);
}
```

## Considerazioni
L'iterazione su array è versatile e può essere adattata per array di qualsiasi tipo. La chiave è l'utilizzo dell'indice dell'array all'interno del ciclo `for`.

## Esempi di Codice
I seguenti esempi dal codice fornito mostrano come si possa utilizzare il ciclo `for` per iterare efficacemente su array di diversi tipi:

```java
public class ArrayLoopExamples {
    public static void main(String[] args) {
        // Iterazione su array di interi
        int[] numbers = {22, 24, 26, 29, 30};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Iterazione su array di stringhe
        String[] strArray = {"apple", "banana", "cherry"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
```

## Conclusione
L'iterazione su array è un concetto chiave in Java e il ciclo `for` offre un modo semplice e diretto per eseguire questa operazione. Questi esempi rappresentano una base fondamentale per qualsiasi sviluppatore Java.
