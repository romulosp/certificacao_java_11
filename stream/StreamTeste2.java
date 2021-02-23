import java.util.stream.*;
import java.util.*;
 
public class StreamTeste2{

    public static void main(String[] args){
        System.out.println("Novos Exercicios Stream!");
        System.out.println("usando operadores - filter, map , reduce");
        getListaPessoas().stream().forEach(System.out::println);

        //  System.out.println("Filter 1 - idade >= 18");
       List<Pessoa> pessoasDeMaiores = getListaPessoas()
            .stream()
            .filter((pessoa) -> pessoa.idade >= 18)
            .sorted(Comparator.comparing(Pessoa::getIdade)) 
             .collect(Collectors.toList());

       // pessoasDeMaiores.forEach(System.out::println);
        

         //         System.out.println("Filter  2 - idade >= 18");
       List<Pessoa> pessoasDeMaiores2 = getListaPessoas()
            .stream()
            .filter((pessoa) -> pessoa.idade >= 18)
            .sorted(Comparator.comparing(Pessoa::getIdade) .thenComparing(Pessoa::getNome).reversed()) 
             .collect(Collectors.toList());

        //pessoasDeMaiores2.forEach(System.out::println);


        //AllMatch() - verifica se a condição se aplica a tudo
        var pessoasMaioresDe10Anos = getListaPessoas().stream().allMatch((pessoa) -> pessoa.getIdade() > 10);
     //   System.out.println("pessoasMaioresDe10Anos "+pessoasMaioresDe10Anos);

        //anyMatch() - verifica se a condição se aplica em algum caso
        var hasCrianca = getListaPessoas().stream().anyMatch(pessoa -> pessoa.getIdade() <= 5);
     //   System.out.println("hasCrianca "+hasCrianca);


        //noneMatch() - verifica se a condição se aplica a nenhum caso
        var hasIdoso = !getListaPessoas().stream().noneMatch(pessoa -> pessoa.getIdade() >= 70);
      System.out.println("hasIdoso "+hasIdoso);

    }   

    public static List<Pessoa> getListaPessoas(){
        return List.of(
            new Pessoa("ROMULO",29),
            new Pessoa("Ingryd",27),
            new Pessoa("Antonio luiz",12), 
            new Pessoa("Angelo Miguel",1), 
            new Pessoa("Naiara",31)
        );
    }




    static class Pessoa{
        private String nome;
        private Integer idade;

        public Pessoa(String nome, Integer idade){
            this.nome = nome;
            this.idade = idade;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public String getNome(){
            return nome;
        }

        public void setIdade(Integer idade){
            this.idade = idade;
        }
        
        public Integer getIdade(){
            return idade;
        }

        public String toString(){
            return "NOME : "+ getNome() + " - idade : "+getIdade();
        }
    }
}