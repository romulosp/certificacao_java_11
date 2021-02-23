import java.util.function.Predicate;

public class LambadaPredicade{

    public static void main(String [] args){
         Resultado resultado = new Resultado("Romulo",10.0,true);
         if(isAlunoAprovado(resultado, r -> r.getPassou())){
             System.out.println("APROVADO");
         }else{
             System.out.println("REPROVADO");
         }
        var txtAprovado = "APROVADO";
        var txtEntrada = "APROVADO";

        teste(texto -> texto.equals(txtEntrada), txtAprovado);
    }

    public static void teste( Predicate<String> predicate, String label){
        System.out.println("Teste:: "+ predicate.test(label));
    }

    public static boolean isAlunoAprovado(Resultado resultado, Predicate<Resultado> verificador){
        return verificador.test(resultado);
    }
}