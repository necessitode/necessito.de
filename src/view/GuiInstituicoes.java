package view;

import java.util.Scanner;

import model.Instituicoes;

public class GuiInstituicoes {

	public GuiInstituicoes() {
		
	}

	public Instituicoes criarInstituicao(){
		
		System.out.println("Introduza o id do user");
		int idUser = new Scanner(System.in).nextInt();
		
		System.out.println("Introduza o nome do user");
		String nomeUser = new Scanner(System.in).nextLine();
		
		System.out.println("Introduza a localidade");
		String localidade = new Scanner(System.in).nextLine();
		
		System.out.println("Introduza o contacto");
		String contacto = new Scanner(System.in).nextLine();
		
		Instituicoes i = new Instituicoes();
		i.setIdUser(idUser);
		i.setNomeUser(nomeUser);
		i.setLocalidade(localidade);
		i.setContacto(contacto);
		
		return i;
	}
	
}
