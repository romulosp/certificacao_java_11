public class Resultado{
    
    private String nome;
    private Double nota;
    private boolean passou;

    public Resultado(String nome, Double nota, boolean passou){
            this.nome = nome;
            this.nota = nota;
            this.passou = passou;
    }

    public void setNome(String nome){
        this.nome = nome;
    }   

    public String getNome(){
        return nome;
    }

    public void setNota(Double nota){
        this.nota = nota;
    }   

    public Double getNota(){
        return nota;
    }

     public void setPassou(boolean passou){
        this.passou = passou;
    }   

    public boolean getPassou(){
        return passou;
    }
}