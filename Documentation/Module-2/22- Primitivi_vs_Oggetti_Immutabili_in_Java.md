# Primitivi vs Oggetti Immutabili in Java

## Introduzione
In Java, ogni tipo primitivo ha una corrispondente classe "Wrapper" che crea un oggetto immutabile. Questa documentazione discute le differenze fondamentali tra primitivi e oggetti immutabili in termini di memoria, nullabilità e metodi.

## Differenze di Memoria
Un aspetto cruciale è la differenza nella gestione della memoria tra tipi primitivi e i loro corrispettivi oggetti. Consideriamo alcuni esempi:
- Un `int` primitivo occupa 4 byte, mentre un `Integer` (la sua controparte oggetto) occupa circa 16 byte a causa del sovraccarico dei metadati dell'oggetto.
- Un `long` primitivo occupa 8 byte, mentre un `Long` può occupare fino a 24 byte.
- Analogamente, un `double` primitivo occupa 8 byte, ma un `Double` può richiedere fino a 24 byte.
- Un `char` primitivo occupa 2 byte, mentre un `Character` può occupare fino a 16 byte.
- Un `boolean` primitivo occupa tipicamente meno spazio (la dimensione può variare), ma un `Boolean` occupa 16 byte.

Questo aumento di spazio è dovuto ai metadati e ai meccanismi interni della gestione degli oggetti in Java.

```java
int primitiveInt = 5; // Occupa 4 byte
Integer objectInt = 5; // Occupa circa 16 byte
```

## Nullabilità
Un altro aspetto importante è la nullabilità:
- I tipi primitivi non possono essere `null` poiché rappresentano valori concreti.
- Gli oggetti immutabili, tuttavia, possono essere `null`, poiché un riferimento a un oggetto può non puntare a nulla.

```java
int primitiveInt = 5;
Integer objectInt = null; // Valido
```

## Chiamata ai Metodi
Gli oggetti offrono la possibilità di chiamare metodi, a differenza dei tipi primitivi:
- I tipi primitivi sono limitati alle loro funzionalità basilari.
- Gli oggetti immutabili, come `Integer` o `Long`, hanno metodi integrati, come `toString()` o `compareTo()`.

```java
int primitiveInt = 5;
Integer objectInt = 5;

System.out.println(objectInt.toString()); // Possibile con oggetti
// System.out.println(primitiveInt.toString()); // Errore con primitivi
```

## Conclusione
I tipi primitivi sono più efficienti in termini di memoria e performance. Tuttavia, gli oggetti immutabili offrono flessibilità aggiuntiva, come la possibilità di essere `null` e l'accesso a metodi utili. La scelta tra primitivi e oggetti dipende dal contesto specifico e dai requisiti di design del tuo programma.
