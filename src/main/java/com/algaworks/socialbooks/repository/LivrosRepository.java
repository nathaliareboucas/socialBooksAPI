package com.algaworks.socialbooks.repository;

//import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;

//import com.algaworks.socialbooks.domain.Comentario;
import com.algaworks.socialbooks.domain.Livro;

public interface LivrosRepository extends JpaRepository<Livro, Long>{
	
//	@Query(value = "select * from comentario", nativeQuery= true)
//	public Comentario findByData(Date data);

}