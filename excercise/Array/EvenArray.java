package rayayoi.wissanu.Array;

public class EvenArray{  
    final static int scale = 10;
    public static void main(String args[]) {   
        int lenArg = args.length;
        if(lenArg == 0 && lenArg > 10) {
            System.out.println("Usage : EvenArray <integer 1> <integer 2> <integer 3> ...");
            System.exit(0);
        }
        int allInt = 0;
        int numeven[] = new int[scale];
        for (int i = 0; i < lenArg; i++) {
            int readnum = Integer.parseInt(args[i]);
            if(readnum % 2 == 0) {
                numeven[allInt++] = readnum;
            }
        }
        if(allInt == 0) {
            System.out.println("There isn't have any even integer.");
        } else {
            System.out.println("Only even integers are : ");
            for (int i = 0; i < allInt; i++) {
                System.out.print(numeven[i] + " ");
            }
        }
    }
}  
