package tp.service;

import tp.util.db.exception.NegocioException;
import tp.util.db.exception.PersistenciaException;
import java.util.List;
import tp.domain.Fornecedor;

public interface IManterFornecedor {
    public Long cadastrar(Fornecedor fornecedor) throws PersistenciaException, NegocioException;
    public boolean alterar(Fornecedor fornecedor) throws PersistenciaException, NegocioException;
    public boolean excluir(Fornecedor fornecedor) throws PersistenciaException, NegocioException;
    public List<Fornecedor> listarTodos() throws PersistenciaException;
    public Fornecedor pesquisarPorId(Long id) throws PersistenciaException;
}
