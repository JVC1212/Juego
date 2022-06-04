
package Controlador;

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
  public static void main(String[] args){
try{
UIManager.setLookAndFeel(new MaterialLookAndFeel(new MaterialLiteTheme()));
}catch(UnsupportedLookAndFeelException e){
System.out.println("Rrror "+ e.getMessage());
}
new Pregunta().setVisible(true);


}  
}
