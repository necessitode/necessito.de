package controller;

import java.util.ArrayList;
import model.Artigos;

public class GereArtigos {
	ArrayList<Artigos> arArtigos;
	
	//constructor
	public GereArtigos(){
		arArtigos = new ArrayList<Artigos>();
	}
	
	public void addArtigo(Artigos art){
		arArtigos.add(art); 	
	}
	
}
