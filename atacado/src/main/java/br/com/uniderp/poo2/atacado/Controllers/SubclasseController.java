package br.com.uniderp.poo2.atacado.Controllers;

import java.util.List;
import br.com.uniderp.poo2.atacado.Entities.Subclasse;
import br.com.uniderp.poo2.atacado.Repository.ISubclasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/api/atacado/subclasses") // @RequestMapping(value = "/api/atacado/subclasses")
public class SubclasseController {

    @Autowired
    private ISubclasseRepository repo;

    @GetMapping
    public List<Subclasse> Listar() {
        List<Subclasse> lista = this.repo.findAll();
        return lista;
    }

    @GetMapping("/{id}") // @GetMapping(path = "/{id}")
    public Subclasse ObterPorId(@PathVariable Long id) {
        Subclasse instancia = this.repo.findById(id).get();
        return instancia;
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Subclasse Incluir(@RequestBody Subclasse instancia) {
        Subclasse nova = this.repo.save(instancia);
        return nova;
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Subclasse Alterar(@RequestBody Subclasse instancia) {
        Subclasse alterada = this.repo.save(instancia);
        return alterada;
    }

    @DeleteMapping("/{id}")
    public Subclasse ExcluirPorId(@PathVariable Long id) {
        Subclasse paraExcluir = this.repo.findById(id).get();
        this.repo.delete(paraExcluir);
        return paraExcluir;
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Subclasse ExcluirPorInstancia(@RequestBody Subclasse instancia) {
        return this.ExcluirPorId(instancia.getCodigo());
    }
}
