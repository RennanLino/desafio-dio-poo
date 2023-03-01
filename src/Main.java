import java.time.LocalDate;
import java.util.Arrays;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso("curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("curso js", "descrição curso js", 4);
        Mentoria mentoria = new Mentoria("mentoria de java", "descrição mentoria java", LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().addAll(Arrays.asList(curso1, curso2, mentoria));

        Dev dev1 = new Dev("Camila");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Camila: " + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();

        Dev dev2 = new Dev("João");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos João: " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("----------------------------------------");
        System.out.println("Conteúdos inscritos Camila: " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Camila: " + dev1.getConteudosConcluidos());
        System.out.println("XP Camila: " + dev1.calcularTotalXp());
        System.out.println("Conteúdos inscritos João: " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos João: " + dev2.getConteudosConcluidos());
        System.out.println("XP João: " + dev2.calcularTotalXp());
    }
}
