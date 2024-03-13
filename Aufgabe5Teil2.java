//Dieser Thread gibt die Buchstaben (A-E) aus und die andere Klasse die zahlen (1-5)

package AufgabenThread;

public class Aufgabe5Teil2 extends Thread {

	@Override
	public void run() {
		for (char c = 'A'; c <= 'E'; c++) {
			System.out.println(c);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

