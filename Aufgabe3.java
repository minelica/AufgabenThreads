//Aufgabenstellung:
//Erstelle ein Programm, das drei Threads verwendet, um die Zahlen von 1 bis 10 auszugeben. 
//Jeder Thread soll für eine bestimmte Gruppe von Zahlen zuständig sein
//(z. B. Thread 1 für Zahlen von 1 bis 3, Thread 2 für Zahlen von 4 bis 7 und 
//Thread 3 für Zahlen von 8 bis 10).

package AufgabenThread;

public class Aufgabe3 extends Thread {

	int start;
	int end;

	public Aufgabe3(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
//			System.out.println(Thread.currentThread().getName() + ": " + i);
			System.out.println(i);
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}
}
