package br.com.maisvida.controller;

import br.com.maisvida.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity listarTodos(Integer idUF) {
        return ResponseEntity.ok(cidadeService.listarPorUF(idUF));
    }


}
