/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.proxy;


import tp.service.IManterUsuario;
import java.net.Socket;

/**
 *
 * @author pernambucanas
 */
public class TpSkeleton {
    private Socket socket;
    IManterUsuario manterusuario;
    
    
    public TpSkeleton(Socket socket) {
        this.socket = socket;
        //this.calc = new Calc();
    }
}
