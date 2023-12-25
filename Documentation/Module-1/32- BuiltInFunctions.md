[Back to Summary](../Summary.md)

# Funzioni Built-in di Java

Le funzioni built-in di Java sono metodi predefiniti che Java fornisce per eseguire operazioni comuni.
Questo documento illustra l'utilizzo di alcune di queste funzioni attraverso esempi di codice pratici.

## Scenario 1: Stampa di un Messaggio

Per stampare un messaggio sulla console, si può utilizzare il metodo `System.out.println()`.

**Esempio:**
```java
String message = "Hello, World!";
System.out.println(message);
```

## Scenario 2: Ottenere la Lunghezza di una Stringa

La lunghezza di una stringa si può ottenere con il metodo `length()`.

**Esempio:**
```java
String example = "Java";
int length = example.length();
```

## Scenario 3: Conversione in Minuscolo

Per convertire una stringa in minuscolo, si utilizza il metodo `toLowerCase()`.

**Esempio:**
```java
String upperCase = "JAVA";
String lowerCase = upperCase.toLowerCase();
```

## Scenario 4: Verifica del Prefisso di una Stringa

Per controllare se una stringa inizia con un determinato prefisso, si può usare `startsWith()`.

**Esempio:**
```java
String programming = "Java programming";
boolean startsWithPrefix = programming.startsWith("Jav");
```

## Scenario 5: Sostituzione dei Caratteri in una Stringa

Per sostituire tutti gli spazi in una stringa con un altro carattere, si può usare `replaceAll()`.

**Esempio:**
```java
String original = "Java is fun!";
String replacedString = original.replaceAll(" ", "-");
```

## Scenario 6: Calcolo della Radice Quadrata

Il calcolo della radice quadrata di un numero si può eseguire con `Math.sqrt()`.

**Esempio:**
```java
double number = 9;
double squareRoot = Math.sqrt(number);
```

## Scenario 7: Calcolo della Potenza di un Numero

Per calcolare la potenza di un numero si utilizza `Math.pow()`.

**Esempio:**
```java
// Questo esempio manca nel codice fornito, ma può essere rappresentato così:
double base = 2;
double exponent = 3;
double power = Math.pow(base, exponent);
```

## Scenario 8: Generazione di un Numero Casuale

Per generare un numero casuale si può usare `Math.random()`.

**Esempio:**
```java
double randomNumber = Math.random();
```

## Scenario 9: Trovare il Maggiore tra Due Numeri

Per determinare il numero più grande tra due numeri, si utilizza `Math.max()`.

**Esempio:**
```java
int number1 = 5;
int number2 = 10;
int maxNumber = Math.max(number1, number2);
```

Questi esempi dimostrano come utilizzare alcune delle funzioni built-in più comuni in Java per semplificare le operazioni quotidiane.
