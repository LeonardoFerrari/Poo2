    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l201164
 */
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Principal {
    public static void main(String[] args){
        Logger meuLogger = Logger.getLogger("mylog");
        FileHandler manipuladorDeArquivo;
        
        try{
            
            manipuladorDeArquivo = new FileHandler("meulog.log");
            SimpleFormatter formatador = new SimpleFormatter();
            manipuladorDeArquivo.setFormatter(formatador);
            meuLogger.addHandler(manipuladorDeArquivo);
            
            manipuladorDeArquivo.setLevel(Level.ALL);
            meuLogger.setLevel(Level.ALL);
            
            meuLogger.log(Level.CONFIG,"Mensagem 1");
            meuLogger.log(Level.FINE,"Mensagem 2");
            meuLogger.log(Level.FINER,"Mensagem 3");
            meuLogger.log(Level.FINEST,"Mensagem 4");
            meuLogger.log(Level.INFO,"Mensagem 5");
            meuLogger.log(Level.OFF,"Mensagem 6");
            meuLogger.log(Level.SEVERE,"Mensagem 7");
            meuLogger.log(Level.WARNING,"Mensagem 8");
            meuLogger.log(Level.ALL,"Mensagem 9");
            
        }catch(SecurityException | IOException e){
            System.err.println(e.getMessage());
        }
    }
    
}
