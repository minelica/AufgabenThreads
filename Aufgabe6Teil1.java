//Diese Klasse respräsentiert eine gemeinsame Ressource, 
//auf die mehrere Threads zugreifen können

package AufgabenThread;

public class Aufgabe6Teil1 {

	/**
	 * Das ist eine private Instanzvariable. Sie dient dazu, Daten zu speichern, die
	 * von den Threads gelesen, bearbeitet und zurückgeschrieben werden sollen. In
	 * diesem Fall wird data als eine ganze Zahl (int) deklariert. Achtung: da die
	 * Variable data als private deklariert ist, kann sie NUR innerhalb dieser
	 * Klasse direkt zugegriffen werden. Stattdessen verwenden wir öffentliche
	 * getData() und setData(), um auf die Daten zuzugreifen oder sie zu ändern.
	 */
	private int data;

	/**
	 * Diese Methode ruft den aktuellen Wert der Instanzvariablen data auf, der von
	 * Threads gelesen wird.
	 * 
	 * @return
	 */
	public synchronized int getData() {
		return data;
	}

	/**
	 * Diese Methode wird verwendet, um den Wert der Instanzvariablen data zu
	 * aktualisieren.
	 * 
	 * @param newData -> der neue Wert, der der Instanzvariable zugewiesen werden
	 *                soll data = newData -> der alte Wert von data wird durch den
	 *                Wert von newData ersetzt
	 */
	public synchronized void setData(int newData) {
		data = newData;
	}
}

