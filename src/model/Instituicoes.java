package model;

public class Instituicoes {

	private int idUser;
	private String nomeUser;
	private String localidade;
	private String contacto;
	
	public Instituicoes(int idUser, String nomeUser, String localidade, String contacto) {
		super();
		this.idUser = idUser;
		this.nomeUser = nomeUser;
		this.localidade = localidade;
		this.contacto = contacto;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	
	
	
}
