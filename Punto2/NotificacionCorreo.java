package Punto_2;

public class NotificacionCorreo implements NotificacionStrategy {
    @Override
    public void notificar(String mensaje) {
        System.out.println("[Correo] Enviando correo: " + mensaje);
    }
}
