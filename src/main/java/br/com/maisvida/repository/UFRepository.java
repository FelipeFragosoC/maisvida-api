package br.com.maisvida.repository;

import br.com.maisvida.entity.UF;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface UFRepository extends Repository<UF, Long> {

    List<UF> findAll();

    Object findAllBy();
}
