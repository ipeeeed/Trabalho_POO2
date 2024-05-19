package br.com.uniderp.poo2.atacado.Controllers;

import java.util.List;
import br.com.uniderp.poo2.atacado.Entities.Produto;
import br.com.uniderp.poo2.atacado.Repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/atacado/produtos") // @RequestMapping(value = "/api/atacado/produtos")
public class ProdutoController {

    @Autowired
    private IProdutoRepository repo;

    @GetMapping
    public List<Produto> Listar() {
        List<Produto> lista = this.repo.findAll();
        return lista;
    }

    @GetMapping("/{id}") // @GetMapping(path = "/{id}")
    public Produto ObterPorId(@PathVariable Long id) {
        Produto instancia = this.repo.findById(id).get();
        return instancia;
    }

    @PostMapping()
    public Produto Incluir(@RequestBody Produto instancia) {
        Produto nova = this.repo.save(instancia);
        return nova;
    }
}
