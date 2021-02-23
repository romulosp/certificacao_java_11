
import java.util.*;
import java.util.stream.*;
import java.nio.file.*;

public class JavaStreamsTeste1{

    /**
    * Exercício para certificação JavaStreams
    *
    *
    *
    *
     */

    public static void main(String[]args){
        
        //var stream = Stream.of(1,2,3,4);
        //var stream = Stream.of("PHP","JAVA","C#","PYTHON");
       
        exemplo10();
        
            
    }

      public static void exemplo10(){
          //soma os numeros 
          double total = Stream.of(2.0,3.0,4.0)
                                    //adiciona mais 4.0 na soma de a + b
                                .reduce(4.0, (a,b) -> a + b);
            System.out.println(total);
       }

     public static void exemplo09(){ 
        try(Stream<String> rows1 = Files.lines(Paths.get("data.txt"))){
        Map<String, Integer> map = new HashMap<>();
        map= rows1
            .map(x -> x.split(","))
            .filter(x-> x.length == 3)
            .filter(x -> Integer.parseInt(x[1]) < 16)
            .collect(Collectors.toMap(
                x -> x[0],
                x -> Integer.parseInt(x[1])
            ));

           map.keySet().stream().forEach(System.out::println);

        }catch(Exception e){
            System.err.println(e);
        }
     }

    public static void exemplo08(){ 
        try(Stream<String> rows1 = Files.lines(Paths.get("data.txt"))){
            var totalLista = rows1
             .map(x -> x.split(","))
             .filter(x -> x.length == 2)
             .count();

             System.out.println(totalLista);

        }catch(Exception e){
            System.err.println(e);
        }
    }

    public static void exemplo07(){ 
      try(Stream<String> bands = Files.lines(Paths.get("bands.txt"))){
        bands
			.sorted()
			.filter(x -> x.length() > 13)
			.forEach(System.out::println);
      }catch(Exception e){
          System.err.println(e);
      }
    }
    public static void exemplo06(){ 
        List<String> pessoas = Arrays.asList("Romulo","ingryd","Gildete","vitoria");
        pessoas
        .stream()
        .map(String::toUpperCase)
        //.filter(x -> x.startsWith("i"))
        .forEach(System.out::println);
    }
    public static void exemplo05(){ 
        Arrays.stream(new int []{2,4,6,8,10})
        .map(x -> x * x)
        .average()
        .ifPresent(System.out::println);
    }
    
    public static void exemplo04(){
           String[] linguagens = {"PHP","JAVA","C#","PYTHON"};
           var stream = Arrays.stream(linguagens);
        stream
           .filter(linguagem -> linguagem.contains("H"))
            .forEach(System.out::println);
    }


    public static void exemplo03(Stream<Integer> stream){
        stream
            .filter( numero -> numero % 2 == 0)
            .forEach(System.out::println);
    }


    public static void exemplo02(Stream<Integer> stream){
            stream
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);
    }

    public static void exemplo01(){
            System.out.println("List numeros");
        IntStream 
            .range(1,5)
            .forEach(JavaStreamsTeste1::println);
            
        System.out.println("-----------------");
            Integer soma = IntStream
            .range(1,5)
            .sum();

            System.out.println("total ::" +soma);
    }

    public static void println(Integer i){
        System.out.println(i);
    }
}