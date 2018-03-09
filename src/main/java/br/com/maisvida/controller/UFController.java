package br.com.maisvida.controller;

import br.com.maisvida.entity.Medico;
import br.com.maisvida.exception.MaisVidaException;
import br.com.maisvida.exception.MedicoNotFoundException;
import br.com.maisvida.service.MedicoService;
import br.com.maisvida.service.UFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/uf")
public class UFController {

    @Autowired
    private UFService ufService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity listarTodas() {
        return ResponseEntity.ok(ufService.listarTodas());
    }

    @RequestMapping(value = "/{id}/cidade", method = RequestMethod.GET)
    public ResponseEntity listarTodas(@Valid @PathVariable("id") Integer idUF) {
        return ResponseEntity.ok(ufService.listarTodasCidadesDaUF(idUF));
    }

}
