package src;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una notificación de email urgente
 */
public class UrgenteEmailNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("*URGENTE POR CORREO ELECTRÓNICO*\n" + mensaje);
    }
}
