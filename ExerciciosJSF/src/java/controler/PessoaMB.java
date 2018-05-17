/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import model.Pessoa;
@ManagedBean
@RequestScoped
public class PessoaMB implements Serializable {
    Pessoa pessoa = new Pessoa();

    public PessoaMB(){
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public String mostrarPessoa(){
        return "pagina2E3";
    }
    
    
    
}
