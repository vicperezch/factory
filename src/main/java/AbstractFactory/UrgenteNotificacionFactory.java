package AbstractFactory;

import AbstractFactory.INotificacionFactory;
import FactoryMethod.Notificacion;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una fábrica de notificaciones urgentes
 */
public class UrgenteNotificacionFactory implements INotificacionFactory {
    public Notificacion crearEmailNotificacion() {
        return new UrgenteEmailNotificacion();
    }

    public Notificacion crearSMSNotificacion() {
        return new UrgenteSMSNotificacion();
    }

    public Notificacion crearAppNotificacion() {
        return new UrgenteAppNotificacion();
    }
}
