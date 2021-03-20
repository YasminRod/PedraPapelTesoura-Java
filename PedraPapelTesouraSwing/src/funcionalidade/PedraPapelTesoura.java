package funcionalidade;
import gui.TelaJogo;
/**
 *
 * @author Yasmin
 */
public class PedraPapelTesoura {
    
    String resultado = "";
    String erro = "";
    
    public void logicaPedraPapelTesoura(int j1, int j2){
        
        String result = "";
        String error = "";
        
        switch (j1){
            case 1:
                switch (j2){
                    case 1:
                        result = "EMPATE";
                        break;
                    case 2:
                        result = "JOGADOR 2 VENCEU! PARABÉNS";
                        break;
                    case 3:
                        result = "JOGADOR 1 VENCEU! PARABÉNS";
                        break;
                    default:
                        error = "JOGA DIREITO PÔ";
                }
                break;
            case 2:
                switch (j2){
                    case 1:
                        result = "JOGADOR 1 VENCEU! PARABÉNS";
                        break;
                    case 2:
                        result = "EMPATE";
                        break;
                    case 3:
                        result = "JOGADOR 2 VENCEU! PARABÉNS";
                        break;
                    default:
                        error = "JOGA DIREITO PÔ";
                }
                break;
            case 3:
                switch (j2){
                    case 1:
                        result = "JOGADOR 2 VENCEU! PARABÉNS";
                        break;
                    case 2:
                        result = "JOGADOR 1 VENCEU! PARABÉNS";
                        break;
                    case 3:
                        result = "EMPATE";
                        break;
                    default:
                        error = "JOGA DIREITO PÔ";
                }
                break;
            default:
                error = "JOGA DIREITO PÔ";
        }
        resultado = result;
        erro = error;
    } 
    
    
    
    public String getResultado(){
        return resultado;
    }
    public String getErro(){
        return erro;
    }
    
}
