

package Service;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;


/**
 *
 * @author Dream-PC
 */
@WebService(serviceName = "Web_Service_WS")
public class Web_Service_WS {

    @WebMethod(operationName = "Hola")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hola " + txt + " !";
    }
     public byte[] getFicheroAdjunto(){
        
        String ruta ="G:\\Pri.txt";
        File file = new File(ruta);
        
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream input = new BufferedInputStream(fis);
            
            byte[] salida = new byte[(int) file.length() ];

            input.read(salida);
            input.close();
            return salida;
        } catch (IOException e) {
            return null;
        }
  
    }
     
    public File getDirec(){
        
        String ruta ="G:\\pri.txt";
        
        File file = new File(ruta);
        return file;
    }
}
