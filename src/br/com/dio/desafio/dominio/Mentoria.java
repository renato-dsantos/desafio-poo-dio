import java.time.LocalDate;

public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

    public Mentoria(){

    }


    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
       this.titulo = titulo;
    }

    public String getDescricao(){
        return titulo;
    }

     public void setDescricao(String descricao){
       this.descricao = descricao;
    }

     public LocalDate getData(){
        return cargaHoraria;
    }

     public void setData(LocalDate data){
       this.data = data;
    }

    public String toString(){
        return "Mentoria{" +
                 "titulo='" + titulo + '\''+
                 ", descricao= '" + descricao + '\'' +
                 ", data=" + data + 
                 '}';


    }


}
