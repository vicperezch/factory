package src;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una notificación por correo electrónico
 */
public class EmailNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por correo electrónico: " + mensaje);
    }
}
