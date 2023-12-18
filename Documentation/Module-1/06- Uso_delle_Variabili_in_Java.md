[Back to Summary](../Summary.md)

# `Uso delle Variabili in Java`

## Introduzione
In questa documentazione, esploriamo l'uso delle variabili in Java, come descritto nella trascrizione fornita. Le variabili sono fondamentali in Java per immagazzinare e manipolare i dati. Tratteremo vari tipi di dati, tra cui interi, lunghezze maggiori, decimali, testi e caratteri, con esempi pratici tratti dal codice sorgente allegato.

## Tipi di Variabili in Java e loro Utilizzo
### Variabili Intere (`int`)
- Usate per numeri interi.
- Esempio di codice:
  ```java
  int passengers = 5;
  System.out.println(passengers);
  ```

### Variabili a Lungo Raggio (`long`)
- Per valori numerici più grandi.
- Esempio di codice:
  ```java
  long popolazione = 7800000000L;
  ```

### Variabili Decimali (`double`)
- Per numeri con decimali.
- Esempio di codice:
  ```java
  double temperatura = 36.6;
  ```

### Variabili Stringa (`String`)
- Per sequenze di caratteri o testi.
- Esempio di codice:
  ```java
  String saluto = "Ciao, mondo!";
  ```

### Variabili Carattere (`char`)
- Per un singolo carattere.
- Esempio di codice:
  ```java
  char iniziale = 'C';
  ```

## Esempi Pratici dal Codice Sorgente
Ora vediamo alcuni esempi pratici tratti dal codice sorgente fornito, che dimostrano come utilizzare queste variabili in un programma Java.

```java
public class Variables {
    public static void main(String[] args) {
        int passengers = 5;
        System.out.println(passengers);

        int busTickets = passengers;
        System.out.println(busTickets);

        int maxValue = 2147483647;
        // int maxValues = 2147483648;
    }
}
```

## Conclusione
Questo approfondimento sull'uso delle variabili in Java dovrebbe fornirti una comprensione più chiara su come gestire i dati in vari formati. Il codice sorgente allegato ti servirà da riferimento pratico per iniziare a sperimentare con queste variabili nel tuo codice.

