package Requerimiento2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// clase que usamos para generar aleatoriamente los atributos de la clase Mail mendiante la llamada
// a los métodos que implementamos para ello.
public class MailGeneration {
	//Método para meter los parámetros de los atributos de la clase Mail. 
	public Mail mailProduction() {
		Mail mail= new Mail();
		mail.setId(generatorId());
		mail.setSender(remitentes());
		mail.setAddressee(destinatarios());
		mail.setAffair(asunto());
		mail.setBodyText(cuerpo());
		
		return mail;
	}
	
	//método para generar un id aleatoriamente
	public int generatorId() {
		int numero = ThreadLocalRandom.current().nextInt(0, 10000);
		return numero;
	}
	
	//método para generar un remitente aleatoriamente
	public String remitentes() {
		List<String> remitente= new ArrayList<String>();
		remitente.add("Pajaroloco@gmail.com");
		remitente.add("Viudanegra@gmail.com");
		remitente.add("MalcomX@gmail.comX");
		remitente.add("Chipiriflauticos@gmail.com");
		remitente.add("Elmo@gmail.com");
		remitente.add("Triski@gmail.com");
		remitente.add("CerditaPegui@gmail.com");
		
		int numero= ThreadLocalRandom.current().nextInt(0, 6);
		return remitente.get(numero);
	}
	
	//método para generar un destinatario aleatoriamente
	public String destinatarios() {
		List<String> destinatario = new ArrayList<String>();
		destinatario.add("Doraymun@gmail.com");
		destinatario.add("PetterPam@gmail.com");
		destinatario.add("Pocoyo@gmail.com");
		destinatario.add("MichellePFert@gmail.com");
		destinatario.add("DonAtelo@gmail.com");
		destinatario.add("MrBean@gmail.com");
		destinatario.add("pikachu@gmail.com");
		
		int numero = ThreadLocalRandom.current().nextInt(0, 6);
		
		return destinatario.get(numero);
	}
	
	//método para generar el asunto del email aleatoriamente
	public String asunto() {
		List<String> asuntos = new ArrayList<String>();
		asuntos.add("El pollo se ha salido de la cazuela");
		asuntos.add("Viene IronMan en barca de madera");
		asuntos.add("Come pollo y echaras plumas");
		asuntos.add("Batea fuerte y marca victoria");
		asuntos.add("La venta del quinto que da a un segundo");
		asuntos.add("De mayor comeras legumbres");
		asuntos.add("La esquina redonda");
		asuntos.add("El puerto en mayo");
		asuntos.add("Coge, corre y vuela");
		asuntos.add("Tengo el cerebro calcinado");
		asuntos.add("El código como un segundo hijo");
		
		
		int numero = ThreadLocalRandom.current().nextInt(0, 10);
		
		return asuntos.get(numero);
	}
	// método para generar el cuerpo del email de forma aleatoria.
	public String cuerpo() {
		List<String> body = new ArrayList<String>();
		body.add("Va usté muy cargadoo no te digo trigo por no llamarte Rodrigor mamaar papaar papaar ese pedazo ");
		body.add("Apetecan hasta luego Lucas quietooor sexuarl a peich fistro pecador ese hombree");
		body.add(" Ese hombree ese que llega amatomaa pecador fistro fistro se calle ustée ese pedazo de jarl");
		body.add(
				" No te digo trigo por no llamarte Rodrigor fistro diodeno diodenoo diodeno condemor me cago en tus muelas jarl va usté muy cargadoo");
		body.add("Tiene musho peligro va usté muy cargadoo jarl");
		body.add("Se calle ustée te voy a borrar el cerito a wan no te digo trigo por no llamarte Rodrigor ");
		body.add("Quietooor por la gloria de mi madre apetecan pupita a gramenawer");
		body.add("Rodrigor te voy a borrar el cerito apetecan.");
		body.add("Jarl se calle ustée mamaar ahorarr va usté muy cargadoo quietooor ese que");
		body.add("arl se calle ustée mamaar ahorarr va usté muy cargadoo quietooor ese que");

		int numero = ThreadLocalRandom.current().nextInt(0, 9);
		return body.get(numero);
	}

}
