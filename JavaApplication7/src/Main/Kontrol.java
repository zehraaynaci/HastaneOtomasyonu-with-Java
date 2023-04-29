
package Main;

import javax.swing.JOptionPane;

public class Kontrol {
    
    public static void showMsg(String str){
        
           String msg;
           switch(str){
           case "fill" :
                      msg="LÜTFEN TÜM ALANLARI DOLDURUNUZ";
                      break;
           default:
                      msg=str;     
        }
           JOptionPane.showMessageDialog(null,msg,"MESAJ",JOptionPane.INFORMATION_MESSAGE);
    }
    
}
