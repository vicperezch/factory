package src;

/**
 * @author Victor Pérez
 * @since 29/03/2024
 * Clase principal
 */
public class Main {
    public static void main(String[] args) {
        // Factory Method
        NotificacionFactory factory = new NotificacionFactory();
        factory.crearNotificacion("email").enviarMensaje("Mensaje de prueba por email");
        factory.crearNotificacion("sms").enviarMensaje("Mensaje de prueba por SMS");
        factory.crearNotificacion("app").enviarMensaje("Mensaje de prueba por app");

        System.out.println();

        // Abstract Factory
        INotificacionFactory urgentFactory = new UrgenteNotificacionFactory();
        urgentFactory.crearEmailNotificacion().enviarMensaje("Mensaje de prueba urgente por email");
        urgentFactory.crearSMSNotificacion().enviarMensaje("Mensaje de prueba urgente por SMS");
        urgentFactory.crearAppNotificacion().enviarMensaje("Mensaje de prueba urgente por app");

        System.out.println();

        INotificacionFactory regularFactory = new RegularNotificacionFactory();
        regularFactory.crearEmailNotificacion().enviarMensaje("Mensaje de prueba regular por email");
        regularFactory.crearSMSNotificacion().enviarMensaje("Mensaje de prueba regular por SMS");
        regularFactory.crearAppNotificacion().enviarMensaje("Mensaje de prueba regular por app");
    }
}
