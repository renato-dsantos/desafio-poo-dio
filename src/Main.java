import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
  
          public static void main(String[] args) {

          Curso curso1 = new Curso();
          curso1.setTitulo("curso java");
          curso1.setDescricao("descrição curso java");
          curso1.setCargaHoaria(8);

          Curso curso2 = new Curso();
          curso2.setTitulo("curso js");
          curso2.setDescricao("descrição curso js");
          curso2.setCargaHoaria(4);

          Mentoria mentoria = new Mentoria();
          mentoria.setTitulo("mentoria de java");
          mentoria.setDescricao("descrição mentoria java");
          mentoria.setData(LocalDate.now());

          /*System.out.println(curso1);
          System.out.println(curso2);
          System.out.println(mentoria);*/

          Bootcamp bootcamp - new Bootcamp();
          bootcamp.setNome("Bootcamp Java Developer");
          bootcamp.setDescricao("Descrição Bootcamp Java Developer");
          bootcamp.getConteudos().add(curso1);
          bootcamp.getConteudos().add(curso2);
          bootcamp.getConteudos().add(mentoria);
          
          Dev devRenato = new Dev();
          devRenato.setNome("Renato");
          devRenato.inscreverBootcamp(bootcamp);
          System.out.println("Conteúdo Inscritos Renato:" + devRenato.getConteudoInscritos());
          devRenato.progredir();
          devRenato.progredir();
          System.out.println("Conteúdo Inscritos Renato:" + devRenato.getConteudoInscritos());
          System.out.println("Conteúdo Concluídos Renato:" + devRenato.getConteudoConcluidos());
          System.out.println("XP:" + devRenato.calcularTotalXp());

          Dev devCamila = new Dev();
          devCamila.setNome("Camila");
          devCamila.inscreverBootcamp(bootcamp);
          System.out.println("Conteúdo Inscritos Camila" + devCamila.getConteudoInscritos());
          devCamilaC.progredir();
          devCamilaC.progredir();
          devCamilaC.progredir();
          System.out.println("Conteúdo Inscritos Camila" + devCamila.getConteudoInscritos());
          System.out.println("Conteúdo Concluídos Camila:" + devCamila.getConteudoConcluidos());
          System.out.println("XP:" + devCamila.calcularTotalXp());

            
        }  

  
  

  }
