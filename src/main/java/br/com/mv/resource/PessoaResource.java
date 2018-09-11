package br.com.mv.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mv.model.Pessoa;
import br.com.mv.repository.PessoaRepository;
import br.com.mv.service.PessoaService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("pessoa")
public class PessoaResource {

	@Autowired
	private PessoaRepository pessoaRepository;

	@Autowired
	private PessoaService pessoaService;

	@GetMapping
	public List<Pessoa> listar(){
		return pessoaRepository.findAll();
	}

	@PostMapping
	public Pessoa adicionar(@RequestBody Pessoa pessoa) {
		return pessoaService.adicionar(pessoa);
	}

	@DeleteMapping("/{id}")
	public void excluir(@PathVariable Long id) {
		pessoaRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Pessoa alterar(@PathVariable Long id, @RequestBody Pessoa pessoa) {
		return pessoaService.alterar(pessoa, id);
	}

}
