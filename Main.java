package com.company;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        HashMap<String, String> translator = new HashMap<String, String>();

        translator.put("0", "0011 0000");
        translator.put("1", "0011 0001");
        translator.put("2", "0011 0010");
        translator.put("3", "0011 0011");
        translator.put("4", "0011 0100");
        translator.put("5", "0011 0101");
        translator.put("6", "0011 0110");
        translator.put("7", "0011 0111");
        translator.put("8", "0011 1000");
        translator.put("9", "0011 1001");
        translator.put("A", "0100 0001");
        translator.put("B", "0100 0010");
        translator.put("C", "0100 0011");
        translator.put("D", "0100 0100");
        translator.put("E", "0100 0101");
        translator.put("F", "0100 0110");
        translator.put("G", "0100 0111");
        translator.put("H", "0100 1000");
        translator.put("I", "0100 1001");
        translator.put("J", "0100 1010");
        translator.put("K", "0100 1011");
        translator.put("L", "0100 1100");
        translator.put("M", "0100 1101");
        translator.put("N", "0100 1110");
        translator.put("O", "0100 1111");
        translator.put("P", "0101 0000");
        translator.put("Q", "0101 0001");
        translator.put("R", "0101 0010");
        translator.put("S", "0101 0011");
        translator.put("T", "0101 0100");
        translator.put("U", "0101 0101");
        translator.put("V", "0101 0110");
        translator.put("W", "0101 0111");
        translator.put("X", "0101 1000");
        translator.put("Y", "0101 1001");
        translator.put("Z", "0101 1010");
        translator.put("a", "0110 0001");
        translator.put("b", "0110 0010");
        translator.put("c", "0110 0011");
        translator.put("d", "0110 0100");
        translator.put("e", "0110 0101");
        translator.put("f", "0110 0110");
        translator.put("g", "0110 0111");
        translator.put("h", "0110 1000");
        translator.put("i", "0110 1001");
        translator.put("j", "0110 1010");
        translator.put("k", "0110 1011");
        translator.put("l", "0110 1100");
        translator.put("m", "0110 1101");
        translator.put("n", "0110 1110");
        translator.put("o", "0110 1111");
        translator.put("p", "0111 0000");
        translator.put("q", "0111 0001");
        translator.put("r", "0111 0010");
        translator.put("s", "0111 0011");
        translator.put("t", "0111 0100");
        translator.put("u", "0111 0101");
        translator.put("v", "0111 0110");
        translator.put("w", "0111 0111");
        translator.put("x", "0111 1000");
        translator.put("y", "0111 1001");
        translator.put("z", "0111 1010");
        translator.put(" ", "0010 0000");

        System.out.println("Enter a phrase : ");
        char[] txt = scan.nextLine().toCharArray();

        for(int i = 0; i < txt.length; i++){
            for(char c : txt) {
                System.out.print(translator.get(String.valueOf(txt[i]))+" ");
                break;
            }
        }
        }

    }
