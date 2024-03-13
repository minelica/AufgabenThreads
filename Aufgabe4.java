// Link zu der Aufgabe: http://scalingbits.com/java/javakurs2/programmieren/threads/aufgaben

package AufgabenThread;

public class Aufgabe4 extends Thread {

	Thread joinIt;

	int schlafen;

	/**
	 * @param sleeptime -> Die Zeit in ms, die der Thread schlafen soll
	 * @param toJoin    -> der Thread auf den gewartet werden soll bis er beendet ist
	 */
	public Aufgabe4(int sleeptime, Thread toJoin) {
		this.joinIt = toJoin;
		this.schlafen = sleeptime;
		System.out.println("Thread: " + this + " erzeugt");
	}

	@Override
	public void run() {
		System.out.println("Thread: " + Thread.currentThread().getName() + " gestartet");
		try {
			if (joinIt != null) {
				joinIt.join();
				System.out.println("Thread: " + Thread.currentThread().getName() + " join auf " + joinIt + " fertig");
			}
		} catch (InterruptedException e) {
		}
		System.out.println("Thread: " + Thread.currentThread().getName() + " schläft jetzt für " + schlafen + "ms");
		try {
			Thread.sleep(schlafen);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread: " + Thread.currentThread().getName() + " endet");
	}

}


/*
Dieser Java-Code definiert eine Klasse namens "Aufgabe4", die von der Klasse "Thread" erbt. 
Hier ist eine ausführliche Erklärung des Codes:
	1. Die Klasse "Aufgabe4" hat zwei Instanzvariablen:
		  - `joinIt`: Ein Thread, auf den gewartet wird, bis er beendet ist.
		  - `schlafen`: Eine Ganzzahl, die die Zeit in Millisekunden repräsentiert, 
		  die der Thread schlafen soll.
		2. Der Konstruktor `Aufgabe4(int sleeptime, Thread toJoin)` wird definiert, 
			um Objekte der Klasse zu erstellen. Er erhält zwei Parameter:
		  - `sleeptime`: Die Zeit in Millisekunden, die der Thread schlafen soll.
		  - `toJoin`: Der Thread, auf den gewartet wird, bis er beendet ist.
		3. Die Methode `run()` wird überschrieben, um die Aktionen auszuführen, 
			die der Thread durchführt, wenn er gestartet wird.
		  - Zuerst wird eine Ausgabe generiert, die anzeigt, dass der Thread gestartet wurde.
		  - Dann wird überprüft, ob `joinIt` nicht null ist. Wenn ja, wird auf diesen Thread gewartet, 
		  bis er beendet ist, und dann wird eine entsprechende Ausgabe generiert.
		  - Danach wird eine Ausgabe generiert, die anzeigt, dass der Thread für eine bestimmte Zeit 
		  schlafen wird (`schlafen` Millisekunden).
		  - Der Thread wird für die angegebene Zeit zum Schlafen gebracht.
		  - Schließlich wird eine Ausgabe generiert, die anzeigt, dass der Thread beendet wurde.
		Der Code verwendet die Methoden `join()` und `sleep()` der Klasse `Thread`, um auf andere Threads 
		zu warten und den aktuellen Thread zu pausieren. Außerdem wird die Methode `toString()` verwendet, 
		um eine lesbare Darstellung des Threads zu erhalten.
*/