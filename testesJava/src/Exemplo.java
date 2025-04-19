public class Exemplo {
    public static void main(String[] args) {
        try {

            System.out.println("Mensagem antes da excecao!");
         //   int resultado = 10/0;
            System.out.println("Mensagem apos da excecao!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Vou ser executado independente do erro!");
        }
        System.out.println("Mensagem final");
    }
}
