/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritor;

import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.showInputDialog;

/**
 *
 * @author Jon
 */
public class Escritor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = showInputDialog(null, "Nome para o Escritor","",PLAIN_MESSAGE);

       MsgEnviar msg = new MsgEnviar("Escritor: "+nome);
        msg.setVisible(true);
    }
    
}
