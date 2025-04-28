package Punto_1;

import java.util.List;

public class AndreaWebmaster implements Observer {
    @Override
    public void actualizar(List<String> cursos) {
        System.out.println("Andrea(Webmaster) -> Actualizando sitio web con los siguientes cursos:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
            System.out.println(" ");
        }
    }
}


