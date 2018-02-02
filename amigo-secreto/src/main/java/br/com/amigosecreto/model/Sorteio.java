package br.com.amigosecreto.model;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sorteio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;
	private String nome;
	
	//Usa o Set<> pq nao pode ter nenhum pares repetido
	//A classe sorteio é a entidade forte, nesse caso define um mappedBy que significa que o relaionamento ja 
	//foi mapeado e recebe o nome do atributo que representa o lado forte.
	@OneToMany(mappedBy="sorteio")
	private Set<Par> pares = new LinkedHashSet<>();
	
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Set<Par> getPares() {
		return Collections.unmodifiableSet(pares);//significa que ninguem mais pode mexer na coleção
	}
	public void setPares(Set<Par> pares) {
		this.pares = pares;
	}

	public void dicionaPar(Par par){
		this.getPares().add(par);
	}
	
}
