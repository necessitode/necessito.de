package controller;

import java.util.ArrayList;

import model.Categorias;

public class GereCategorias {
	ArrayList<Categorias> arCategorias;
	
	//constructor
	public GereCategorias(){
		arCategorias = new ArrayList<Categorias>();
	}
	
	public void addCategoria(Categorias cat){
		arCategorias.add(cat); 	
	}
	
}
