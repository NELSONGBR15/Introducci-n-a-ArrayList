
package package1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Main {//1
 
    public static void main(String[] args) {//Main1
     int op;
     List<String>Nombres;
     List<Integer>Edad;
     Nombres = new ArrayList<>();
     Edad = new ArrayList<>();
     
     try{//2
      do{//4
      String opc = JOptionPane.showInputDialog(" Digite una opcion\n"
              + "1) Digitar y agregar Nombres\n"
              + "2) Eliminar nombre\n"
              + "3) Mostrar Lista de Nombres\n"
              + "4) Eliminar Lista de Nombres\n"
              + "5) Salir");
      
        if ( opc == null ){
             JOptionPane.showMessageDialog(null, "Pesiono cancelar"); //Si presiona cancelar mostrara el mensaje ya que la variable opc esta vacia
          }      
      
        op = Integer.parseInt(opc); //Convertir string a int        
        
       switch(op){       
           case 1: 
                add_nombre(Nombres);
             break;
           case 2:
               delete_nombre(Nombres);           
              break;
           case 3:
              mostrar_nombre(Nombres);                
              break;       
           case 4:              
              eliminar_nombre(Nombres);
              break;
           case 5:
               
              break;                           
       } 
      }while(op != 5);//4    
     }catch (Exception e){//2-3
     JOptionPane.showMessageDialog(null, "Debe rellenar la casilla con alguna de las opciones ");         
     } //3   
     
    }//Main1
  
   
 public static void add_nombre(List<String>Nombres){ 
  Nombres.add(JOptionPane.showInputDialog("Digite el nombre"));            
 }
 
 public static void delete_nombre(List<String>Nombres){
      try{
       String posi = JOptionPane.showInputDialog(" Digite la posicion en la lista del nombre que desea eliminar");
        if ( posi == null ){
             JOptionPane.showMessageDialog(null, "Pesiono cancelar"); //Si presiona cancelar mostrara el mensaje ya que la variable opc esta vacia
          }         
        int pos = Integer.parseInt(posi);
        Nombres.remove(pos);
      }catch(Exception e){
     JOptionPane.showMessageDialog(null,"ERROR. Digito un valor que no corresponde a la posicion del algun nombre ");     
      }   
 }
 
 
 public static void mostrar_nombre(List<String>Nombres){
     if (Nombres.size()== 0){
     JOptionPane.showMessageDialog(null, "La lista esta vacia");
     }else{
       for (int i = 0; i < Nombres.size(); i++) {
       JOptionPane.showMessageDialog(null, "Posicion ["+i+"]: "+Nombres.get(i));//
      }}
 }
 
  public static void eliminar_nombre(List<String>Nombres){
       for (int i = 0; i < Nombres.size(); i++) {
       Nombres.remove(i);
      }
      Nombres.remove(0);
      JOptionPane.showMessageDialog(null, "Se ha eliminado la lista de nombres");
 }
 
 
}//1