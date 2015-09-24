/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.model.service.impl;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import tp.domain.Fornecedor;

/**
 *
 * @author LucasCésar
 */
public class ManterFornecedorTest {
    
    public ManterFornecedorTest() {
    }

    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        Fornecedor fornecedor = null;
        fornecedor.setRazaoSocial("Lucao S_A");
        fornecedor.setNome("Lucao");
        
        ManterFornecedor instance = new ManterFornecedor();
        Long expResult = null;
        Long result = instance.cadastrar(fornecedor);
        
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
//
//    @Test
//    public void testAlterar() throws Exception {
//        System.out.println("alterar");
//        
//        Fornecedor fornecedor = null;
//        
//        ManterFornecedor instance = new ManterFornecedor();
//        
//        boolean expResult = false;
//        boolean result = instance.alterar(fornecedor);
//        
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testExcluir() throws Exception {
//        System.out.println("excluir");
//        Fornecedor fornecedor = null;
//        ManterFornecedor instance = new ManterFornecedor();
//        boolean expResult = false;
//        boolean result = instance.excluir(fornecedor);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testListarTodos() throws Exception {
//        System.out.println("listarTodos");
//        ManterFornecedor instance = new ManterFornecedor();
//        List<Fornecedor> expResult = null;
//        List<Fornecedor> result = instance.listarTodos();
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//
//    @Test
//    public void testPesquisarPorId() throws Exception {
//        System.out.println("pesquisarPorId");
//        Long id = null;
//        ManterFornecedor instance = new ManterFornecedor();
//        Fornecedor expResult = null;
//        Fornecedor result = instance.pesquisarPorId(id);
//        assertEquals(expResult, result);
//        fail("The test case is a prototype.");
//    }
//    
}
