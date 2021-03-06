package tp.model.dao;

import tp.domain.Usuario;
import tp.util.db.exception.PersistenciaException;
import java.util.ArrayList;

public interface IUsuarioDAO {

    Long inserir(Usuario usuario) throws PersistenciaException;
    
    boolean atualizar(Usuario usuario) throws PersistenciaException;

    boolean delete(Usuario usuario) throws PersistenciaException;

    ArrayList<Usuario> listarTodos() throws PersistenciaException;

    Usuario consultarPorId(Long id) throws PersistenciaException;
    
    Usuario consultarPorEmailSenha(String nome, String senha) throws PersistenciaException;
}
