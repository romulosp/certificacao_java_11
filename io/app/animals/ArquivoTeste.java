package app.animals;
import java.io.*;
import java.nio.file.*;

public class ArquivoTeste{

static  class Pessoa implements Serializable{

     private String nome;

     Pessoa(String nome){
          this.nome = nome;
     }

     String getNome(){
          return nome;
     }
}
public static final String ARQUIVO_TESTE = "/Users/romulodasilvapenha/Documents/arquitetura_hexagonal_curso/teste/src/teste/arquivo.txt";

     public static void main(String[]args){

          Path path1 = Path.of("/a/b");
          Path path2 = Path.of("/a/c");

          System.out.println(path1.resolve(path2));
/*
          try(var output = new ObjectOutputStream(new BufferedOutputStream( new FileOutputStream("arquivo_gerado.txt")))){

                    output.writeObject(new Pessoa("romulo"));

          }catch(Exception e){
                 System.out.println(e.getMessage());
          }


          try(var input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("arquivo_gerado.txt")))){
              Pessoa pessoa =  (Pessoa) input.readObject();
               System.out.println(pessoa.getNome());
          }catch(Exception e){
                 System.out.println(e.getMessage());
          }
 
*/

     }

}