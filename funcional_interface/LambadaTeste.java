 
import java.util.function.Supplier;
import java.util.function.Consumer;

public class LambadaTeste{

    public static void main(String [] args){
          //Teste Supplier
          //System.out.println(buscar(()->"10"));

         // Supplier<Number> getResultado = () -> 20.0;
         // System.out.println(getResultado.get());
    
         // Consumer<String> c1 = x -> System.out.println(x);
         // c1.accept("romulo");

         Consumer<PesquisaDTO> filtro = (dto) ->
         { 
             System.out.println(dto.getOperacao() + " realizada");
         }
         ;

        filtro.accept(new PesquisaDTO("cadastro"));
        filtro.accept(new PesquisaDTO("galeria"));
        filtro.accept(new PesquisaDTO("subscribe")); 
 
    }

    static class  PesquisaDTO {
        private String operacao;
        
        PesquisaDTO(String operacao){
            this.operacao = operacao;
        }

        public void setOperacao(String operacao){
            this.operacao= operacao;
        }
        public String getOperacao(){
            return operacao;
        }
    }



    public static String buscar(Supplier<String> filtro){
        return filtro.get();
    }
}