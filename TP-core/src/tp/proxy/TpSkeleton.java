/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.proxy;

import java.net.Socket;

/**
 *
 * @author pernambucanas
 */
public class TpSkeleton {
    private Socket socket;
    
    public TpSkeleton(Socket socket) {
        this.socket = socket;
        //this.calc = new Calc();
    }
}
