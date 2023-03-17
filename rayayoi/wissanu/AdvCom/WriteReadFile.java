package rayayoi.wissanu.AdvCom;

import java.io.*;

public class WriteReadFile {
    String name = "วิษณุ ระยาย้อย";
    String id = "653040460-3";

    public static void main(String[] args) {
        String name = "วิษณุ ระยาย้อย";
        String id = "653040460-3";
    
        try {
            String filename = args[0];
            PrintWriter p = new PrintWriter(filename);
            System.out.println("Writing " + id + " " + name + " to " + filename);
            p.println(id);
            p.println(name);
            p.close();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("1");
        } catch (IOException ex) {
            System.err.println("2");
            ex.printStackTrace(System.err);
        }
        
        try {
            String filename = args[0];
            FileReader fr = new FileReader(filename);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            System.out.println("Reding " + id + " " + name + " from " + filename);
            System.out.print("The read data from the file is ");
            while ((line = bfr.readLine()) != null) {
                System.out.print(line + " ");
            }
            bfr.close();
            fr.close();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("3");
        } catch (IOException ex) {
            System.err.println("4");
            ex.printStackTrace(System.err);
        } 
    }
}
