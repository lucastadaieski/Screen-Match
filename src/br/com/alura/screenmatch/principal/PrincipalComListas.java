package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão",1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(6);
        Filme favorito = new Filme("TheMatrix", 1999);
        favorito.avalia(8);
        Filme outro = new Filme("John Wick",2014);
        outro.avalia(8);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);
        Serie serie = new Serie("La Casa de Papel",2017);
        Serie lost = new Serie("Lost",2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >= 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }


    }
}
