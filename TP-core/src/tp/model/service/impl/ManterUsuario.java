package tp.model.service.impl;

import tp.model.dao.IUsuarioDAO;
import tp.model.dao.impl.UsuarioDAO;
import tp.domain.Usuario;
import tp.service.IManterUsuario;
import tp.util.db.exception.NegocioException;
import tp.util.db.exception.PersistenciaException;
import java.util.List;
import tp.util.CPF;

public class ManterUsuario implements IManterUsuario {

    private IUsuarioDAO usuarioDAO;
    
    public ManterUsuario() {
        usuarioDAO = new UsuarioDAO();
    }
    
    @Override
    public Long cadastrar(Usuario usuario) throws PersistenciaException, NegocioException {
        
        if((usuario.getNome() == null) || (usuario.getNome().isEmpty()))
            throw new NegocioException("O campo 'Nome' é obrigarório.");
        
        if((usuario.getCpf()== null) || (usuario.getCpf().isEmpty()))
            throw new NegocioException("O campo 'CPF' é obrigarório.");
        
        if(!CPF.ehValido(usuario.getCpf()))
            throw new NegocioException("O número do CPF informado não é válido.");
        
        if((usuario.getSenha() == null) || (usuario.getSenha().isEmpty()))
            throw new NegocioException("Os campos 'Senha' e 'Confirmar senha' são obrigarórios.");
        
        if((usuario.getEmail() == null) || (usuario.getEmail().isEmpty()))
            throw new NegocioException("O campo 'Email' é obrigarório.");
        
        if((usuario.getDataNasc() == null) )
            throw new NegocioException("O campo 'Data de nascimento' é obrigarório.");
        
        if((usuario.getTel() == null) || (usuario.getTel().isEmpty()))
            throw new NegocioException("O campo 'Telefone' é obrigarório.");
        
        
      
        
        if((usuario.getCep() == null) || (usuario.getCep().isEmpty()))
            throw new NegocioException("O campo 'CEP' é obrigarório.");
        
        if((usuario.getEndereco() == null) || (usuario.getEndereco().isEmpty()))
            throw new NegocioException("O campo 'Endereço' é obrigarório.");
        
        if((usuario.getTipoEndereco() == null) || (usuario.getTipoEndereco().isEmpty()))
            throw new NegocioException("O campo 'Tipo de Endereço' é obrigarório.");
        
        if((usuario.getNumero() == null) )
            throw new NegocioException("O campo 'Numero' é obrigarório.");
        
        if((usuario.getComplemento() == null) || (usuario.getComplemento().isEmpty()))
            throw new NegocioException("O campo 'Complemento' é obrigarório.");
        
        if((usuario.getBairro() == null) || (usuario.getBairro().isEmpty()))
            throw new NegocioException("O campo 'Bairro' é obrigarório.");
        
        if((usuario.getCidade() == null) || (usuario.getCidade().isEmpty()))
            throw new NegocioException("O campo 'Cidade' é obrigarório.");
        
        if((usuario.getEstado() == null) || (usuario.getEstado().isEmpty()))
            throw new NegocioException("O campo 'Estado' é obrigarório.");
        
      
        Long result = usuarioDAO.inserir(usuario);
        return result;
    }

    @Override
    public boolean alterar(Usuario usuario) throws PersistenciaException, NegocioException {
        
        if((usuario.getNome() == null) || (usuario.getNome().isEmpty()))
            throw new NegocioException("Obrigatório informar o nome.");
        
        if((usuario.getCpf()== null) || (usuario.getCpf().isEmpty()))
            throw new NegocioException("O campo 'CPF' é obrigarório.");
        
        if(!CPF.ehValido(usuario.getCpf()))
            throw new NegocioException("O número do CPF informado não é válido.");
        
        if((usuario.getSenha() == null) || (usuario.getSenha().isEmpty()))
            throw new NegocioException("Os campos 'Senha' e 'Confirmar senha' são obrigarórios.");
        
        if((usuario.getEmail() == null) || (usuario.getEmail().isEmpty()))
            throw new NegocioException("O campo 'Email' é obrigarório.");
        
        if((usuario.getTipoEndereco() == null) || (usuario.getTipoEndereco().isEmpty()))
            throw new NegocioException("O campo 'Tipo de Endereço' é obrigarório.");
        
        if((usuario.getDataNasc() == null) )
            throw new NegocioException("O campo 'Data de nascimento' é obrigarório.");
        
        if((usuario.getTel() == null) || (usuario.getTel().isEmpty()))
            throw new NegocioException("O campo 'Telefone' é obrigarório.");
        
        if((usuario.getCep() == null) || (usuario.getCep().isEmpty()))
            throw new NegocioException("O campo 'CEP' é obrigarório.");
        
        if((usuario.getEndereco() == null) || (usuario.getEndereco().isEmpty()))
            throw new NegocioException("O campo 'Endereço' é obrigarório.");
        
        if((usuario.getNumero() == null) )
            throw new NegocioException("O campo 'Numero' é obrigarório.");
        
        if((usuario.getComplemento() == null) || (usuario.getComplemento().isEmpty()))
            throw new NegocioException("O campo 'Complemento' é obrigarório.");
        
        if((usuario.getBairro() == null) || (usuario.getBairro().isEmpty()))
            throw new NegocioException("O campo 'Bairro' é obrigarório.");
        
        if((usuario.getCidade() == null) || (usuario.getCidade().isEmpty()))
            throw new NegocioException("O campo 'Cidade' é obrigarório.");
        
        if((usuario.getEstado() == null) || (usuario.getEstado().isEmpty()))
            throw new NegocioException("O campo 'Estado' é obrigarório.");
                  
        boolean result = usuarioDAO.atualizar(usuario);
        return result;
    }

    @Override
    public boolean excluir(Usuario usuario) throws PersistenciaException, NegocioException {
        
        boolean result = usuarioDAO.delete(usuario);
        return result;       
    }

    @Override
    public List<Usuario> pesquisarTodos() throws PersistenciaException {
        List<Usuario> result = usuarioDAO.listarTodos();
        return result;
    }

    @Override
    public Usuario pesquisarPorId(Long id) throws PersistenciaException {
        Usuario result = usuarioDAO.consultarPorId(id);
        return result;       
    }    

    @Override
    public Usuario getUserLogin(String email, String senha) throws PersistenciaException, NegocioException {
        Usuario result = usuarioDAO.consultarPorEmailSenha(email, senha);
        return result;               
    }
    
    @Override
    public List<Usuario> listarTodos() throws PersistenciaException {
        List<Usuario> result = usuarioDAO.listarTodos();
        return result;
    }
    
}
