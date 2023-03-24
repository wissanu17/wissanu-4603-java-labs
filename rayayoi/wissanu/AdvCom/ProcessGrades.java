package rayayoi.wissanu.AdvCom;

import java.io.*;
import java .util.*;

public class ProcessGrades {

    protected String filename = "grades";
    protected HashMap<String, Double> gpas = new HashMap<String, Double>();
    protected TreeMap<String, Double> sortedGpas; 
    
    protected void readInputGrades() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ID grade <Press Ctrl-D (or Ctrl-Z on Windows) to end input> : ");
        while (in.hasNext()) {
            String id = in.next();
            Double gpa = in.nextDouble();
            gpas.put(id, gpa);
            System.out.print("Enter ID grade <Press Ctrl-D (or Ctrl-Z on Windows) to end input> : ");
        }
        in.close();
    }
    
    protected void sortGrades() {
        System.out.println("Sort sus");
        sortedGpas = new TreeMap<String, Double>(gpas);
        printMap(sortedGpas);
    }

    public static void printMap(Map<String, Double> map) {
        Set s = map.entrySet();
        Iterator it = s.iterator();
        System.out.println("====== Sorted grades =======");
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String key = (String) entry.getKey();
            Double value = (Double) entry.getValue();
            System.out.println(key + " => " + value);
        }
    }  

    protected void readGradsFromFile() {
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            System.out.print("====== Reading grades from file ======\n");
            while ((line = bfr.readLine()) != null) {
                String[] tokens = line.split(" ");
                if (tokens.length != 0) {
                    String id = tokens[0];
                    Double gpa = Double.parseDouble(tokens[1]);
                    gpas.put(id, gpa);
                    System.out.print(id + " has GPA as " + gpa + "\n");
                }
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

    protected void writeGrades() {
        try {
            PrintWriter p = new PrintWriter(filename);
            for (String id : gpas.keySet()) {
                Double gpa = gpas.get(id);
                p.println(id + " " + gpa);
            }
            p.close();
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("1");
        } catch (IOException ex) {
            System.err.println("2");
            ex.printStackTrace(System.err);
        }
    }

    public static void main(String[] args) {
        ProcessGrades pg = new ProcessGrades();
        pg.readInputGrades();
        pg.sortGrades();
        pg.writeGrades();
        pg.readGradsFromFile();
    }
  
}
