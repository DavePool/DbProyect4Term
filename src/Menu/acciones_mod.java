package Menu;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;
/**
 *
 * @author Dave
 * clase que se encarga de guardar para boton de hacer y deshacer
 */
    
public class acciones_mod {
    LinkedList  vehiculoModNoMotor = new LinkedList();
    LinkedList  vehiculoModTipo = new LinkedList();
    LinkedList  vehiculoModNombre = new LinkedList();
    LinkedList  vehiculoModCilindraje = new LinkedList();
    
    LinkedList  vehiculoModNoMotorB = new LinkedList();
    LinkedList  vehiculoModTipoB = new LinkedList();
    LinkedList  vehiculoModNombreB = new LinkedList();
    LinkedList  vehiculoModCilindrajeB = new LinkedList();
    
    public void guardarVehiculoMod(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("*********************************GUARDANDO VEHICULO*****************************");
                vehiculoModNoMotor.push(rst.getInt(1));
                  System.out.println("Se guardo idMotor: "+ vehiculoModNoMotor.peek());
                vehiculoModTipo.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+vehiculoModTipo.peek());
                vehiculoModNombre.push(rst.getString(3));
                    System.out.println("El nombre pasado se a guardado: "+vehiculoModNombre.peek());
                vehiculoModCilindraje.push(rst.getInt(4));
                     System.out.println("El tipo de cilindraje pasado guardado: "+vehiculoModCilindraje.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+vehiculoModCilindraje.size());
                  System.out.println("Tamaño de la pila no motor: "+vehiculoModNoMotor.size());
                  System.out.println("Tamaño de la pila nombre: "+vehiculoModNombre.size());
                  System.out.println("********************************FIN***********************************************\n");
        
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
     public void guardarVehiculoModRetorno(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("****************************GUARDANDO VEHICULO RETORNO**********************************************\n");
                vehiculoModNoMotorB.push(rst.getInt(1));
                  System.out.println("Se guardo idMotor: "+ vehiculoModNoMotorB.peek());
                vehiculoModTipoB.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+vehiculoModTipoB.peek());
                vehiculoModNombreB.push(rst.getString(3));
                    System.out.println("El nombre pasado se a guardado: "+vehiculoModNombreB.peek());
                vehiculoModCilindrajeB.push(rst.getInt(4));
                     System.out.println("El tipo de cilindraje pasado guardado: "+vehiculoModCilindrajeB.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila cilindraje: "+vehiculoModCilindrajeB.size());
                  System.out.println("Tamaño de la pila no motor: "+vehiculoModNoMotorB.size());
                  System.out.println("Tamaño de la pila nombre: "+vehiculoModNombreB.size());
        
                  System.out.println("***************************************FIN***********************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
    public int moverNoMotor(){
        int mot = 0;
        if (vehiculoModNoMotor.size() != 0) {
            mot = (int) vehiculoModNoMotor.peek();
            vehiculoModNoMotor.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor: "+vehiculoModNoMotor.size());
            System.out.println("");
        }
        return mot;
    }
    
    public String moverTipo(){
        String tipo = "";
        if (vehiculoModTipo.size() != 0) {
            tipo = (String) vehiculoModTipo.peek();
            vehiculoModTipo.pop();
            System.out.println("Tamaño de tipo en stk-tipoB"+vehiculoModTipo.size() + vehiculoModTipoB.size());
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
    
    public String moverNombre(){
        String nombre = "";
        if (vehiculoModNombre.size() != 0) {
            nombre = (String) vehiculoModNombre.peek();
            vehiculoModNombre.pop();
            System.out.println("moviendo "+nombre+"  en stk-nombreB");
            System.out.println("Tamaño de la pila nombre: "+vehiculoModNombre.size());
            System.out.println("Tamaño de la pilaB nombre: "+vehiculoModNombreB.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
    }
     public int moverCilindraje(){
        int cil = 0;
        if (vehiculoModCilindraje.size() != 0) {
            cil = (int) vehiculoModCilindraje.peek();
            vehiculoModCilindraje.pop();
            System.out.println("moviendo index "+cil+" cilindraje en stk-cilindrajeB");    
            System.out.println("Tamaño de la pila cilindraje: "+vehiculoModCilindraje.size());
            System.out.println("Tamaño de la pila cilindrajeB: "+vehiculoModCilindrajeB.size());
            System.out.println("");
        }
        return cil;
    }
     
     // retorno a pila original
      public int moverNoMotorRetorno(){
        int mot = 0;
        if (vehiculoModNoMotorB.size() != 0) {
            mot = (int) vehiculoModNoMotorB.peek();
            vehiculoModNoMotorB.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-motorB");
            System.out.println("Tamaño de la pila no motor retorno: "+vehiculoModNoMotorB.size());
            System.out.println(""); 
        }
        return mot;
    }
    
    public String moverTipoRetorno(){
        String tipo = "";
        if (vehiculoModTipoB.size() != 0) {
            tipo = (String) vehiculoModTipoB.peek();
            vehiculoModTipoB.pop();
            System.out.println("moviendo tipo en stk-tipoB");
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
    
    public String moverNombreRetorno(){
        String nombre = "";
        if (vehiculoModNombreB.size() != 0) {
            nombre = (String) vehiculoModNombreB.peek();
            vehiculoModNombreB.pop();
            System.out.println("moviendo "+nombre+"  en stk-nombreB");
            System.out.println("Tamaño de la pila nombre: "+vehiculoModNombreB.size());
            System.out.println("");
        }else{
            nombre = "";
        }
        return nombre;
    }
     public int moverCilindrajeRetorno(){
        int cil = 0;
        if (vehiculoModCilindraje.size() != 0) {
            cil = (int) vehiculoModCilindrajeB.peek();
            vehiculoModCilindrajeB.pop();
            System.out.println("moviendo index "+cil+" cilindraje en stk-cilindrajeB");    
            System.out.println("Tamaño de la pila cilindrajeB: "+vehiculoModCilindrajeB.size());
            System.out.println("");
        }
        return cil;
    }
}
