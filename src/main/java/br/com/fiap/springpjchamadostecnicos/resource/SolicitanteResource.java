package br.com.fiap.springpjchamadostecnicos.resource;
import br.com.fiap.springpjchamadostecnicos.entity.Solicitante;
import br.com.fiap.springpjchamadostecnicos.repository.SolicitanteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/solicitante")
public class SolicitanteResource {


    @Autowired
    private SolicitanteRepository repo;

    @GetMapping
    public List<Solicitante> findAll() {
        return repo.findAll();
    }

    @GetMapping(value = "/{id}")
    public Solicitante findById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    @Transactional
    @PostMapping
    public Solicitante save(@RequestBody Solicitante solicitante) {
        return repo.save(solicitante);
    }
}


