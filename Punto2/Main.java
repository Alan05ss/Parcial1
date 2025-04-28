package Punto_2;

public class Main {
    public static void main(String[] args) {
    	
        NotificacionStrategy correo = new NotificacionCorreo();
        NotificacionStrategy sms = new NotificacionSMS();
        NotificacionStrategy push = new NotificacionPush();

        Usuario juan = new Usuario("Juan", correo);
        Usuario maria = new Usuario("María", sms);
        Usuario pedro = new Usuario("Pedro", push);

        juan.enviarNotificacion("Transacción realizada por $100.000.");
        maria.enviarNotificacion("Saldo bajo: menos de $50.000.");
        pedro.enviarNotificacion("Nueva promoción disponible");

        System.out.println("Cambio de preferencias");

        juan.cambiarEstrategia(push);
        juan.enviarNotificacion("Resumen diario de transacciones.");

        maria.cambiarEstrategia(correo);
        maria.enviarNotificacion("Alerta de seguridad: inicio de sesión sospechoso.");
    }
}
