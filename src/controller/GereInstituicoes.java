package controller;

import java.util.ArrayList;

import model.Artigos;
import model.Instituicoes;

public class GereInstituicoes {
	ArrayList<Instituicoes> arInstituicoes;
	
	//constructor
	public GereInstituicoes (){
		arInstituicoes = new ArrayList<Instituicoes>();
	}
	
	public void addInstituicao(Instituicoes inst){
		arInstituicoes.add(inst); 	
	}
	
}
