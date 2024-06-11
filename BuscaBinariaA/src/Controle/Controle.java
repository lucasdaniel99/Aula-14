package Controle;

import java.util.Arrays;

import Modelo.Modelo;
import View.View;

public class Controle {
	private Modelo model;
    private View view;

    public Controle(Modelo model, View view) {
        this.model = model;
        this.view = view;
    }
        public void run() {
            int[] array = view.getUserInput();
            Arrays.sort(array);
            model.setArray(array);
            view.displayArray(array);

            int elemento = view.getElementToSearch();
            int resultado = model.buscaBinaria(elemento);
            view.displaySearchResult(elemento, resultado);
    
        }
	public static void main(String[] args) {
		 Modelo model = new Modelo();
	        View view = new View();
	        Controle controler = new Controle(model, view);
	        controler.run();
	    }

	}


