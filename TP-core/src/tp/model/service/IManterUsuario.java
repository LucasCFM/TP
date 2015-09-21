package tp.model.service;

import tp.model.domain.Usuario;
import tp.util.db.exception.NegocioException;
import tp.util.db.exception.PersistenciaException;
import java.util.List;

public interface IManterUsuario {
    public Long cadastrar(Usuario usuario) throws PersistenciaException, NegocioException;
    public boolean alterar(Usuario usuario) throws PersistenciaException, NegocioException;
    public boolean excluir(Usuario usuario) throws PersistenciaException, NegocioException;
    public List<Usuario> pesquisarTodos() throws PersistenciaException;
    public Usuario pesquisarPorId(Long id) throws PersistenciaException;
    public Usuario getUserLogin(String email, String senha) throws PersistenciaException, NegocioException;
    public List<Usuario> listarTodos() throws PersistenciaException;
}
