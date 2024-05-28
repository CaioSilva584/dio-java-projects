
public class App {
	public static void main(String[] args) {
		for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
		
		EstadoBrasileiro estado = EstadoBrasileiro.SAO_PAULO;
		
		System.out.println(estado);
		System.out.println(estado.getNome());
		System.out.println(estado.getSigla());
		
	}
}
