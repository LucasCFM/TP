package tp.model.dao;


import tp.util.db.exception.PersistenciaException;
import java.util.ArrayList;
import tp.domain.Fornecedor;

public interface IFornecedorDAO {

    Long inserir(Fornecedor fornecedor) throws PersistenciaException;

    boolean atualizar(Fornecedor fornecedor) throws PersistenciaException;

    boolean delete(Fornecedor fornecedor) throws PersistenciaException;

    ArrayList<Fornecedor> listarTodos() throws PersistenciaException;

    Fornecedor consultarPorId(Long id) throws PersistenciaException;
}
