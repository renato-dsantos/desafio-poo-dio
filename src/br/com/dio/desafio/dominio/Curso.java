public class Curso {
    private String titulo;
    private String descricao;
    int cargaHoraria;

    public Curso(){

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

     public String getCargaHoraria(){
        return cargaHoraria;
    }

     public void setCargaHoaria(String cargaHoraria){
       this.cargaHoraria = cargaHoraria;
    }

    public String toString(){
        return "Curso{" +
                 "titulo='" + titulo + '\''+
                 ", descricao= '" + descricao + '\'' +
                 ", cargaHoraria=" + cargaHoraria + 
                 '}';
    }

}
