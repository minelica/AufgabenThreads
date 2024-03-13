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
