package br.com.maisvida.repository;

import br.com.maisvida.entity.Especialidade;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EspecialidadeRepository extends Repository<Especialidade, Long> {

    List<Especialidade> findAll();

}
