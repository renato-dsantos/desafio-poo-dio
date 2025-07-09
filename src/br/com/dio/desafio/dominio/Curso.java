public class Curso extends Conteudo{
    
    int cargaHoraria;

     @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(){

    }

    public String getCargaHoraria(){
        return cargaHoraria;
    }

     public void setCargaHoaria(String cargaHoraria){
       this.cargaHoraria = cargaHoraria;
    }

    public String toString(){
        return "Curso{" +
                 "titulo='" + getTitulo() + '\''+
                 ", descricao= '" + getCargaHoraria() + '\'' +
                 ", cargaHoraria=" + cargaHoraria + 
                 '}';
    }

}
