# La parola Chiave `static`

## Introduzione al `static` in Java
La parola chiave `static` in Java è usata per indicare che un membro di una classe (campo o metodo) appartiene alla classe stessa piuttosto che a un'istanza specifica.

## Differenza tra Campi Istanza e Campi Statici
- **Campi Istanza**: Appartengono a un oggetto specifico, con valori unici per ogni istanza.
- **Campi Statici**: Appartengono alla classe e sono condivisi tra tutte le istanze.

## Utilizzo Pratico con `User.java` e `Main.java`
Consideriamo i seguenti file come esempio:

### `User.java`
```java
public class User {

    private String firstName;
    private String lastName;
    private static int userCount = 0;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        // Non si usa la chiave "this" perché è un campo che appartiene a un oggetto, non alla classe di cui l'oggetto è un'istanza. La chive "this" fa riferimento esclusivamente all'oggetto corrrente.
        userCount++;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getUserCount() {
        return userCount;
    }
}
```

### `Main.java`
```java
public class Main {
    public static void main(String[] args) {
        
        User liam = new User("Liam", "Smith");
        User olivia = new User("Olivia", "Davis");
        User ethan = new User("Ethan", "Martins");

        System.out.println(liam.getFirstName() + " " + liam.getLastName());
        System.out.println(olivia.getFirstName() + " " + olivia.getLastName());
        System.out.println(ethan.getFirstName() + " " + ethan.getLastName());
        System.out.println("User Count: " + User.getUserCount());

    }
}
```

In `User.java`, il campo `userCount` è statico, indicando che è condiviso da tutte le istanze di `User`.

## Il ruolo del Costruttore in Relazione ai Campi Statici
Ogni volta che il costruttore di `User` viene chiamato, `userCount` viene incrementato, riflettendo il numero totale di istanze create.

## Accesso ai Campi e Metodi Statici
I campi e i metodi statici sono accessibili attraverso il nome della classe, come mostrato in `Main.java`:
```java
System.out.println("User Count: " + User.getUserCount());
```

## Buone Pratiche per l'Uso di Static
- I campi statici dovrebbero essere usati con attenzione per evitare effetti indesiderati sullo stato condiviso.
- E' buona pratica fornire metodi getter statici per accedere ai campi statici privati.

## Conclusioni
La parola chiave `static` è potente in Java, ma deve essere usata con attenzione per mantenere il codice pulito e manutenibile.
