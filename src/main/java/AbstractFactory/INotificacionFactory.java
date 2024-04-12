package AbstractFactory;

import FactoryMethod.Notificacion;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Interfaz que define los métodos que deben implementar las fábricas de notificaciones
 */
public interface INotificacionFactory {
    Notificacion crearEmailNotificacion();
    Notificacion crearSMSNotificacion();
    Notificacion crearAppNotificacion();
}
