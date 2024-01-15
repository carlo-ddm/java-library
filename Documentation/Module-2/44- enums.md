# Enums

## 1. Introduzione agli Enum
Gli `enum` in Java sono usati per rappresentare un insieme finito e limitato di costanti, migliorando la leggibilità e la sicurezza del codice.

## 2. Limitazioni dell'Uso di Stringhe per Valori Finiti
L'utilizzo di stringhe per rappresentare un insieme limitato di valori può portare a errori, come valori errati o battiture.

## 3. Definizione e Vantaggi degli Enum
Un `enum` è un tipo speciale che definisce un insieme finito di costanti. Utilizzare `enum` elimina la necessità di validazioni estese e riduce il rischio di errori.

## 4. Esempio Pratico: Enum per i Semafori
Creiamo un `enum` per rappresentare i colori di un semaforo:
```java
public enum TrafficLight { RED, GREEN, YELLOW }
```
Questo `enum` definisce i possibili stati di un semaforo.

## 5. Utilizzo degli Enum nel Codice: Classe `Car` e `Main`
### Classe `Car`
```java
public class Car {
    public enum TrafficLight { RED, GREEN, YELLOW }
    // Metodo per gestire la logica dei semafori
    public void drive(TrafficLight trafficLight) {
        // Logica basata sul valore dell'enum
    }
}
```
### Classe `Main`
```java
import static model.Car.TrafficLight.*;
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive(RED); // Uso dell'enum
    }
}
```

## 6. Importazione Statica degli Enum
L'importazione statica degli `enum` permette di accedere ai loro valori direttamente, migliorando ulteriormente la leggibilità.

## 7. Conclusione: Vantaggi degli Enum nella Prevenzione degli Errori a Runtime
L'uso degli `enum` aiuta a prevenire errori a runtime, assicurando che solo valori validi siano utilizzati nel codice.

