package AufgabenThread;

import java.util.Scanner;

public class Main {

//	public static void main(String[] args) {

//----- Aufgabe 1 -----------------------------------------------------

//		Aufgabe1 myThread1 = new Aufgabe1();
//		myThread1.start();

//----- Aufgabe 2 -----------------------------------------------------

//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Geben Sie eine Anzahl von Sekunden an: ");
//		int seconds = scanner.nextInt();
//		
//		Aufgabe2 timer = new Aufgabe2(seconds);
//		timer.start();

//----- Aufgabe 3 -----------------------------------------------------

//		Aufgabe3 counter1 = new Aufgabe3(1, 3);
//		Aufgabe3 counter2 = new Aufgabe3(4, 7);
//		Aufgabe3 counter3 = new Aufgabe3(8, 10);
//		
//		counter1.start();
//		counter2.start();
//		counter3.start();

//----- Aufgabe 4 -----------------------------------------------------

//		Aufgabe4 thread1 = new Aufgabe4(2003, null);
//		Aufgabe4 thread2 = new Aufgabe4(2002, thread1);
//		Aufgabe4 thread3 = new Aufgabe4(2001, thread2);
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();

//----- Aufgabe 5 -----------------------------------------------------

//		Aufgabe5Teil1 numberThread = new Aufgabe5Teil1();
//		Aufgabe5Teil2 letterThread = new Aufgabe5Teil2();
//		
//		numberThread.start();
//		letterThread.start();

//----- Aufgabe 6 -----------------------------------------------------

	/**
	 * Hier erstellen wir innerhalb einer Schleife für jeden Thread ein neues
	 * Thread-Objekt, starten es und warten auf seine Beendigung. Anschließend wird
	 * der neue Thread erstellt und gestartet.
	 * 
	 * @param args
	 * @throws InterruptedException In dieser main-Methode wird join()-Methode
	 *                              verwendet, um darauf zu warten, dass jeder
	 *                              Thread seine Aufgabe abgeschlossen hat, bevor
	 *                              die Ausführung der main()-Methode fortgesetzt
	 *                              wird.
	 */
	public static void main(String[] args) throws InterruptedException {

		Aufgabe6Teil1 sharedResource = new Aufgabe6Teil1();

		int numThreads = 5;

		Thread[] numArray = new Thread[numThreads];


			for (int i = 0; i < numThreads; i++) {
				Thread thread = new Aufgabe6Teil2(sharedResource);
				thread.start();
				numArray[i] = thread;
			}

			for (int i = 0; i < numThreads; i++) {
				numArray[i].join();
			}
	}

}

