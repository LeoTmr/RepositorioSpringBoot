package org.generation.blogPessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import org.generation.blogPessoal.model.Postagens;

@Repository
@Transactional(readOnly = true)
public interface PostagemRepository extends JpaRepository<Postagens, Long> {

	public List <Postagens> findAllByTituloContainingIgnoreCase(String titulo);
	
	@Query(value = "select count(tema_id) from tb_postagens where tema_id = :id", nativeQuery = true)
	public int countPosts2(@Param("id") long id);

}