package br.com.maisvida.service;

import br.com.maisvida.entity.Medico;
import br.com.maisvida.exception.MaisVidaException;
import br.com.maisvida.exception.MedicoNotFoundException;
import br.com.maisvida.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.MethodArgumentNotValidException;

import java.util.List;

@Service
public class MedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    public List<Medico> listarTodos() {
        return medicoRepository.findAll();
    }

    public Medico carregarMedico(Integer id) {
        return medicoRepository.findById(id);
    }

    @Transactional
    public Medico criarMedico(Medico medico) throws MaisVidaException {
        if(medico.getId() != null) {
            throw new MaisVidaException("Não é permitido preencher o campo 'id', pois o mesmo é gerado de forma automática.");
        }
        return medicoRepository.save(medico);
    }

    @Transactional
    public Medico atualizarMedico(Medico medico) throws MedicoNotFoundException {
        Medico medicoExistente = carregarMedico(medico.getId());
        if(medicoExistente == null) {
            throw new MedicoNotFoundException("Não foi encontrado um médico com o id '" + medico.getId() +"'." );
        }
        medicoExistente.setEspecialidade(medico.getEspecialidade());
        medicoExistente.setCidade(medico.getCidade());
        medicoExistente.setPrimeiroNome(medico.getPrimeiroNome());
        medicoExistente.setUltimoNome(medico.getUltimoNome());
        medicoExistente.setEmail(medico.getEmail());
        medicoExistente.setAtivo(medico.getAtivo());
        medicoExistente.setStatus(medico.getStatus());
        return medicoExistente;
    }

    @Transactional
    public void deletarMedico(Integer id) throws MedicoNotFoundException {
        Medico medicoExistente = carregarMedico(id);
        if(medicoExistente == null) {
            throw new MedicoNotFoundException("Não foi encontrado um médico com o id '" + id +"'." );
        }
        medicoRepository.deleteById(id);
    }

}
