package Punto_2;

public class Usuario {
    private String nombre;
    private NotificacionStrategy estrategia;

    public Usuario(String nombre, NotificacionStrategy estrategiaInicial) {
        this.nombre = nombre;
        this.estrategia = estrategiaInicial;
    }

    public void enviarNotificacion(String mensaje) {
        System.out.println("Notificando a " + nombre + ":");
        estrategia.notificar(mensaje);
    }

    public void cambiarEstrategia(NotificacionStrategy nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
        System.out.println(nombre + " ha cambiado su preferencia de notificación.");
    }
}