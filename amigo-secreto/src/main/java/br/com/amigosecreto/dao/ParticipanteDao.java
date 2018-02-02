package br.com.amigosecreto.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.amigosecreto.model.Participante;

public class ParticipanteDao {

	@PersistenceContext(unitName="amigoSecretoPU")														    
	EntityManager manager;
	
	public void salvar(Participante participante) {
		manager.persist(participante);
	}

}
