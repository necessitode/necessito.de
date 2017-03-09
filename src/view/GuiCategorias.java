package view;

import java.util.Scanner;

import model.Categorias;

public class GuiCategorias {

	
	public GuiCategorias() {
		
	}
	
	public Categorias criarCategorias(){
		
		System.out.println("Introduza o nome da categoria");
		String nomeCategoria = new Scanner(System.in).nextLine();
		
		
		Categorias c = new Categorias(nomeCategoria);
		c.setNomeCategoria(nomeCategoria);
		
		return c;
	}
	
	
	
}
