package br.com.maisvida.repository;

import br.com.maisvida.entity.Cidade;
import br.com.maisvida.entity.UF;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CidadeRepository extends Repository<Cidade, Long> {

    List<Cidade> findByUf_Id(Integer idUF);

}
