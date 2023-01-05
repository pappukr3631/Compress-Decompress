/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CodeFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author pappu
 */
public class Compress {
    public static void method(File file) throws FileNotFoundException, IOException
    {
       String fileDirectory = file.getParent();
       System.out.println(fileDirectory);
       FileInputStream fis = new FileInputStream(file);
       FileOutputStream fos = new FileOutputStream(fileDirectory + "\\compressedFile.gz");
       GZIPOutputStream gzipOS = new GZIPOutputStream(fos);
       
       byte[] buffer = new byte[1024];
       int len;
       
       while((len = fis.read(buffer)) != -1)
           gzipOS.write(buffer, 0, len);
       
       fis.close();
       gzipOS.close();
       fos.close();
    }
    public static void main(String[] args) throws IOException{
        File path = new File("C:\\Users\\pappu\\OneDrive\\Documents\\NetBeansProjects\\Minor_Project1_CompressDecompress\\test_file.txt");
        method(path);
    }
}
