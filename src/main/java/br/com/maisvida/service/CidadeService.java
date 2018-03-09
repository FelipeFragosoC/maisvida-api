package br.com.maisvida.service;

import br.com.maisvida.entity.Cidade;
import br.com.maisvida.entity.UF;
import br.com.maisvida.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> listarPorUF(Integer idUF) {
        return cidadeRepository.findByUf_Id(idUF);
    }

}
