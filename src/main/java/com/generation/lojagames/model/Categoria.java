package com.generation.lojagames.model; 

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo classe é obrigatório e não pode conter espaços em branco")
	@Size(min = 01, max = 100, message = "O atributo classe deve conter no mínimo 01 e no máximo 100 caracteres...")
	private String classe;
	
	@NotBlank(message = "O atributo plataforma é obrigatório e não pode conter espaços em branco")
	@Size(min = 01, max = 100, message = "O atributo plataforma deve conter no mínimo 01 e no máximo 100 caracteres...")
	private String plataforma;
	
	@NotNull(message = "O atributo avaliação é obrigatório e não pode utilizar espaços em branco!")
	@Size(min = 01, max = 05, message = "O atributo plataforma deve conter no mínimo 01 e no máximo 05 caracteres...")
	private String avaliacao;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public String getPlataforma() {
		return plataforma;
	}
	
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public String getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	
	public List<Produto> getProduto(){
		return produto;
	}
	
	public void setProduto (List<Produto> produto) {
		this.produto = produto;
		
	}

}
