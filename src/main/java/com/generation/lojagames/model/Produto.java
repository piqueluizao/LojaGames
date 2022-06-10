package com.generation.lojagames.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome é obrigatório e não pode conter espaços em branco")
	@Size(min = 01, max = 100, message = "O atributo nome deve conter no mínimo 5 e no máximo 100 caracteres...")
	private String nome;
	
	@NotNull(message = "O atributo preço é obrigatório e não pode conter espaços em branco")
	private BigDecimal preco;

	@NotBlank(message = "O atributo avaliação é obrigatório e não pode utilizar espaços em branco!")
	@Size(min = 05, max = 500, message = "O atributo plataforma deve conter no mínimo 05 e no máximo 500 caracteres...")
	private String descricao;
	
	@NotBlank(message = "O atributo desenvolvedores é obrigatório e não pode conter espaços em branco")
	@Size(min = 05, max = 200, message = "O atributo desenvolvedores deve conter no mínimo 05 e no máximo 200 caracteres...")
	private String desenvolvedores;
	
	@NotBlank(message = "O atributo foto é obrigatório e não pode conter espaços em branco")
	@Size(min = 05, max = 1000, message = "O atributo foto deve conter no mínimo 5 e no máximo 1000 caracteres...")
	private String foto;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Usuario usuario;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDesenvolvedores() {
		return desenvolvedores;
	}
	
	public void setDesenvolvedores(String desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}
	
	public String getFoto() {
		return foto;
	}
	
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;

	}
}
