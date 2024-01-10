[Back to Summary](../Summary.md)

# Java: Fondamenti

## Introduzione

Questa documentazione copre vari aspetti fondamentali della programmazione in Java, inclusi dettagli su come nominare i file Java, la sensibilità al caso di Java, la struttura delle classi e il punto d'ingresso delle applicazioni Java.

## Nomenclatura dei File Java

In Java, è importante nominare correttamente i file contenenti codice sorgente. Le regole chiave includono:

- **Corrispondenza con il Nome della Classe**: Il nome del file deve corrispondere al nome della classe pubblica contenuta nel file.
- **Uso del CamelCase**: Si utilizza il CamelCase per il nome del file, con la prima lettera di ogni parola in maiuscolo.
- **Sensibilità al Caso**: Java è case-sensitive, quindi la corrispondenza tra il nome della classe e il nome del file deve rispettare maiuscole e minuscole.

## Sensibilità al Caso in Java

Java è un linguaggio case-sensitive, il che significa che distingue tra lettere maiuscole e minuscole. Questa sensibilità al caso si applica a:

- Nomi di variabili
- Nomi di classi
- Nomi di metodi
- Parole chiave

## Metodo Main: Punto d'Ingresso dell'Applicazione

Il metodo `main()` in Java è il punto d'ingresso di un'applicazione. La sua firma deve essere `public static void main(String[] args)`. È qui che inizia l'esecuzione di un programma Java.

## Esempio di Codice

Ecco un semplice esempio di un programma Java che utilizza il metodo `main()` per stampare un messaggio:

```java
public class HalloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
```

Questo codice definisce una classe `HalloJava` con un metodo `main()`. All'interno del metodo `main()`, viene stampato il messaggio "Hello Java!" sulla console.

## Conclusione

Questa documentazione fornisce una panoramica di alcuni concetti chiave della programmazione Java, essenziali per chi inizia a lavorare con questo linguaggio. La comprensione di questi fondamenti è cruciale per lo sviluppo di applicazioni Java efficaci e ben strutturate.
