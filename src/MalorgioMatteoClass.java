/**
 * 
 * @author <b>Malorgio Matteo</b>
 * @version 1.0
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
	 */
	public int MalorgioMet(int f) {
		int r=1;
		for(int i=f;i<0;i++) {
			r= r*i;
		}
		return r;
	}
	/**
	 * metodo main
	 * @param args vettore di stringhe 
	 */
	public static void main(String[] args) {
		MalorgioMatteoClass m = new MalorgioMatteoClass();
		m.MalorgioMet(2);
		m.MalorgioMet(3);
	}

}
