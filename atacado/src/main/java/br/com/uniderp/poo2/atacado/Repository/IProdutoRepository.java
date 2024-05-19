package br.com.uniderp.poo2.atacado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.uniderp.poo2.atacado.Entities.Produto;

@Repository
public interface IProdutoRepository extends JpaRepository<Produto, Long> {}
