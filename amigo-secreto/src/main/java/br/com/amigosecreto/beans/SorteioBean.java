package br.com.amigosecreto.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.amigosecreto.model.Sorteio;

@Named
@RequestScoped
public class SorteioBean {

	private Sorteio sorteio = new Sorteio();

	public void sortear() {
		System.out.println("Sorteio: " + sorteio.getNome());
		System.out.println("Cachorro doido...");
	}

	public Sorteio getSorteio() {
		return sorteio;
	}

	public void setSorteio(Sorteio sorteio) {
		this.sorteio = sorteio;
	}
}
