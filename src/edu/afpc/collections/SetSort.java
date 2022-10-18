package edu.afpc.collections;

import java.util.*;

public class SetSort {
    public static void main(String[] args) {

        System.out.println("Ordem aleatória");
        Set<Series> mySeries = new HashSet<Series>(){{
            add(new Series("nome", "fantasy", 60));
            add(new Series("outroNome", "comedy", 40));
            add(new Series("maisUmNome", "any", 32));
        }};

        for (Series serie : mySeries) {
            System.out.println(serie.getName() + " " + serie.getGender() + " " + serie.getTime());
        }

        System.out.println("Ordem de inserção");
        Set<Series> secSeries = new LinkedHashSet<Series>(){{
            add(new Series("nome", "fantasy", 60));
            add(new Series("outroNome", "comedy", 40));
            add(new Series("maisUmNome", "any", 32));
        }};

        for (Series serie : mySeries) {
            System.out.println(serie.getName() + " " + serie.getGender() + " " + serie.getTime());
        }

        System.out.println("Ordem de inserção");
        Set<Series> threeSeries = new TreeSet<Series>(){{
            add(new Series("nome", "fantasy", 60));
            add(new Series("outroNome", "comedy", 40));
            add(new Series("maisUmNome", "any", 32));
        }};

        for (Series serie : mySeries) {
            System.out.println(serie.getName() + " " + serie.getGender() + " " + serie.getTime());
        }

        System.out.println("Ordem de natural (tempo de episódio");
        Set<Series> fourSeries = new TreeSet<Series>(){{
            add(new Series("nome", "fantasy", 60));
            add(new Series("outroNome", "comedy", 40));
            add(new Series("maisUmNome", "any", 32));
        }};

        for (Series serie : mySeries) {
            System.out.println(serie.getName() + " " + serie.getGender() + " " + serie.getTime());
        }


    }
}

