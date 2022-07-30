package model;

public class Pregunta {
    private String afirmacion;
    private boolean isTrue;
    private int dificultad;

    public Pregunta(String afirmacion, boolean isTrue, int dificultad) {
        this.afirmacion = afirmacion;
        this.isTrue = isTrue;
        this.dificultad = dificultad;
    }

    public String getAfirmacion() {
        return afirmacion;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public int getDificultad() {
        return dificultad;
    }

    @Override
    public String toString() {
        return "Pregunta{" +
                "afirmacion='" + afirmacion + '\'' +
                ", isTrue=" + isTrue +
                ", dificultad=" + dificultad +
                '}';
    }
}
