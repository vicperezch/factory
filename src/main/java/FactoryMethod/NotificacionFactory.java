package FactoryMethod;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Implementación del patrón Factory para crear notificaciones
 */
public class NotificacionFactory {

    /**
     * Método que crea una notificación
     * @param tipo Tipo de notificación a crear
     * @return Notificación creada
     */
    public Notificacion crearNotificacion(String tipo) {
        switch (tipo) {
            case "email":
                return new EmailNotificacion();
            
            case "sms":
                return new SMSNotificacion();

            case "app":
                return new AppNotificacion();
        
            default:
                throw new IllegalArgumentException("Tipo de notificación no soportado");
        }
    }
}
