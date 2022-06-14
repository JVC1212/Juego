
package Controlador;
/*Se importan las librerias para el funcionamiento JUnit */
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JuegoTest {
    
    public JuegoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
  

    /*Test Case de la funcion mensaje incorrecto, la cual devuelve el mensaje
    incorrecto en los formulario de las preguntas*/
    @org.junit.jupiter.api.Test
    public void testMensajeincorrecto() {
        System.out.println("Prueba unitaria funcion MensajeIncorrecto");
        Juego instance = new Juego();
        String expResult = "Incorrecto";
        instance.crearinstanciamodelo();
        String result = instance.mensajeincorrecto();
        assertEquals(expResult, result);
            }
    /*Test Case de la funcion mensaje correcto, la cual devuelve el mensaje
    correcto en los formulario de las preguntas*/
    @org.junit.jupiter.api.Test
    public void testmensajecorrecto() {
        System.out.println("Prueba unitaria funcion MensajeCorrecto");
        Juego instance = new Juego();
        String expResult = "Correcto";
        instance.crearinstanciamodelo();
        String result = instance.mensajecorrecto();
        assertEquals(expResult, result);
            }
    /*Test Case de la funcion mensaje seleccione respuesta, la cual devuelve el 
    mensaje seleccione respuesta en los formulario de las preguntas*/
    @org.junit.jupiter.api.Test
    public void testmensajeseleccionerespuesta() {
        System.out.println("Prueba unitaria funcion MensajeSeleccioneRespuesta");
        Juego instance = new Juego();
        String expResult = "Seleccione una respuesta";
        instance.crearinstanciamodelo();
        String result = instance.mensajeseleccionerespuesta();
        assertEquals(expResult, result);
            }
}
