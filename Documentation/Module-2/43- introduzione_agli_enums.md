# Introduzione agli Enum

## 1. Introduzione agli Enum in Java
Gli `enum` in Java sono tipi speciali che permettono di definire un insieme finito di costanti. Sono particolarmente utili quando si ha bisogno di rappresentare un gruppo limitato e noto di valori.

## 2. Problemi con l'Uso di Stringhe per Valori Limitati
Utilizzare stringhe per rappresentare un insieme limitato di valori, come i giorni della settimana, può portare a errori. Ad esempio, errori di battitura o valori non validi possono creare problemi nel software.

## 3. Enum: Definizione e Vantaggi
Un `enum` contiene un numero finito di costanti. Utilizzando un `enum`, si garantisce che il valore di una variabile appartenga a un insieme predefinito di costanti, eliminando la necessità di validazione dell'input.

## 4. Esempio Pratico: Enum per i Giorni della Settimana
Immaginiamo di creare un `enum` chiamato `DayOfWeek`, che contiene i giorni da lunedì a domenica:
```java
public enum DayOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
```
Definendo una variabile di tipo `DayOfWeek`, assicuriamo che possa essere impostata solo su uno dei giorni definiti nell'`enum`.

## 5. Conclusione
Gli `enum` offrono un modo chiaro e sicuro per lavorare con insiemi di valori limitati e noti, migliorando la robustezza e la leggibilità del codice.
