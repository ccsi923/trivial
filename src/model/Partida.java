package model;

import java.util.ArrayList;

public class Partida {

    private String playerName;
    private int score;
    private ArrayList<Pregunta> preguntas;

    private void initPlayer(String playerName) {
        this.playerName = playerName;
        this.score = 0;
    }

    private void initPreguntas() {
        this.preguntas = new ArrayList<>();

        Pregunta firstPregunta = new Pregunta("¿La capital de francia es paris?", true, 1);

        this.preguntas.add(firstPregunta);

    }

    public Partida() {
        initPreguntas();
        initPlayer("Juan");
    }


}
