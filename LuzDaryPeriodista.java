package Punto_1;

import java.util.List;

public class LuzDaryPeriodista implements Observer {
    @Override
    public void actualizar(List<String> cursos) {
        System.out.println("Luz Dary(Periodista) -> Preparando spots radiales para los cursos:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
            System.out.println(" ");
        }
    }
}

