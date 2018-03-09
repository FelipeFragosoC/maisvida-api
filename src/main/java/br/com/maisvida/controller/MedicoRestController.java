package br.com.maisvida.controller;

import br.com.maisvida.entity.Medico;
import br.com.maisvida.exception.MaisVidaException;
import br.com.maisvida.exception.MedicoNotFoundException;
import br.com.maisvida.service.MedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/medico")
public class MedicoRestController {

    @Autowired
    private MedicoService medicoService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity listarTodos() {
        return ResponseEntity.ok(medicoService.listarTodos());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity carregarMedico(@Valid @PathVariable("id") Integer id) {
        return ResponseEntity.ok(medicoService.carregarMedico(id));
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity criarMedico(@Valid @RequestBody Medico medico) throws MaisVidaException {
        return ResponseEntity.ok(medicoService.criarMedico(medico));
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public ResponseEntity atualizarMedico(@Valid @RequestBody Medico medico) throws MedicoNotFoundException {
        return ResponseEntity.ok(medicoService.atualizarMedico(medico));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity deletarMedico(@Valid @PathVariable("id") Integer id) throws MedicoNotFoundException {
        medicoService.deletarMedico(id);
        return ResponseEntity.ok().build();
    }

}
