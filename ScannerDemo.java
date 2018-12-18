/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author tchan
 */
/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "C:\\Users\\tchan\\Documents\\NetBeansProjects\\Parser\\src\\parser\\scannertest";
        private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
                Token t;
		//System.out.println(file1);

		while (!ts.isEndofFile()) {
			t = ts.nextToken();
                        System.out.println("Token" + counter + " - " + t); 
                        counter++;
		}
	}
}

