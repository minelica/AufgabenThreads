package AufgabenThread;

public class Aufgabe6Teil2 extends Thread {

	/**
	 * Diese Instanzvariable ermöglicht Threads, auf die Methoden der Klassee
	 * Aufgabe6Teil1 zuzugreifen, um Daten zu lesen, zu bearbeiten und zu schreiben,
	 * während sie gleichzeitig die Synchronisierung und Thread-Sicherheit
	 * gewährleisten.
	 */
	private Aufgabe6Teil1 sharedResource;

	/**
	 * Der Konstruktor
	 * 
	 * @param sharedResource
	 */
	public Aufgabe6Teil2(Aufgabe6Teil1 sharedResource) {
		this.sharedResource = sharedResource;
	}

	/**
	 * Diese Methode führt die Aufgabe eines Threads aus, die darin besteht, Daten
	 * aus gemeinsamen Ressource zu lesen, diese zu bearbeiten und die aktualisierte
	 * Daten zurück in die Ressource zu schreiben, wobei darauf geachtet wird, dass
	 * diese Operationen synchronisiert sind, um Thread-Sicherheit zu gewährleisten.
	 */
	@Override
	public void run() {

		synchronized (sharedResource) {
			int currentData = sharedResource.getData();
			System.out.println("Thread " + Thread.currentThread().getName() + " liest Daten: " + currentData);
			currentData++;
			System.out.println("Thread: " + Thread.currentThread().getName() + " erhöht Daten: " + currentData);
			sharedResource.setData(currentData);
			System.out.println("Thread: " + Thread.currentThread().getName() + " schreibt Daten: " + currentData);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//
//			}
		}
	}
}

