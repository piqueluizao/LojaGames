package com.generation.lojagames.repository;

import java.math.BigDecimal;
import java.util.List;

import com.generation.lojagames.model.Produto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List <Produto> findAllByNomeContainingIgnoreCase (@Param("nome")String nome);
	public List<Produto>findByPreco(BigDecimal preco);
	public List<Produto>findAllByDesenvolvedoresContainingIgnoreCase(@Param("desenvolvedores")String desenvolvedores);
	public List<Produto>findByPrecoGreaterThanEqual(BigDecimal preco);
	public List<Produto>findByPrecoLessThanEqual(BigDecimal preco);
	public List<Produto>findByPrecoBetween(BigDecimal preco1, BigDecimal preco2);
	

}
