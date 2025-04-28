package Punto_1;

import java.util.List;

public class LauraCommunityManager implements Observer {
    @Override
    public void actualizar(List<String> cursos) {
        System.out.println("Laura(Community Manager) -> Publicando en redes sociales los cursos:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
            System.out.println(" ");
        }
    }
}


