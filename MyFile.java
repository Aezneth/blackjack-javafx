package com.example.blackjack;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class MyFile {
    public static ArrayList<String> readFile(String fname) {

        ArrayList<String> myList = new ArrayList<>();
        try {
            File file = new File(fname);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;

            while ((st = br.readLine()) != null) {
                myList.add(st);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return myList;
    }


    public static void writeFile(ArrayList<HighScores> list, String fname) {
        try{
            File file= new File(fname);
            PrintWriter pw = new PrintWriter(file);
            for( int i=0; i<list.size(); i++){
                pw.println(list.get(i));
            }
            pw.close();
}catch (Exception e){e.printStackTrace();}

    }
    public static void writeFile1(MyArrayList list, String fname) {
        try{
            File file= new File(fname);
            PrintWriter pw = new PrintWriter(file);
            for( int i=0; i<list.size(); i++){
                pw.println(list.get(i));
            }
            pw.close();
        }catch (Exception e){e.printStackTrace();}

    }
}