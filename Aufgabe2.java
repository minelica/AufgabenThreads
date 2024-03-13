//Aufgabenstellung
//Erstelle ein Programm, das einen einfachen Countdown-Timer implementiert.
//Der Timer soll von einer vom Benutzer angegebenen Anzahl von Sekunden herunterzählen 
//und dabei jede Sekunde die verbleibende Zeit anzeigen. Nach Ablauf der Zeit soll 
//eine Benachrichtigung ausgegeben werden.

package AufgabenThread;

public class Aufgabe2 extends Thread {

	private int seconds;

	public Aufgabe2(int seconds) {
		this.seconds = seconds;
	}
	

	@Override
	public void run() {
		try {
			for (int i = seconds; i > 0; i--) {
				System.out.println("Verbleibende Zeit: " + i + " Sekunden");
				Thread.sleep(1000);
			}
			System.out.println("Zeit abgelaufen!");
		} catch (InterruptedException e) {

		}

	}
}

