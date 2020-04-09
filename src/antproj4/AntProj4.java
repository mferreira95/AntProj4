/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antproj4;
import antproj2.Mensagem;
import com.google.gson.Gson;
/**
 *
 * @author Miguel Ferreira
 */
public class AntProj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello world from antproj3");
        
        Mensagem m = new Mensagem();
        System.out.println(m.getMessage());
        
        Gson gson = new Gson();
        String json = gson.toJson(m);
        System.out.println("Obj in json: \n" + json);
        
    }
    
}
