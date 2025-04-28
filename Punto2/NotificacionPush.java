package Punto_2;

public class NotificacionPush implements NotificacionStrategy {
    @Override
    public void notificar(String mensaje) {
        System.out.println("[Push] Enviando notificación push: " + mensaje);
    }
}
