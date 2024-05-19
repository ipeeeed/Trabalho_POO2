package br.com.uniderp.poo2.atacado.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.uniderp.poo2.atacado.Entities.Subclasse;

@Repository
public interface ISubclasseRepository extends JpaRepository<Subclasse, Long> {}
