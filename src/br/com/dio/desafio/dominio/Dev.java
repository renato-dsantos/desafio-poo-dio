import java.util.LinkedHashSet;
import java.util.Set;


public class Dev {
    private String nome;
    private Set<Conteudo> conteudoInscritos = new LinkedHashSet<>();   
    private Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){ 
        this.conteudoInscritos.addAll(bootcamp.getConteudos()); 
        bootcamp.getDevsInscritos().add(this);                     
    }

    public void progredir(){
              Optional<Conteudo> conteudo = this.conteudoInscritos.stream().finfFirst(); 
             if(conteudo.isPresent()){
                this.conteudoConcluidos.add(conteudo.get());
                this.conteudoInscritos.remove(conteudo.get());
            }else{
                System.err.println("Você não está matriculado em nenhum conteúdo!");
            }
    }

    public double calcularTotalXp(){
        this.conteudoConcluidos.stream().mapToDouble(Conteudo::calcularX).sum());
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;        
    }

     public Set<Conteudo> getConteudoInscritos(){
        return conteudoInscritos;
    }

    public void setConteudoInscritos(Set<Conteudo> conteudoInscritos){
        this.conteudoInscritos = conteudoInscritos;
    }

     public Set<Conteudo> getConteudoConcluidos(){
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos){
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Object.equals(nome, dev.nome) && Object.equals(conteudoInscritos, dev.conteudoInscritos) && Object.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode(){
        return Object.hash(nome, conteudoInscritos, conteudoConcluidos);
        
    }


}
