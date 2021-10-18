package Requerimiento2;

// Clase donde se redescribe toString()
public class Mail {
	private int id;
	private String addressee;
	private String sender;
	private String affair;
	private String bodyText;
	
	// no adjunto constructor porque el constructor están en los mismos métodos set()
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddressee() {
		return addressee;
	}


	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}


	public String getSender() {
		return sender;
	}


	public void setSender(String sender) {
		this.sender = sender;
	}


	public String getAffair() {
		return affair;
	}


	public void setAffair(String affair) {
		this.affair = affair;
	}


	public String getBodyText() {
		return bodyText;
	}


	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}


	@Override
	public String toString() {
		return "con id: " + id + " , con destinatario: " + addressee + " , conremitente: " + sender + " , y con asunto " + affair + " que dice: " + bodyText;
	}	

}