import java.util.stream.*;

public class StreamTeste{

public static void main(String[]args){

   Stream<String> empty = Stream.empty();

   Stream<Integer> unicoElemento = Stream.of(20);

   Stream<Integer> fromArray = Stream.of(1,2,3);

    var array = new String[]{"w","o","l","f"};

    //pre streams
    var result = "";
    for(var s: array){
        result+=s;
    }
    System.out.println(result);

    Stream<String> stream = Stream.of("w","o","l","f");
    /*
    streams
    String palavra = stream.reduce("1", (resultado,saida) -> resultado + saida);
    System.out.println(palavra);
    */
    StringBuilder strigBuilder = stream.collect(
        StringBuilder::new,
        StringBuilder::append,
        StringBuilder::append
    );

    System.out.println(strigBuilder);
}

}