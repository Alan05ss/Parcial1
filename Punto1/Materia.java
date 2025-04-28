package Punto_1;

public interface Materia {
    void agregarObservador(Observer o);
    void eliminarObservador(Observer o);
    void notificarObservadores();
}
