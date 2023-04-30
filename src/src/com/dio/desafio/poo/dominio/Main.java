package com.dio.desafio.poo.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso kotlin");
        curso2.setDescricao("descricao curso kotlin");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descriçã Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devInaldo = new Dev();
        devInaldo.setNome("Inaldo");
        devInaldo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devInaldo.getConteudosInscritos());
        devInaldo.progredir();
        devInaldo.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos:" + devInaldo.getConteudosInscritos());
        System.out.println("Conteudos cocluidos:" + devInaldo.getConteudosConcluidos());
        System.out.println("XP:" + devInaldo.calcularTotalXp());

        System.out.println("-------------------");

        Dev devDimebag = new Dev();
        devDimebag.setNome("Dimebag");
        devDimebag.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos:" + devDimebag.getConteudosInscritos());
        devDimebag.progredir();
        devDimebag.progredir();
        devDimebag.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos:" + devDimebag.getConteudosInscritos());
        System.out.println("Conteudos concluidos:" + devDimebag.getConteudosConcluidos());
        System.out.println("XP:" + devDimebag.calcularTotalXp());

        System.out.println("-------------------");


    }
}
