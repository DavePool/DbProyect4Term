package Menu;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Dave
 */
public class acciones_usuario {
    LinkedList  userId = new LinkedList();
    LinkedList  userName = new LinkedList();
    LinkedList  userPass = new LinkedList();
    LinkedList  userPrivilege = new LinkedList();
    
    
    LinkedList  userIdR = new LinkedList();
    LinkedList  userNameR = new LinkedList();
    LinkedList  userPassR = new LinkedList();
    LinkedList  userPrivilegeR = new LinkedList();
    
    
    public void guardarUsuarioMod(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("*********************************GUARDANDO USUARIO*****************************");
                userId.push(rst.getInt(1));
                  System.out.println("Se guardo id del usuario: "+ userId.peek());
                userName.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+ userName.peek());
                userPass.push(rst.getString(3));
                    System.out.println("La contraseña se a guardado: "+userPass.peek());
                userPrivilege.push(rst.getInt(4));
                     System.out.println("El tprivilegio se a guardado: "+userPrivilege.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila id: "+userId.size());
                  System.out.println("Tamaño de la pila nombre: "+userName.size());
                  System.out.println("Tamaño de la pila pass: "+userPass.size());
                  System.out.println("********************************FIN***********************************************\n");
        
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
    
    public void guardarUsuarioModRetorno(ResultSet rst){
        try {
              if (rst.first()) {
                  System.out.println("****************************GUARDANDO VEHICULO RETORNO**********************************************\n");
               userIdR.push(rst.getInt(1));
                  System.out.println("Se guardo id del usuario: "+ userIdR.peek());
                userNameR.push(rst.getString(2));
                  System.out.println("El tipo de auto pasado guardado: "+ userNameR.peek());
                userPassR.push(rst.getString(3));
                    System.out.println("La contraseña se a guardado: "+userPassR.peek());
                userPrivilegeR.push(rst.getInt(4));
                     System.out.println("El tprivilegio se a guardado: "+userPrivilegeR.peek());
                
                System.out.println("guardando el srt");
                  System.out.println("\n");
                  System.out.println("Tamaño de la pila id: "+userIdR.size());
                  System.out.println("Tamaño de la pila nombre: "+userNameR.size());
                  System.out.println("Tamaño de la pila pass: "+userPassR.size());
                
                  System.out.println("***************************************FIN***********************************************\n");
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    
    }
     
     public int userId(){
        int mot = 0;
        if (userId.size() != 0) {
            mot = (int) userId.peek();
            userId.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-userIdR");
            System.out.println("Tamaño de la pila user Id: "+userId.size());
            System.out.println("");
        }
        return mot;
    }
    
    public String userName(){
        String tipo = "";
        if (userName.size() != 0) {
            tipo = (String) userName.peek();
            userName.pop();
            System.out.println("Tamaño de tipo en stk-tipoB"+userName.size());
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
   
    public String userPass(){
        String tipo = "";
        if (userPass.size() != 0) {
            tipo = (String) userPass.peek();
            userPass.pop();
            System.out.println("Tamaño de user pass es: "+userPass.size());
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
   
     public int userPrivilege(){
        int mot = 0;
        if (userPrivilege.size() != 0) {
            mot = (int) userPrivilege.peek();
            userPrivilege.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-userPrivilege");
            System.out.println("Tamaño de la pila user Id: "+userPrivilege.size());
            System.out.println("");
        }
        return mot;
    }
    /***************************************************************************************************************/
    
     public int userIdR(){
        int mot = 0;
        if (userIdR.size() != 0) {
            mot = (int) userIdR.peek();
            userIdR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-userIdR");
            System.out.println("Tamaño de la pila user Id: "+userIdR.size());
            System.out.println("");
        }
        return mot;
    }
    
    public String userNameR(){
        String tipo = "";
        if (userNameR.size() != 0) {
            tipo = (String) userNameR.peek();
            userNameR.pop();
            System.out.println("Tamaño de tipo en stk-tipoB"+userNameR.size());
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
   
    public String userPassR(){
        String tipo = "";
        if (userPassR.size() != 0) {
            tipo = (String) userPassR.peek();
            userPassR.pop();
            System.out.println("Tamaño de user pass es: "+userPassR.size());
            System.out.println("");
        }else{
            tipo = "";
        }
        return tipo;
    }
   
     public int userPrivilegeR(){
        int mot = 0;
        if (userPrivilegeR.size() != 0) {
            mot = (int) userPrivilegeR.peek();
            userPrivilegeR.pop();
            System.out.println("Moviendo index "+mot+" motor en stk-userPrivilege");
            System.out.println("Tamaño de la pila user Id: "+userPrivilegeR.size());
            System.out.println("");
        }
        return mot;
    }
    
}
