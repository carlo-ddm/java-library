
# Creazione di Stream da Diverse Fonti in Java

In Java, gli stream possono essere creati da varie fonti di dati. Questa documentazione illustra come creare stream da un array e da un file, utilizzando esempi pratici.

## 1. Creazione di Stream da Array

### Descrizione
È possibile creare uno stream da un array utilizzando il metodo `stream` della classe `Arrays`.

### Esempio
```java
String[] greetings = new String[] { "Hello!", "Hola!", "Bonjour!", "Hallo!" };
Arrays.stream(greetings).forEach(greeting -> System.out.println(greeting));
```
In questo esempio, viene creato uno stream dall'array `greetings` e ogni elemento viene stampato utilizzando `forEach`.

## 2. Creazione di Stream da File

### Descrizione
Per creare uno stream da un file, si utilizza il metodo `lines` della classe `Files`. Questo metodo legge ogni riga del file come un elemento dello stream.

### Esempio
```java
Path path = Paths.get("file.txt");
try {
    Files.lines(path).forEach(line -> System.out.println(line));
} catch (IOException e) {
    e.printStackTrace();
}
```
Qui, `Files.lines` crea uno stream dalle righe del file specificato e `forEach` stampa ogni riga.

### Note Importanti
- La creazione di stream da file richiede la gestione delle eccezioni `IOException`.
- Lo stream processa un elemento alla volta, non l'intera fonte dati contemporaneamente.

---

Questi esempi dimostrano come gli stream in Java possano essere creati da diverse fonti di dati, consentendo la loro elaborazione in una pipeline di operazioni. Sebbene in questi esempi venga utilizzata una singola operazione terminale, gli stream creati possono essere passati attraverso una serie di operazioni intermedie e terminali per elaborazioni più complesse.
