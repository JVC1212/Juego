
package Controlador;

import Modelo.Mensajes;
import Vista.Pregunta;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.themes.MaterialLiteTheme;
import mdlaf.themes.MaterialOceanicTheme;

/**
 *
 * @author julio velilla
 */
public class Juego {
  private Mensajes Modelo;
  public static void main(String[] args){
   
try{
UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialLiteTheme()));
}catch(UnsupportedLookAndFeelException e){
System.out.println("Rrror "+ e.getMessage());
}
new Pregunta().setVisible(true);


} 
  public String mensajeincorrecto(){
      return 
      Modelo.mensajeincorrecto();
     
  }
  public void crearinstanciamodelo(){
      Modelo=new Mensajes();
  }
  public String mensajecorrecto(){
      return
        Modelo.mensajecorrecto();
    }    
    public String mensajeseleccionerespuesta(){
        return
        Modelo.mensajeseleccionerespuesta();
    } 
}
