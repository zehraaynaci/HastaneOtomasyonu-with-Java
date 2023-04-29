
package Main;

public class User {
    
    
    String tcno,name,password;
    
    User(String tcno, String parola){
        this.tcno = tcno;
        this.password = password;
    }
     public User(String tcno, String name, String password) {
        
        this.tcno = tcno;
        this.name = name;
        this.password = password;
        
    
     }
     public User(){
        
    }


    public String getTcno() {
        return tcno;
    }

    public void setTcno(String tcno) {
        this.tcno = tcno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
