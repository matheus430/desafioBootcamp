package desafioBootcamp;



import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMatheus = new Dev();
        devMatheus.setNome("Matheus");
        devMatheus.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        devMatheus.progredir();
        devMatheus.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Matheus:" + devMatheus.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Matheus:" + devMatheus.getConteudosConcluidos());
        System.out.println("XP:" + devMatheus.calcularTotalXp());

        System.out.println("-------");

        Dev devGabriela = new Dev();
        devGabriela.setNome("Gabriela");
        devGabriela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriela:" + devGabriela.getConteudosInscritos());
        devGabriela.progredir();
        devGabriela.progredir();
        devGabriela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Gabriela:" + devGabriela.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gabriela:" + devGabriela.getConteudosConcluidos());
        System.out.println("XP:" + devGabriela.calcularTotalXp());

    }

}
