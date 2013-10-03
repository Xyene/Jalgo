package tk.ivybits.jalgo;

import java.awt.Component;

/**
 *
 * @author Tudor
 */
public interface Script {
   
    public String encode(String text);
    
    public String unencode(String text);
    
    public Component getOptionPane();
    
    public String getExampleText();
}
