package model;

import java.util.ArrayList;
import java.util.Scanner;

public class Partida {

    private String playerName;
    private int score;
    private int preguntasAcertadas;
    private ArrayList<Pregunta> preguntas;

    private void initPlayer(String playerName) {
        this.playerName = playerName;
        this.score = 0;
        this.preguntasAcertadas = 0;
    }

    private void initPreguntas() {
        this.preguntas = new ArrayList<>();

        Pregunta firstPregunta = new Pregunta("¿La capital de Francia es Paris?", true, 1);
        Pregunta secPregunta = new Pregunta("¿La capital de España es Berlín?", false, 1);
        Pregunta thirdPregunta = new Pregunta("¿La capital de Alemania es Praga?", false, 1);
        Pregunta fourthPregunta = new Pregunta("¿La capital de Venezuela es Caracas?", true, 1);
        Pregunta fifthPregunta = new Pregunta("¿La capital de Mexico es Miami?", false, 1);


        this.preguntas.add(firstPregunta);
        this.preguntas.add(secPregunta);
        this.preguntas.add(thirdPregunta);
        this.preguntas.add(fourthPregunta);
        this.preguntas.add(fifthPregunta);
    }

    public Partida() {
        initPreguntas();
        initPlayer("Juan");
    }
    public void jugarPartida() {

        for (int i = 0; i < preguntas.size(); i++) {
            Pregunta preguntaActual = preguntas.get(i);
            mostrarPregunta(preguntaActual);
            boolean respuesta = preguntaUsuario();
            if (respuesta == preguntaActual.isTrue()) {
                this.score = this.score + preguntaActual.getDificultad();
                preguntasAcertadas++;
                System.out.println("Has acertado, tu puntuacion se ha incrementado a: " + this.score);
            } else {
                System.out.println("Buen intento, has fallado");
            }
        }
        mostrarEstadisticas();
    }

    private void mostrarPregunta(Pregunta pregunta) {
        String afirmacion = pregunta.getAfirmacion();
        System.out.println(afirmacion);
    }

    private boolean preguntaUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("true o false?");
        boolean result = scanner.nextBoolean();
        scanner.close();
        return result;
    }

    private void mostrarEstadisticas() {
        System.out.println("Total de respuestas acertadas: " + this.preguntasAcertadas);
        System.out.println("Total de puntuación obtenida: " + this.score);
        double percentage = (double)this.preguntasAcertadas / this.preguntas.size() * 100;
        System.out.println("Tanto por ciento de aciertos: " + percentage + "%");
    }
}
