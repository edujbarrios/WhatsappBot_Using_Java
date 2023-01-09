import com.whatsapp.WhatsApp;
import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class SendScheduledMessagesWithAttachments {
  public static void main(String[] args) {
    // Crea una nueva instancia de la clase WhatsApp
    WhatsApp whatsApp = new WhatsApp();

    // Inicia sesión en tu cuenta de WhatsApp
    whatsApp.login("+00 333-333-333", "key de autorizacion");

    // Crea una lista de ficheros adjuntos para cada mensaje
    List<File> attachments = List.of(
        new File("ruta/al/fichero/adjunto1.pdf"),
        new File("ruta/al/fichero/adjunto2.pdf"),
        new File("ruta/al/fichero/adjunto3.pdf")
   
    );
    // Obtiene y envia solo el nombre del fichero sin la ruta
    String fileName = file.getName();
    
    // Crea una lista de números de teléfono de los contactos a los que quieres enviar el mensaje
    List<String> recipients = List.of("123-456-789" as "alias1", "234-567-890" as "alias2", "345-678-901" as "alias3");

    // Programar para que se ejecute a una hora determinada
    Timer timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        // Envía cada mensaje con su correspondiente fichero adjunto a cada uno de los contactos de la lista
        for (int i = 0; i < attachments.size(); i++) {
          for (String recipient : recipients) {
            whatsApp.sendMessageWithAttachment(recipient, "Mira este fichero adjunto", attachments.get(i));
          }
        }
      }
    }, /*fecha y hora de envío*/);
  }
}
