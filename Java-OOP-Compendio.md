
# Java-OOP-Compendium

## Introduzione alla Programmazione Orientata agli Oggetti (OOP)

La programmazione orientata agli oggetti (OOP) in Java è un paradigma di programmazione che utilizza "oggetti" - istanze di classi - per strutturare il software in modo più organizzato e flessibile. L'obiettivo è creare codice che sia più facile da comprendere, manutenere e sviluppare. 

### Concetti Chiave:
- **Oggetti e Classi**: Gli oggetti sono istanze di classi, che fungono da modelli. Un oggetto incapsula stati e comportamenti definiti dalla sua classe.
- **Campi (Stato)**: Ogni oggetto ha un insieme di campi (o variabili d'istanza) che rappresentano lo stato dell'oggetto.
- **Metodi (Comportamento)**: Ogni oggetto può eseguire azioni definite dai metodi della sua classe.

### Creazione di un Oggetto:
```java
Car toyota = new Car();
```

### Modifica dello Stato di un Oggetto:
```java
nissan.make = "Nissan";
nissan.price = 10000;
nissan.year = 2020;
nissan.color = "Green";
```

### Importanza di `private` e Uso di Getter e Setter:
Per mantenere il codice sicuro e ben incapsulato, le proprietà degli oggetti dovrebbero essere `private`, con accesso controllato tramite metodi `getter` e `setter`.

---


## Costruttori e Costruttori Copia in Java

I costruttori in Java sono metodi speciali usati per inizializzare oggetti. Il costruttore viene chiamato quando viene creato un oggetto di una classe.

### Caratteristiche dei Costruttori:
- **Nome del Costruttore**: Il nome del costruttore deve essere lo stesso della classe.
- **Non Hanno un Tipo di Ritorno**: A differenza dei metodi, i costruttori non hanno un tipo di ritorno.

### Creazione di un Costruttore:
```java
public Car(String make, double price, int year, String color) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
}
```

### Costruttore Copia:
Il costruttore copia in Java è un costruttore che crea un nuovo oggetto come copia di un oggetto esistente.

### Utilizzo del Costruttore Copia:
```java
public Car(Car source){
    this.make = source.make;
    this.price = source.price;
    this.year = source.year;
    this.color = source.color;
}
```

### Importanza del Costruttore Copia:
- **Unicità dell'Oggetto**: Il costruttore copia è essenziale per creare una nuova istanza con lo stesso stato di un oggetto esistente ma con una referenza diversa.
- **Controllo sulla Clonazione**: Fornisce un controllo esplicito su come gli oggetti vengono clonati.

---


## Metodi e Esecuzione di Compiti in Java

In Java, i metodi sono azioni che gli oggetti possono eseguire. Sono definiti all'interno delle classi e possono essere utilizzati per modificare lo stato interno dell'oggetto o interagire con altri oggetti.

### Definizione di un Metodo:
Un metodo in Java è definito con un livello di accesso, un tipo di ritorno, un nome e un elenco di parametri.

### Esempio di Metodo:
```java
public void drive() {
    System.out.println("Driving a car!");
}
```

### Chiamata di un Metodo:
Per chiamare un metodo, è necessario utilizzare un riferimento a un oggetto seguito dal nome del metodo e eventuali argomenti necessari.

### Esempio di Chiamata di Metodo:
```java
Car myCar = new Car();
myCar.drive();  // Chiamata del metodo drive
```

I metodi possono anche ritornare valori e ricevere parametri per eseguire operazioni più complesse e interattive.

---


## Gestione degli Array e Oggetti Mutabili in Java

Java offre un supporto nativo per gli array, che sono collezioni di elementi dello stesso tipo. Gli array sono oggetti mutabili, il che significa che i loro elementi possono essere modificati dopo la creazione.

### Creazione di un Array:
```java
String[] names = new String[5];  // Array di 5 elementi di tipo String
```

### Modifica degli Elementi dell'Array:
```java
names[0] = "Alice";
names[1] = "Bob";
```

### Oggetti Mutabili:
Un oggetto è considerato mutabile se il suo stato può essere modificato dopo la creazione. La mutabilità può introdurre complessità e potenziali problemi, come la condivisione non intenzionale di riferimenti.

### Gestione della Mutabilità:
- **Immutabilità Selettiva**: Dove possibile, è consigliabile utilizzare oggetti immutabili o rendere gli oggetti mutabili privati e controllare l'accesso tramite metodi.
- **Costruttori Copia**: Usare costruttori copia per creare nuove istanze con lo stesso stato, ma con riferimenti distinti.

### Esempio di Costruttore Copia per un Array:
```java
public Car(Car source) {
    this.model = source.model;
    this.colors = Arrays.copyOf(source.colors, source.colors.length);
}
```

---


## Sovrascrittura del Metodo toString in Java

In Java, ogni classe eredita un metodo `toString()` dalla classe `Object`. Questo metodo è spesso sovrascritto per fornire una rappresentazione stringa più informativa dell'oggetto.

### Uso Predefinito di toString():
Il metodo `toString()` di default restituisce una stringa che consiste nel nome della classe seguito da `@` e dall'hashcode dell'oggetto. Spesso, questa non è una rappresentazione utile dello stato dell'oggetto.

### Sovrascrittura di toString():
Sovrascrivere `toString()` in una classe consente di definire una rappresentazione stringa più significativa.

### Esempio di Sovrascrittura di toString():
```java
@Override
public String toString() {
    return "Car{" +
           "make='" + make + ''' +
           ", price=" + price +
           ", year=" + year +
           ", color='" + color + ''' +
           '}';
}
```

In questo esempio, `toString()` è stato sovrascritto nella classe `Car` per restituire una stringa che descrive lo stato dell'oggetto Car.

---


## Classi Contenitive e Gestione delle Proprietà in Java

In Java, è comune creare classi che funzionano come contenitori per collezioni di oggetti. Queste classi contenitive aiutano a organizzare e gestire gruppi di oggetti correlati.

### Esempio di Classe Contenitiva:
```java
public class Dealership {
    private Car[] cars;

    public Dealership(Car[] cars) {
        this.cars = cars;
    }

    // Metodi per l'accesso e la manipolazione degli oggetti Car
}
```

In questo esempio, `Dealership` è una classe contenitiva per un array di oggetti `Car`. Fornisce metodi per accedere e manipolare gli oggetti `Car`.

### Gestione delle Proprietà in Classi Contenitive:
- **Costruttore per Inizializzazione Profonda**: Per evitare problemi di condivisione di riferimenti, è importante usare un costruttore che esegua una copia profonda degli oggetti contenuti.
- **Metodi Getter e Setter**: Questi metodi forniscono un accesso controllato alle proprietà private, mantenendo l'incapsulamento.

### Esempio di Costruttore per Copia Profonda:
```java
public Dealership(Car[] cars) {
    this.cars = new Car[cars.length];
    for (int i = 0; i < cars.length; i++) {
        this.cars[i] = new Car(cars[i]); // Costruttore copia
    }
}
```

---


## Tipi di Dati in Java

Java supporta due categorie principali di tipi di dati: primitivi e oggetti (o tipi di riferimento). La comprensione di queste categorie è fondamentale per la programmazione efficace in Java.

### Tipi di Dati Primitivi:
I tipi primitivi in Java includono `int`, `long`, `double`, `char`, `boolean`, ecc. Questi tipi:
- Non sono oggetti.
- Hanno un valore predefinito e occupano una quantità fissa di memoria.
- Non possono essere null.

### Tipi di Dati Oggetto:
I tipi oggetto (o tipi di riferimento) includono classi, interfacce e array. Gli oggetti:
- Sono istanze di classi.
- Possono essere null.
- Hanno comportamenti definiti dai loro metodi.

### Oggetti Immutabili e Mutabili:
- **Immutabili**: Oggetti che non possono essere modificati dopo la loro creazione (es. `String`).
- **Mutabili**: Oggetti che possono cambiare stato (es. Array, Liste).

### Importanza dei Tipi di Dati:
La scelta tra tipi primitivi e oggetti dipende dalle esigenze specifiche del programma, considerando efficienza, facilità di utilizzo e altre caratteristiche.

---


## Collezioni e Liste in Java

Java offre un ricco set di strutture di dati sotto forma di collezioni. Le collezioni più comuni sono le liste, che gestiscono insiemi ordinati di elementi.

### List in Java:
- **ArrayList**: Una lista basata su un array dinamico. Offre accesso rapido agli elementi ma è meno efficiente nelle operazioni di inserimento e rimozione, specialmente all'inizio della lista.
- **LinkedList**: Una lista doppiamente collegata. Offre inserimenti e rimozioni efficienti, ma l'accesso agli elementi è meno rapido rispetto all'ArrayList.

### Esempi di Utilizzo di Liste:
```java
List<String> names = new ArrayList<>();
names.add("Alice");
names.add("Bob");

List<String> otherNames = new LinkedList<>();
otherNames.add("Charlie");
otherNames.add("Diana");
```

Le liste sono parte dell'interfaccia `List` in Java, che fornisce metodi per manipolare gruppi di oggetti.

### Importanza delle Collezioni:
Le collezioni in Java forniscono un modo flessibile e potente per lavorare con gruppi di oggetti. Sono fondamentali per la gestione di dati dinamici e strutture di dati complesse.

---

Progresso: 8/20 (40% completato)

## Override dei Metodi equals e hashCode in Java

In Java, i metodi `equals()` e `hashCode()` giocano un ruolo cruciale nella gestione degli oggetti, in particolare per quanto riguarda il confronto e la gestione in collezioni come HashSet e HashMap.

### Metodo equals():
- **Uso Predefinito**: Per impostazione predefinita, il metodo `equals()` confronta le referenze, non i contenuti degli oggetti.
- **Override di equals()**: Per confrontare gli oggetti in base al loro stato (contenuto), è necessario sovrascrivere `equals()`.

### Esempio di Override di equals():
```java
@Override
public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Car car = (Car) obj;
    return year == car.year &&
           Double.compare(car.price, price) == 0 &&
           Objects.equals(make, car.make) &&
           Objects.equals(color, car.color);
}
```

### Metodo hashCode():
- **Uso**: Il metodo `hashCode()` è utilizzato nelle collezioni basate su hash per determinare l'indice dell'oggetto.
- **Importanza dell'Override**: Se `equals()` viene sovrascritto, anche `hashCode()` dovrebbe essere sovrascritto per mantenere la coerenza.

### Esempio di Override di hashCode():
```java
@Override
public int hashCode() {
    return Objects.hash(make, price, year, color);
}
```

Override appropriati di `equals()` e `hashCode()` garantiscono che gli oggetti possano essere confrontati e gestiti in modo efficace nelle collezioni.

---

Progresso: 9/20 (45% completato)

## Gestione delle Eccezioni in Java

La gestione delle eccezioni è un aspetto cruciale della programmazione in Java. Le eccezioni sono eventi che interrompono il normale flusso di esecuzione di un programma e devono essere gestite adeguatamente per mantenere la stabilità dell'applicazione.

### Tipi di Eccezioni:
- **Eccezioni Controllate (Compile-Time)**: Devono essere gestite nel codice, ad esempio, `IOException`.
- **Eccezioni Non Controllate (Runtime)**: Sorgono durante l'esecuzione del programma, ad esempio, `NullPointerException`.

### Try-Catch Block:
Un blocco `try-catch` è utilizzato per catturare e gestire le eccezioni.

### Esempio di Try-Catch:
```java
try {
    // Codice che può generare un'eccezione
} catch (ExceptionType e) {
    // Gestione dell'eccezione
}
```

### Finally Block:
Il blocco `finally` può essere usato dopo `try-catch` per eseguire codice indipendentemente dal fatto che un'eccezione sia stata generata o meno.

### Esempio di Finally:
```java
finally {
    // Codice eseguito dopo try-catch, indipendentemente dalle eccezioni
}
```

La corretta gestione delle eccezioni assicura che il programma possa gestire situazioni impreviste senza arrestarsi bruscamente.

---

Progresso: 10/20 (50% completato)

## Validazione degli Argomenti in Java

La validazione degli argomenti è una pratica essenziale in Java per garantire che i metodi ricevano dati corretti e per prevenire errori o comportamenti inattesi.

### Importanza della Validazione:
- **Robustezza**: Assicura che il metodo funzioni con valori di input validi.
- **Prevenzione di Errori**: Aiuta a evitare errori come `NullPointerException` e `IllegalArgumentException`.

### Esempi di Validazione degli Argomenti:
```java
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("L'età non può essere negativa.");
    }
    this.age = age;
}

public void setUsername(String username) {
    if (username == null || username.isEmpty()) {
        throw new IllegalArgumentException("Il nome utente non può essere vuoto.");
    }
    this.username = username;
}
```

Questi esempi dimostrano come validare gli argomenti prima di assegnarli a campi di un oggetto, lanciando eccezioni appropriate se necessario.

---

Progresso: 11/20 (55% completato)

## Uso delle Mappe in Java

Le mappe in Java sono strutture di dati che memorizzano coppie di chiavi-valori. Sono utili per l'accesso rapido ai dati tramite chiavi uniche.

### HashMap e TreeMap:
- **HashMap**: Memorizza le coppie chiave-valore in modo non ordinato. Offre accessi e inserimenti efficienti.
- **TreeMap**: Memorizza le coppie chiave-valore in un ordine ordinato. È utile quando è necessario un ordinamento naturale.

### Esempi di Uso delle Mappe:
```java
Map<String, Integer> ageMap = new HashMap<>();
ageMap.put("Alice", 30);
ageMap.put("Bob", 25);

Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Charlie", 35);
treeMap.put("Diana", 28);
```

### Importanza delle Mappe:
Le mappe sono essenziali per la memorizzazione e la ricerca efficiente di dati basati su chiavi. Sono ampiamente utilizzate per vari casi d'uso in Java, da semplici cache a strutture di dati complesse.

---

Progresso: 12/20 (60% completato)

## Pacchetti e Import in Java

I pacchetti in Java sono utilizzati per organizzare le classi e le interfacce in gruppi logicamente correlati, facilitando la gestione del codice in applicazioni di grandi dimensioni.

### Uso dei Pacchetti:
- **Definizione del Pacchetto**: Utilizzare la keyword `package` all'inizio del file per specificare il pacchetto a cui appartiene una classe o interfaccia.
- **Organizzazione**: I pacchetti aiutano a evitare conflitti di nomi e a mantenere un'organizzazione strutturata del codice.

### Importazione di Classi:
- **Keyword `import`**: Usare `import` per includere classi e interfacce da altri pacchetti.
- **Import Statico**: Usato per importare campi e metodi statici di una classe.

### Esempi di Importazione:
```java
import java.util.List;
import java.util.ArrayList;
import static java.lang.Math.PI;
```

Questi esempi mostrano come importare classi e metodi statici, rendendoli accessibili nel file corrente.

---

Progresso: 13/20 (65% completato)
