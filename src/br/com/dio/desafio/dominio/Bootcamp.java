import java.time.LocalDate;

public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome(){
        return nome;        
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getDescricao(){
        return descricao;        
    }
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public LocalDate getDataInicial(){
        return dataInicial;        
    }

    public LocalDate getDataFinal(){
        return dataFinal;        
    }

    public Set<Dev> getDevsInscritos(){
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos){
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo> getConteudos(){
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos){
        this.conteudos = conteudos;
    }

      @Override
    public boolean equals(Object o){
        if (this == 0) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (bootcamp) o;
        return Object.equals(nome, bootcamp.nome) && Object.equals(descricao, bootcamp.descricao) && Object.equals(dataInicial, bootcamp.dataInicial) && Object.equals(dataFinal, bootcamp.dataFinal) && Object.equals(devsInscritos, bootcamp.devsInscritos) && Object.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode(){
        return Object.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
        
    }

}
