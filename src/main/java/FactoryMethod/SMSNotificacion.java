package FactoryMethod;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una notificación por SMS
 */
public class SMSNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("Mensaje enviado por SMS: " + mensaje);
    }
}
