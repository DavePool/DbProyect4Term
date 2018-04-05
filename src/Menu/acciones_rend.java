package Menu;

import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class acciones_rend {
    LinkedList  rendId = new LinkedList();
    LinkedList  rendCiudad = new LinkedList();
    LinkedList  rendCarretera = new LinkedList();
    LinkedList  rendCombinado = new LinkedList();
    LinkedList  rendpotencia = new LinkedList();
    LinkedList  rendNoMotor = new LinkedList();
    
    LinkedList  rendIdR = new LinkedList();
    LinkedList  rendCiudadR = new LinkedList();
    LinkedList  rendCarreteraR = new LinkedList();
    LinkedList  rendCombinadoR = new LinkedList();
    LinkedList  rendpotenciaR = new LinkedList();
    LinkedList  rendNoMotorR = new LinkedList();
    
    public void guardarRendimientoMod(ResultSet rst){
        try {
              if (rst.first()) {
                System.out.println("*************************Guradando Rendimiento********************************");
                rendId.push(rst.getInt(1));
                  System.out.println("Se guardo rendimiento Id: "+ rendId.peek());
                rendCiudad.push(rst.getString(2));
                  System.out.println("El rendimento ciudad guardado: "+rendCiudad.peek());
                rendCarretera.push(rst.getString(3));
                    System.out.println("El rendimiento carretera se a guardado: "+rendCarretera.peek());
                rendCombinado.push(rst.getString(4));
                     System.out.println("El tipo de rendimiento combinado guardado: "+ rendCombinado.peek());
                rendpotencia.push(rst.getString(5));
                     System.out.println("La potencia se a guardado: "+ rendpotencia.peek());
                rendNoMotor.push(rst.getInt(6));
                     System.out.println("El numero de motor se a guardado: "+ rendNoMotor.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila id Rendimiento: "+rendId.size());
                  System.out.println("Tamaño de la pila rendimiento ciudad: "+rendCiudad.size());
                  System.out.println("Tamaño de la pila rendimiento carretera: "+rendCarretera.size());
                  System.out.println("Tamaño de la pila rendimiento combinado: "+rendCombinado.size());
                  System.out.println("Tamaño de la pila potencia: "+rendpotencia.size());
                  System.out.println("Tamaño de la pila No Motor: "+rendNoMotor.size());
        
                  System.out.println("*************************************Fin********************************************");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
     public void guardarRendimientoModRetorno(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("**************************Guardando Rendimiento Respaldo**************************\n");
                
                rendIdR.push(rst.getInt(1));
                  System.out.println("Se guardo rendimiento Id: "+ rendIdR.peek());
                rendCiudadR.push(rst.getString(2));
                  System.out.println("El rendimento ciudad guardado: "+rendCiudadR.peek());
                rendCarreteraR.push(rst.getString(3));
                    System.out.println("El rendimiento carretera se a guardado: "+rendCarreteraR.peek());
                rendCombinadoR.push(rst.getString(4));
                     System.out.println("El tipo de rendimiento combinado guardado: "+ rendCombinadoR.peek());
                rendpotenciaR.push(rst.getString(5));
                     System.out.println("La potencia se a guardado: "+ rendpotenciaR.peek());
                rendNoMotorR.push(rst.getInt(6));
                     System.out.println("El numero de motor se a guardado: "+ rendNoMotorR.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila id RendimientoR: "+rendIdR.size());
                  System.out.println("Tamaño de la pila rendimiento ciudadR: "+rendCiudadR.size());
                  System.out.println("Tamaño de la pila rendimiento carreteraR: "+rendCarreteraR.size());
                  System.out.println("Tamaño de la pila rendimiento combinadoR: "+rendCombinadoR.size());
                  System.out.println("Tamaño de la pila potenciaR: "+rendpotenciaR.size());
                  System.out.println("Tamaño de la pila No MotorR: "+rendNoMotorR.size());
        
                  System.out.println("****************************************Fin*****************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    /**************************************************************************************************************/
     public int rendId(){
        int mot = 0;
        if (rendId.size() != 0) {
            mot = (int) rendId.peek();
            rendId.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+rendId.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendCiudad(){
          String mot = "";
        if (rendCiudad.size() != 0) {
            mot =  (String) rendCiudad.peek();
            rendCiudad.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento ciudad: "+rendCiudad.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendCarretera(){
          String mot = "";
        if (rendCarretera.size() != 0) {
            mot =  (String) rendCarretera.peek();
            rendCarretera.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento carretera: "+rendCarretera.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendCombinado(){
          String mot = "";
        if (rendCombinado.size() != 0) {
            mot =  (String) rendCombinado.peek();
            rendCombinado.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCombinado");
            System.out.println("Tamaño de la pila rendimiento combinado: "+rendCombinado.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendPotencia(){
          String mot = "";
        if (rendpotencia.size() != 0) {
            mot =  (String) rendpotencia.peek();
            rendpotencia.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-potencia");
            System.out.println("Tamaño de la pila potencia: "+rendpotencia.size());
            System.out.println("");
        }
        return mot;
     }
     public int rendNoMotor(){
          int mot = 0;
        if (rendNoMotor.size() != 0) {
            mot =  (int) rendNoMotor.peek();
            rendNoMotor.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendNoMotor");
            System.out.println("Tamaño de la pila no motor Rendimiento: "+rendNoMotor.size());
            System.out.println("");
        }
        return mot;
     }
     /********************************************************************************************************/
     
     public int rendIdR(){
        int mot = 0;
        if (rendIdR.size() != 0) {
            mot = (int) rendIdR.peek();
            rendIdR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+rendIdR.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendCiudadR(){
          String mot = "";
        if (rendCiudadR.size() != 0) {
            mot =  (String) rendCiudadR.peek();
            rendCiudadR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento ciudad: "+rendCiudadR.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendCarreteraR(){
          String mot = "";
        if (rendCarreteraR.size() != 0) {
            mot =  (String) rendCarreteraR.peek();
            rendCarreteraR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCiudad");
            System.out.println("Tamaño de la pila rendimiento carretera: "+rendCarreteraR.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendCombinadoR(){
          String mot = "";
        if (rendCombinadoR.size() != 0) {
            mot =  (String) rendCombinadoR.peek();
            rendCombinadoR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendCombinado");
            System.out.println("Tamaño de la pila rendimiento combinado: "+rendCombinadoR.size());
            System.out.println("");
        }
        return mot;
     }
     
     public String rendPotenciaR(){
          String mot = "";
        if (rendpotenciaR.size() != 0) {
            mot =  (String) rendpotenciaR.peek();
            rendpotenciaR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-potencia");
            System.out.println("Tamaño de la pila potencia: "+rendpotenciaR.size());
            System.out.println("");
        }
        return mot;
     }
     public int rendNoMotorR(){
          int mot = 0;
        if (rendNoMotorR.size() != 0) {
            mot =  (int) rendNoMotorR.peek();
            rendNoMotorR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-rendNoMotor");
            System.out.println("Tamaño de la pila no motor Rendimiento: "+rendNoMotorR.size());
            System.out.println("");
        }
        return mot;
     }
     
}
