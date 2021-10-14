package correos;

// Clase Correo:
public class Correo {
	
	// Declaramos los atributos que componen un objeto "Correo":
	private String id;
	private String destinatario;
	private String remitente;
	private String asunto;
	private String cuerpoMensaje;
	
	// Constructor vacío:
	public Correo() {
		super();
	}

	//Constructor con los atributos:
	public Correo(String id, String destinatario, String remitente, String asunto, String cuerpoMensaje) {
		super();
		this.id = id;
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.asunto = asunto;
		this.cuerpoMensaje = cuerpoMensaje;
	}

	// Getters and Setters:
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getCuerpoMensaje() {
		return cuerpoMensaje;
	}

	public void setCuerpoMensaje(String cuerpoMensaje) {
		this.cuerpoMensaje = cuerpoMensaje;
	}

	// Método toString() sobreescrito que nos proporciona la información del correo:
	@Override
	public String toString() {
		return "Correo [id: " + id + " / Destinatario: " + destinatario + " / Remitente: " + remitente + " / Asunto: " + asunto + " / Mensaje: " + cuerpoMensaje + "]";
	}

	
	
	

}
