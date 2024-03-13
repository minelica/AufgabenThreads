//Dieser Thread gibt die Zahlen (1-5) aus und die andere Klasse die Buchstaben (A-E)

package AufgabenThread;

public class Aufgabe5Teil1 extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

