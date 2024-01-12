
# Validazione degli Argomenti in Java

## Introduzione
La validazione degli argomenti è un aspetto cruciale nella programmazione Java. Si tratta di verificare l'adeguatezza dei valori passati ai metodi o costruttori per prevenire errori e comportamenti anomali nell'applicazione.

## Esempi di Validazione degli Argomenti

### Validazione delle Stringhe
Assicurarsi che una stringa non sia `null` o vuota è fondamentale per evitare errori come `NullPointerException`.

**Esempio da `Main.java`:**
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Please update your username: ");
String username = scanner.nextLine();
if (username.isBlank()) {
    System.out.println("Sorry, that is an invalid username");
}
```

### Validazione dei Valori Numerici
È importante verificare che i valori numerici siano entro un certo intervallo per garantire la correttezza logica del programma.

**Esempio da `User.java`:**
```java
public void setAge(int age) { 
    if (age < 0) {
        throw new IllegalArgumentException("Age cannot be negative!");
    }
    this.age = age;
}
```

## Migliori Pratiche e Gestione degli Errori
1. Utilizzare controlli preventivi per verificare la validità degli argomenti.
2. Lanciare eccezioni appropriate come `IllegalArgumentException` per segnalare valori inappropriati.
3. Fornire messaggi di errore chiari per facilitare il debugging e l'uso dell'applicazione.

## Conclusioni
La validazione efficace degli argomenti è essenziale per creare applicazioni robuste e affidabili in Java. Seguire queste linee guida aiuta a prevenire bug e comportamenti imprevisti nel software.

