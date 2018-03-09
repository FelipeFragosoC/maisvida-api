package br.com.maisvida.service;

import br.com.maisvida.entity.Cidade;
import br.com.maisvida.entity.UF;
import br.com.maisvida.repository.CidadeRepository;
import br.com.maisvida.repository.UFRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UFService {

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private UFRepository ufRepository;

    public List<UF> listarTodas() {
        return ufRepository.findAll();
    }

    public List<Cidade> listarTodasCidadesDaUF(Integer idUF) {
        return cidadeRepository.findByUf_Id(idUF);
    }

}
