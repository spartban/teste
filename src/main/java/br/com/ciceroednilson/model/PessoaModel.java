package br.com.ciceroednilson.model;
 
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Table(name="tb_pessoa")
@Entity
public class PessoaModel {
 
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id_pessoa")
	private Integer id;
 
	@Column(name="ds_nome")
	private String  nome;
 
	@Column(name="fl_ativo", columnDefinition="BIT")
	private boolean ativo;
	
//	@Column
//	//@Column(name="findOne")
	//public PessoaModel findOne;
	

	public Integer getId_pessoa() {
		return id;
	}

	public void setId_pessoa(Integer id_pessoa) {
		this.id = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

//	public PessoaModel getFindOne() {
//		return findOne;
//	}
//
//	public void setFindOne(PessoaModel findOne) {
//		this.findOne = findOne;
//	}
 
	
	
	
 
}
