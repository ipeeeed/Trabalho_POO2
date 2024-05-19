package br.com.uniderp.poo2.atacado.Controllers;

import java.util.List;
import br.com.uniderp.poo2.atacado.Entities.Classe;
import br.com.uniderp.poo2.atacado.Repository.IClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/atacado/classes") // @RequestMapping(value = "/api/atacado/classes")
public class ClasseController {

    @Autowired
    private IClasseRepository repo;

    @GetMapping
    public List<Classe> Listar() {
        List<Classe> lista = this.repo.findAll();
        return lista;
    }

    @GetMapping("/{id}") // @GetMapping(path = "/{id}")
    public Classe ObterPorId(@PathVariable Long id) {
        Classe instancia = this.repo.findById(id).get();
        return instancia;
    }

    @PostMapping()
    public Classe Incluir(@RequestBody Classe instancia) {
        Classe nova = this.repo.save(instancia);
        return nova;
    }
}