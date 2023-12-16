# `Documentazione Java: Comandi javac e java`

## Introduzione
Questa documentazione copre l'uso dei comandi `javac` e `java` in Java, spiegando il processo di compilazione, esecuzione e l'importanza di ricompilare dopo aver apportato modifiche al codice.

## Il Comando javac
- **Significato**: `javac` sta per "Java Compiler". La "c" rappresenta "Compiler", indicando la funzione del comando di compilare il codice sorgente Java in bytecode.
- **Processo di Compilazione**: Eseguendo `javac NomeFile.java` nel terminale, il compilatore Java trasforma il codice sorgente in bytecode.
- **Output della Compilazione**: Il risultato è un file `.class`, contenente il bytecode, solitamente nella stessa directory del file sorgente.

## Esecuzione del Codice Compilato con java
- **Comando java**: Dopo la compilazione, il programma viene eseguito con `java NomeClasse`, dove `NomeClasse` è il nome della classe contenente il metodo `main`.
- **No Estensione .java**: Si noti che il comando `java` richiede solo il nome della classe, senza l'estensione `.java`.

## Importanza della Compilazione con javac
- **Ricompilazione dopo Modifiche**: Se il codice sorgente viene modificato, è necessario ricompilarlo prima di eseguirlo nuovamente.
- **Esempio Pratico**: 
  - Modificando `HalloJava.java` e eseguendo `java HalloJava` senza ricompilare, il programma mostrerà il risultato precedente.
  - Dopo aver ricompilato, l'esecuzione rifletterà le modifiche.

## Esempio di Codice
```java
public class HalloJava {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
```
Per eseguire questo codice:
1. Compilare con `javac HalloJava.java`.
2. Eseguire con `java HalloJava`.

## Conclusione
I comandi `javac` e `java` sono fondamentali per lo sviluppo e l'esecuzione di applicazioni Java. La loro corretta comprensione e utilizzo assicurano un flusso di lavoro efficace e preciso nel ciclo di vita dello sviluppo del software Java.