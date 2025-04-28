package Punto_1;

import java.util.ArrayList;
import java.util.List;

public class OfertaCursos implements Materia {
    private List<String> cursos = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>();

    public void agregarCurso(String curso) {
        cursos.add(curso);
        System.out.println("Nuevo curso agregado: " + curso);
        notificarObservadores();
    }

    public void eliminarCurso(String curso) {
        cursos.remove(curso);
        System.out.println("Curso eliminado: " + curso);
        notificarObservadores();
    }

    @Override
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    @Override
    public void eliminarObservador(Observer o) {
        observadores.remove(o);
    }

    @Override
    public void notificarObservadores() {
        for (Observer o : observadores) {
            o.actualizar(new ArrayList<>(cursos));
        }
    }
}


