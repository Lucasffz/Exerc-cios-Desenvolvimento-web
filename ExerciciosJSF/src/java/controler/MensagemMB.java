
package controler;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



@ManagedBean
@RequestScoped
public class MensagemMB implements  Serializable {
    String mensagem;
    
    
    public MensagemMB(){}

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
   public String enviarMensagem(){
       return "pagina2E1";
   }
    
    
    
}
