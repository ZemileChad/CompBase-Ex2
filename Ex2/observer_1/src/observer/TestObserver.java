/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestObserver {
    public static void main(String[] args) {
	LiveUAE obj1 = new LiveUAE();
	LiveThai obj2 = new LiveThai();
	HeadQuater obj = new HeadQuater();              
	obj.register(obj1);              
	obj.register(obj2);              
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.print("Enter Score (press Enter without text to finish):");
            input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            obj.setScore(input);
        }
    }
}
