package app.animals;

import java.io.File;

public class Bear{

public static void main(String[]args){
    
    String separador = System.getProperty("file.separator");
    System.out.println(separador);

    System.out.println(java.io.File.separator);

    var arquivo = new File("/Users/romulodasilvapenha/Documents/exercicio_certificacao_java_11/");
    System.out.println(arquivo.exists());

    System.out.println("getAbsolutePath:: " + arquivo.getAbsolutePath());

    boolean isFile =  arquivo.isFile();
    System.out.println( isFile ? " O ARQUIVO SELECIONADO É UM ARQUIVO": "DIRETORIO SELECIONADO");
    if(isFile){
        System.out.println("tamanho arquivo :: "+ arquivo.length());
        System.out.println("Ultima Data de modificação :: "+ arquivo.lastModified());
    }else{

        for(var diretorio : arquivo.listFiles()){
            System.out.println(diretorio.getName());
             
            if(!diretorio.isFile()){
                for(var subDiretorio : diretorio.listFiles()){
                     System.out.println(subDiretorio.getName());
                     
                       System.out.println(subDiretorio.getParent());

                       File subdir = new File(subDiretorio.getParent());

                        if(!subDiretorio.isFile()){
                                File diretorio_sub = new File(subDiretorio.getParent() + java.io.File.separator+ subDiretorio.getName());
                                                        for(var s2 : diretorio_sub.listFiles()){
                                                            System.out.println(s2.getName());
                                                        }
                        }
                }
            }
        }
    }
    



}

}