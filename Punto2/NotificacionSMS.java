package Punto_2;

public class NotificacionSMS implements NotificacionStrategy {
    @Override
    public void notificar(String mensaje) {
        System.out.println("[SMS] Enviando SMS: " + mensaje);
    }
}
