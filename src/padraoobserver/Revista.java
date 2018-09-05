/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoobserver;

import java.util.Observable;

/**
 *
 * @author YanNotebook
 */
public class Revista extends Observable{
    private int edicao;


    public void setEdicao(int edicao) {
        this.edicao = edicao;
        setChanged();
        notifyObservers();
    }
    public int getEdicao() {
        return edicao;
    }
    
    
}
