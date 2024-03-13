# Aufgabenstellungen

--------------------------------------------------------------------------------------------------------

### AUFGABE 1

Erstelle einen Java-Thread, der die Zahlen von 1 bis 5 ausgibt, wobei jede Zahl um eine Sekunde verzögert ist.

--------------------------------------------------------------------------------------------------------

### AUFGABE 2

Erstelle ein Programm, das einen einfachen Countdown-Timer implementiert.

Der Timer soll von einer vom Benutzer angegebenen Anzahl von Sekunden herunterzählen und dabei jede Sekunde die verbleibende Zeit anzeigen. Nach Ablauf der Zeit soll eine Benachrichtigung ausgegeben werden.

--------------------------------------------------------------------------------------------------------

### AUFGABE 3

Erstelle ein Programm, das drei Threads verwendet, um die Zahlen von 1 bis 10 auszugeben. Jeder Thread soll für eine bestimmte Gruppe von Zahlen zuständig sein

(z. B. Thread 1 für Zahlen von 1 bis 3, Thread 2 für Zahlen von 4 bis 7 und Thread 3 für Zahlen von 8 bis 10).

--------------------------------------------------------------------------------------------------------

### AUFGABE 4

Link: [Aufgaben (Threads) | Scalingbits](http://scalingbits.com/java/javakurs2/programmieren/threads/aufgaben)

--------------------------------------------------------------------------------------------------------

### AUFGABE 5

Erstellen Sie eine Java-Anwendung, die zwei Threads erstellt. Einer der Threads soll Zahlen von 1 bis 5 ausgeben, während der andere Threads Buchstaben von ‘A’ bis ‘E’ ausgibt. Stellen Sie sicher, dass die Ausgaben beider Threads abwechselnd erfolgen, d.h. zuerst eine Zahl, dann ein Buchstabe, dann wieder eine Zahl usw.

--------------------------------------------------------------------------------------------------------

### AUFGABE 6

Erstellen Sie eine Java-Anwendung, die folgende Anforderungen erfüllt:

1. Die Anwendung soll eine Klasse `SharedResource` (Aufgabe6Teil1) enthalten, die eine gemeinsame Ressource repräsentiert. Diese Ressource könnte beispielsweise ein gemeinsames Datenobjekt sein.

2. Implementieren Sie eine Klasse `WorkerThread` (Aufgabe6Teil2), die von `Thread` erbt. Jeder `WorkerThread` soll auf die gemeinsame Ressource zugreifen und eine bestimmte Aufgabe damit ausführen. Zum Beispiel könnten die Threads Daten aus der gemeinsamen Ressource lesen, bearbeiten und zurück in die Ressource schreiben.

3. Die Anwendung soll eine Hauptklasse enthalten, die mehrere `WorkerThread`-Objekte erstellt und startet.

4. Stellen Sie sicher, dass die Threads synchronisiert sind, um Thread-Sicherheit zu gewährleisten und Konflikte bei gleichzeitigem Zugriff auf die gemeinsame Ressource zu vermeiden. Verwenden Sie dazu geeignete Synchronisierungsmethoden wie `synchronized`-Blöcke oder Locks.

5. Implementieren Sie eine Möglichkeit, die Ausführung der Threads zu koordinieren, z.B. indem Sie darauf warten, dass alle Threads ihre Aufgaben abgeschlossen haben, bevor die Anwendung beendet wird.
