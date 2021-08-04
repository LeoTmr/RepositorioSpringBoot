package org.farmacia.repository;

import java.util.List;

import org.farmacia.model.produtos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface produtosRepository extends JpaRepository<produtos, Long> {
	public List<produtos> findAllByNomeContainingIgnoreCase (String nome);
}
