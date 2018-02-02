package br.com.amigosecreto.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.amigosecreto.model.Participante;
import br.com.amigosecreto.service.ParticipanteService;

@Named
@RequestScoped //participante esta no escopo da requisição
//@ManagedBean
public class ParticipanteBean implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Inject		
	private ParticipanteService participanteService;

	private Participante participante = new Participante();

	public void cadastrar(){
		participanteService.cadastrar(participante);
		System.out.println("Participante Cadastrado con sucesso!");
	}
	
	public Participante getParticipante() {
		return participante;
	}

	public void setParticipante(Participante participante) {
		this.participante = participante;
	}
	
}
