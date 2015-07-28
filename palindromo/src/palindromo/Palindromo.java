package palindromo;
import javax.swing.JOptionPane;
public class Palindromo {
   
   
    
    public static void main(String[] args) {
        String analizar=JOptionPane.showInputDialog("Introduce la palabra a analizar");
        char[] caracteres;
        caracteres = analizar.toCharArray();
        
        int contar=caracteres.length;
        int primer=0;
        
        boolean palindromo=true;
        while (primer<contar){
           contar--;
           
            if (caracteres[primer]!=caracteres[contar]){
                palindromo=false;
                
            }
                       
            primer++;
        }
        if (palindromo){
        JOptionPane.showMessageDialog(null,"Es un palindromo");
    }else {
            JOptionPane.showMessageDialog(null,"No lo es");
        }
    }
}