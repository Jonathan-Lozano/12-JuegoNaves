import java.util.Scanner;

/**
 * 
 * @author Jonathan Lozano
 *
 */
public class JugadorDeNaves {

	/**
	 * Metodo principal donde se llaman las clases
	 * 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Naves n1 = Naves.instanciaNave();
		Jugador j1 = new Jugador();
		Computadora c1 = new Computadora();

		System.out.println(String.format("Hay %d naves", n1.getVidas()));

		while (n1.getVidas() > 0) {

			System.out.println("¿Cuantos disparos quieres hacer?");
			int disparos = in.nextInt();

			if (disparos <= n1.getVidas()) {

				for (int indx = 0; indx < disparos; indx++) {
					j1.eliminarNave();

				}

				System.out.println(String.format("%d naves eliminadas", disparos));

				if (Math.round(disparos * Math.random()) > 0) {
					for (int indx = 0; indx < Math.round(disparos * Math.random()); indx++) {
						c1.crearNave();
					}
				}

				System.out.println(String.format("Quedan %d naves", n1.getVidas()));
			} else {
				System.out.println("El numero de disparos no debe ser mayor al numero de naves");
			}
		}
	}

}
