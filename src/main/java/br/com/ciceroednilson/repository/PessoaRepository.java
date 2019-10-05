package br.com.ciceroednilson.repository;
 
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import br.com.ciceroednilson.model.PessoaModel;
 
public interface PessoaRepository extends CrudRepository<PessoaModel, Integer> {
 
	@CrossOrigin(origins = "http://localhost:8090")
	PessoaModel save(PessoaModel pessoa);
 
	void deleteById(Optional<PessoaModel> pessoaModel);
 
	List<PessoaModel> findAll();
 	
	Optional<PessoaModel> findById(Integer id_pessoa);
}
