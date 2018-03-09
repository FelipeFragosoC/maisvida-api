package br.com.maisvida.controller;

import br.com.maisvida.service.EspecialidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/especialidade")
public class EspecialidadeController {

    @Autowired
    private EspecialidadeService especialidadeService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity listarTodas() {
        return ResponseEntity.ok(especialidadeService.listarTodas());
    }

}
