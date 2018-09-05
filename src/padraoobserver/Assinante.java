/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author YanNotebook
 */
public class Assinante implements Observer{
/*ao comentar a revista, nos tiramos uma dependencia*/
//    private Observable revista;
    private int edicaoNovaRevista;
    private String nome;

    public int getEdicaoNovaRevista() {
        return edicaoNovaRevista;
    }

    public void setEdicaoNovaRevista(int edicaoNovaRevista) {
        this.edicaoNovaRevista = edicaoNovaRevista;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public Assinante(Observable revista){
//        this.revista = revista;
        revista.addObserver(this);
    }
    
    @Override
    public void update(Observable revistaSubject, Object o1) {
        if(revistaSubject instanceof Revista){
            Revista revista = (Revista) revistaSubject;
            edicaoNovaRevista = revista.getEdicao();
            System.out.println("Atenção"+getNome()+", já chegou mais uma edição"
            +"Esta e sua edição numero: "+edicaoNovaRevista);
        }
    
    
    }
    
}
