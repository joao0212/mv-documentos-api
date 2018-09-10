package br.com.mv.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mv.model.Estado;
import br.com.mv.model.Pessoa;
import br.com.mv.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa adicionar(Pessoa pessoa) {
		pessoa.setNome(pessoa.getNome());
		Estado estado = new Estado();
		estado.setUf(pessoa.getEstado().getUf());
		estado.setNome(pessoa.getEstado().getNome());
		pessoa.setEstado(estado);
		estado.setPessoa(pessoa);
		pessoa.getDocumentos().forEach(i -> {
			i.setNumero(i.getNumero());
			i.setTipo(i.getTipo());
			i.setPessoa(pessoa);
		});
		return pessoaRepository.save(pessoa);
	}

	public Pessoa alterar(Pessoa pessoa) {
		Pessoa pessoaSalva = pessoaRepository.findById(pessoa.getId()).get();
		BeanUtils.copyProperties(pessoa, pessoaSalva, "id");
		return pessoaRepository.save(pessoa);
	}
}
