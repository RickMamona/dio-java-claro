import java.time.LocalDate;

import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso introdutório em Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Curso introdutório em JS");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria sobre Java");
        mentoria.setData(LocalDate.now());

       /*  System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Development");
        bootcamp.setDescricao("Descricao sobre Java Development");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRick = new Dev();
        devRick.setNome("Rick");
        devRick.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rick:" + devRick.getConteudosInscritos() + "Iniciado em: " + bootcamp.getDataInicical() + ", Data Limite para Finalizar: " + bootcamp.getDataFinalFormatted());
        devRick.progredir();
        devRick.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Rick:" + devRick.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Rick:" + devRick.getConteudosConcluidos());
        System.out.println("XP:" + devRick.calcularTotalXp());
        
        System.out.println("------------------------------------------------------------------------------------------------");
        
        Dev devBianca = new Dev();
        devBianca.setNome("Bianca");
        devBianca.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Bianca:" + devBianca.getConteudosInscritos() + "Iniciado em: " + bootcamp.getDataInicialFormatted() + ", Data Limite para Finalizar: " + bootcamp.getDataFinalFormatted());
        devBianca.progredir();
        devBianca.progredir();
        devBianca.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Bianca:" + devBianca.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Bianca:" + devBianca.getConteudosConcluidos());
        System.out.println("XP:" + devBianca.calcularTotalXp());

        System.out.println("O total de de devs Inscritos no Bootcamp é: " + bootcamp.getNumeroDevsInscritos());



    }
}
