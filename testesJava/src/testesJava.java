import javax.swing.JOptionPane;

public class testesJava {

    public static void main(String[] args) {
        
        int[] numeros = new int[] {10,20,30, 100};
        int[] peso = new int[] {2,0,4};
        matematica matematica = new matematica();
                    
        for(int indice = 0;indice < 4;indice++){
    
            try{ //tentar
                
                matematica.dividir(numeros[indice], peso[indice]);
                System.out.println("Mensagem apos a excecao");

            }catch(ArithmeticException erro){ //capturar
                // Somente trata os erros de aritimetico de calculos matematicos
                
                JOptionPane.showMessageDialog(null, "Erro de calculo: " + erro.getMessage());
                //System.out.println("Erro de calculo: " + erro.getMessage());
            
                
            }catch(ArrayIndexOutOfBoundsException erro){
                //Trata os erros relacionados ao ultrapassar o tamanho do vetor
                System.out.println("Erro de vetor: " + erro.getMessage());

                //Para ver a classe do erro: erro.printStackTrace();
            }catch(Exception erro){
                System.out.println("A aplicacao deu erro! O sistema ira finalizar a sessao");
            }

        }
        System.out.println("Mensagem final.");
    }
}