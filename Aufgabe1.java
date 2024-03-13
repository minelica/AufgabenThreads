//Aufgabenstellung:
//Erstelle einen Java-Thread, der die Zahlen von 1 bis 5 ausgibt, wobei jede Zahl um eine Sekunde verzögert ist.

package AufgabenThread;

public class Aufgabe1 extends Thread{

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e){
		}
	}
	
}

