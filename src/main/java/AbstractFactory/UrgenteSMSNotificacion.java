package AbstractFactory;

import FactoryMethod.Notificacion;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase que modela una notificación de SMS urgente
 */
public class UrgenteSMSNotificacion implements Notificacion {
    public void enviarMensaje(String mensaje) {
        System.out.println("*URGENTE POR SMS*\n" + mensaje);
    }
}
