package one.digitalInovation.gof.service;

import one.digitalInovation.gof.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;


public interface ClienteService {

    Iterable<Cliente> buscarTodos();
    @Autowired
    Cliente buscarporId(long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente ciente);
    void deletar(long id);
}
