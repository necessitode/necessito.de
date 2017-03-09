package model;

public class Artigos {
	
	private String nomeArtigo;
	private int quantidade;
	private String descricao;
	private String condicao;
	
	public Artigos(String nomeArtigo, int quantidade, String descricao, String condicao) {
		super();
		this.nomeArtigo = nomeArtigo;
		this.quantidade = quantidade;
		this.descricao = descricao;
		this.condicao = condicao;
	}

	public String getNomeArtigo() {
		return nomeArtigo;
	}

	public void setNomeArtigo(String nomeArtigo) {
		this.nomeArtigo = nomeArtigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCondicao() {
		return condicao;
	}

	public void setCondicao(String condicao) {
		this.condicao = condicao;
	}
	
	
	
}
