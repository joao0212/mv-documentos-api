package br.com.mv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mv.model.Documentos;

@Repository
public interface DocumentoRepository extends JpaRepository<Documentos, Long>{

}
