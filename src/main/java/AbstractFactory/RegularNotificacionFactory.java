package AbstractFactory;

import FactoryMethod.AppNotificacion;
import FactoryMethod.EmailNotificacion;
import FactoryMethod.Notificacion;
import FactoryMethod.SMSNotificacion;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una fábrica de notificaciones regulares
 */
public class RegularNotificacionFactory implements INotificacionFactory {
    public Notificacion crearEmailNotificacion() {
        return new EmailNotificacion();
    }

    public Notificacion crearSMSNotificacion() {
        return new SMSNotificacion();
    }

    public Notificacion crearAppNotificacion() {
        return new AppNotificacion();
    }
}
