package view;

import controller.GereArtigos;
import controller.GereCategorias;
import controller.GereInstituicoes;
import model.Artigos;
import model.Categorias;
import model.Instituicoes;

public class PainelControlo {

		GuiArtigos guiArt;
		GereArtigos gereArt;
		GuiCategorias guiCat;
		GereCategorias gereCat;
		GuiInstituicoes guiInst;
		GereInstituicoes gereInst;
	
		public PainelControlo(){
			
			//Artigos
			guiArt = new GuiArtigos();
			gereArt = new GereArtigos();		
			Artigos a = guiArt.criarArtigo();
			gereArt.addArtigo(a);	
			
			
			//Categorias
			guiCat = new GuiCategorias();
			gereCat = new GereCategorias();
			Categorias c = guiCat.criarCategorias();
			gereCat.addCategoria(c);
			
			//Instituicoes
			guiInst = new GuiInstituicoes();
			gereInst = new GereInstituicoes();
			Instituicoes i = guiInst.criarInstituicao();
			gereInst.addInstituicao(i);
			
	}

}
