/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculoMB implements Serializable{
    private int numero1;
    private int numero2;
    private int resultado;
    private int operacao;
        
    public CalculoMB(){}

    public int getOperacao() {
        return operacao;
    }

    public void setOperacao(int operacao) {
        this.operacao = operacao;
    } 
    
    public int getNumero1() {
        return numero1;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }    
    
    
    public String operar(){
        if(operacao == 1)
            resultado = numero1 + numero2;
        else if(operacao == 2)
            resultado = numero1 - numero2;
        else if(operacao == 3)
            resultado = numero1 * numero2;
        else
            resultado = numero1 / numero2;
        return null;
    }
    
    /*public String somar(){
        
        return null;
    }
    
    public String subtrair(){
        this.resultado = numero1 - numero2;
        return null;
    }
    
    public String multiplicar(){
        this.resultado = numero1 * numero2;
        return null;
    }
    
    public String dividir(){
        this.resultado = numero1 / numero2;
        return null;
    }*/
    
    
}
