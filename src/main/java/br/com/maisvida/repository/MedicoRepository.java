package br.com.maisvida.repository;

import br.com.maisvida.entity.Medico;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface MedicoRepository extends Repository<Medico, Integer> {

    List<Medico> findAll();

    Medico findById(Integer id);

    Medico save(Medico medico);

    void deleteById(Integer id);

}
