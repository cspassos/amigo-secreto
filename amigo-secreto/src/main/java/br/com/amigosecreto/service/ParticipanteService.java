package br.com.amigosecreto.service;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import br.com.amigosecreto.dao.ParticipanteDao;
import br.com.amigosecreto.model.Participante;

@Stateless
@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
public class ParticipanteService {

	@Inject
	ParticipanteDao participanteDao;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void cadastrar(Participante participante) {
		participanteDao.salvar(participante);
		
	}
	
	
}
