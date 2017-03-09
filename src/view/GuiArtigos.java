package view;

import java.util.Scanner;
import model.Artigos;

public class GuiArtigos {
	
	public GuiArtigos() {
		
	}
	
	public Artigos criarArtigo(){
		
		System.out.println("Introduza o nome do artigo");
		String nomeArtigo = new Scanner(System.in).nextLine();
		
		System.out.println("Introduza a quantidade de artigos");
		int quantidade = new Scanner(System.in).nextInt();
		
		System.out.println("Introduza a descrição do artigo");
		String descricao = new Scanner(System.in).nextLine();
		
		System.out.println("Introduza a condição do artigo");
		String condicao = new Scanner(System.in).nextLine();
		
		Artigos a = new Artigos(nomeArtigo, quantidade, descricao, condicao);
		a.setNomeArtigo(nomeArtigo);
		a.setQuantidade(quantidade);
		a.setDescricao(descricao);
		a.setCondicao(condicao);
		
		return a;
	}
	
	
	
}
