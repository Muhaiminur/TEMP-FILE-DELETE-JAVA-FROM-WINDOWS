/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temp.file.delete;

import java.io.File;

/**
 *
 * @author User
 */
public class TEMPFILEDELETE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String windows_temp;
        try{
            windows_temp=File.createTempFile("temp-file", "tmp").getParent();
            System.out.println(windows_temp);
            String property = "java.io.tmpdir";
            String tempDir = System.getProperty(property);
            System.out.println("OS current temporary directory is " + tempDir);
            try {
                File file = new File(windows_temp);      
                String[] myFiles;    
                if(file.isDirectory()){
                    myFiles = file.list();
                    for (int i=0; i<myFiles.length; i++) {
                        File myFile = new File(file, myFiles[i]); 
                        myFile.delete();
                    }
                }
            } catch (Exception e) {
                
            }
        }catch(Exception e){
            
        }
    }
    
}
