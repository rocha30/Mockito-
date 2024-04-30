import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class EmailServiceTest {

    @Test
    public void testEnviarCorreo() {
        // Crear un mock para EmailClient
        EmailClient emailClientMock = Mockito.mock(EmailClient.class);

        // Crear la instancia de EmailService con el mock
        EmailService emailService = new EmailService(emailClientMock);

        // Llamar al método a probar
        emailService.enviarCorreo("destinatario@example.com", "Mensaje de prueba");

        // Verificar que el método enviar fue llamado en el mock
        verify(emailClientMock).enviar("destinatario@example.com", "Mensaje de prueba");
    }
}
