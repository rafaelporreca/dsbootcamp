package br.com.rafaelporreca.dsbootcamp.repositories;

import br.com.rafaelporreca.dsbootcamp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
