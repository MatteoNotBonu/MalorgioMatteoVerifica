/**
 * 
 * @author <b>Malorgio Matteo</b>
 * @version 2
 * <u> 4bi </u>
 * <i> 13/05/2022 </i>
 */
public class MalorgioMatteoClass {
	/**
	 * costruttore a vuoto che non prende parametri
	 */
	public  MalorgioMatteoClass() {
		
	}
	/**
	 * metodo per il calcolo della sommatoria
	 * @param f indice iniziale per il range del calcolo
	 * @return ritornerà la sommatoria
	 * 
	 * ERRORE 1: r deve essere uguale a 0
	 * ERRORE 2: nel ciclo for i deve essere uguale a 0 e i <= f
	 * ERRORE 3: r+=i; non va fatto il prodotto
	 */
	public int MalorgioMet(int f) {
		int r=0;
		for(int i=0;i<=f;i++) {
			r+=i;
		}
		return r;
	}
	/**
	 * metodo main
	 * @param args vettore di stringhe 
	 */
	public static void main(String[] args) {
		MalorgioMatteoClass m = new MalorgioMatteoClass();
		System.out.println(m.MalorgioMet(5));
		System.out.println(m.MalorgioMet(4));
		System.out.println(m.MalorgioMet(3));
	}

}
