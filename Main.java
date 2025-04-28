package Punto_1;

public class Main {
    public static void main(String[] args) {
        OfertaCursos ofertaCursos = new OfertaCursos();

        AndreaWebmaster andrea = new AndreaWebmaster();
        LuzDaryPeriodista luzDary = new LuzDaryPeriodista();
        LauraCommunityManager laura = new LauraCommunityManager();

        ofertaCursos.agregarObservador(andrea);
        ofertaCursos.agregarObservador(luzDary);
        ofertaCursos.agregarObservador(laura);

        ofertaCursos.agregarCurso("Inteligencia Artificial");
        ofertaCursos.agregarCurso("POO");
        ofertaCursos.eliminarCurso("Pedagogía Decolonial");
        ofertaCursos.agregarCurso("Ciudades Inteligentes");
    }
}
