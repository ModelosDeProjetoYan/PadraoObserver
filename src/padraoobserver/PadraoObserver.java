/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

/**
 *
 * @author YanNotebook
 */
public class PadraoObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Revista revista = new Revista();
        Assinante a1 = new Assinante(revista);
        a1.setNome(" yan");
        Assinante a2 = new Assinante(revista);
        a2.setNome(" Aline");
        revista.setEdicao(3);
    
    }
    
}
