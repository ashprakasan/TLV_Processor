package com.aiswarya;
import java.util.Scanner;
/**
 * Created by ashprakasan on 03/12/17.
 */
public class ScannerReader implements Reader {
    private Scanner s;
    ScannerReader(){
        s = new Scanner(System.in);
    }
    public boolean hasNext(){
        return s.hasNextLine();
    }
    public String next(){
        return s.nextLine();
    }
}
