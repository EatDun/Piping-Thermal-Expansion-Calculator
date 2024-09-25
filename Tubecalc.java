import java.util.Scanner;
import java.lang.Math;

class Main {
    
    public static double footAdj (double l) {
        return l * 12;
    }
    
    public static double tempDif (double s, double f) {
        return f - s;
    }
    
    public static double lengthCalc (double b, double L, double T) {
        return b * L * T;
    }
    
    public static void main(String[] args) {
        
        Scanner tubeScan = new Scanner(System.in);
        
        System.out.println("Enter tube type\nPress 1 for Copper:\nPress 2 for PEX:\nPress 3 for PEX-AL-PEX:\nPress 4 for Polypropylene:");
        
        int tube = tubeScan.nextInt();
        
        if(tube < 1 || tube > 4) {
        	System.out.println("Tubing input not found");
    	}
        
        double tubeCoefList[] = {0, .0000094, .000094, .000013, .0000197};
        
        double tubeCoefficient = tubeCoefList[tube];
        
        Scanner lengthScan = new Scanner(System.in);
        
        System.out.println("\nPlease enter original tube length (ft)");
        
        double lengthFt = lengthScan.nextDouble();
        
        Scanner sTempScan = new Scanner(System.in);
        
        System.out.println("\nPlease enter starting temperature");
        
        double sTemp = sTempScan.nextDouble();
        
        Scanner fTempScan = new Scanner(System.in);
        
        System.out.println("\nPlease enter final temperature");
        
        double fTemp = fTempScan.nextDouble();
        
        double lengthIn = footAdj(lengthFt);
        double dTemp = tempDif(sTemp, fTemp);
        double lc = lengthCalc(tubeCoefficient, dTemp, lengthIn);
        
        System.out.println("\nThe change in length of tubing is " + lc);
    }
}
