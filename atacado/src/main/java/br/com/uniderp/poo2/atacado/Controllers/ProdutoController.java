package br.com.uniderp.poo2.atacado.Controllers;

import java.util.List;
import br.com.uniderp.poo2.atacado.Entities.Produto;
import br.com.uniderp.poo2.atacado.Repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


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

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Produto Incluir(@RequestBody Produto instancia) {
        Produto nova = this.repo.save(instancia);
        return nova;
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Produto Alterar(@RequestBody Produto instancia) {
        Produto alterada = this.repo.save(instancia);
        return alterada;
    }

    @DeleteMapping("/{id}")
    public Produto ExcluirPorId(@PathVariable Long id) {
        Produto paraExcluir = this.repo.findById(id).get();
        this.repo.delete(paraExcluir);
        return paraExcluir;
    }

    @DeleteMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Produto ExcluirPorInstancia(@RequestBody Produto instancia) {
        return this.ExcluirPorId(instancia.getCodigo());
    }
}
