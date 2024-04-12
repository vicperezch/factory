package FactoryMethod;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una notificación de aplicación
 */
public class AppNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
}
