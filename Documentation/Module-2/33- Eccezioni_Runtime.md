
# Eccezioni di Runtime

## Introduzione
Le eccezioni di runtime in Java sono un tipo di eccezioni che derivano da errori che avvengono durante l'esecuzione del programma. A differenza delle eccezioni checked, non richiedono di essere dichiarate o gestite obbligatoriamente nel codice. Tuttavia, possono causare l'interruzione del programma se non vengono opportunamente gestite.

## Tipi di Eccezioni di Runtime

### 1. ArrayIndexOutOfBoundsException
Questo errore si verifica quando si tenta di accedere a un indice di un array che è fuori dai limiti dell'array stesso.

**Esempio dal Codice:**
```java
int[] grades = new int[] {96, 65, 56, 86};
System.out.println(grades[4]);
```

### 2. NullPointerException
Si verifica quando si tenta di utilizzare un riferimento a un oggetto che non è stato inizializzato (cioè il suo valore è `null`).

**Esempio dal Codice:**
```java
String[] names = new String[7]; 
names[0] = "John";
// Altri elementi non sono inizializzati e quindi null
for (String name : names) {
    System.out.println(name.toUpperCase());
}
```

### 3. InputMismatchException
Quest'eccezione si verifica quando si inserisce un tipo di input non compatibile con quello atteso durante l'utilizzo di un `Scanner`.

**Esempio dal Codice:**
```java
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter a random integer");
scanner.nextInt(); // Errore se l'input non è un intero
scanner.close();
```

## Gestione delle Eccezioni
Per gestire queste eccezioni, si possono utilizzare blocchi `try-catch`. Ecco un esempio di gestione dell'`ArrayIndexOutOfBoundsException`:

```java
try {
    System.out.println(grades[4]);
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Indice dell'array fuori dai limiti!");
}
```

## Conclusioni
Gestire adeguatamente le eccezioni di runtime è fondamentale per assicurare la stabilità e l'affidabilità di un'applicazione Java. Comprendere e prevenire questi errori comuni può migliorare notevolmente la qualità del codice.

