import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso Java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("descrição Mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java Developer");
        bootCamp.setDescricao("Descrição BootCamp Java Dev");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        Dev devKamilla = new Dev();
        devKamilla.setNome("Kamilla");
        devKamilla.inscreverBootcamp(bootCamp);
        System.out.println("Conteudos Inscritos Kamilla " + devKamilla.getConteudoInscrito());
        devKamilla.progredir();
        System.out.println("__");
        System.out.println("Conteudos Conclúidos Kamilla " + devKamilla.getConteudoConcluido());
        System.out.println("XP " + devKamilla.calcularTotalXp());
        System.out.println("_____");


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootCamp);

        System.out.println("Conteudos Inscritos João " + devJoao.getConteudoInscrito());
        devJoao.progredir();
        System.out.println("__");
        System.out.println("XP " + devJoao.calcularTotalXp());
        System.out.println("Conteudos Conclúidos João " + devJoao.getConteudoConcluido());


    }
}