package com.company;
import DAO.NodeBuildDAO;
import Entity.FinalNode;
import Entity.IntermediateNode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    private static Scanner scan1;
    private static Scanner scan2;


    public static void main(String[] args) {


        DslStatusNode dslStatusNode = new DslStatusNode();
        DslStatisticsNode dslStatisticsNode = new DslStatisticsNode();


        ArrayList<String> strCol1 = new ArrayList<>();
        ArrayList<String> strCol2 = new ArrayList<>();


        try {
            scan1 = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\Megatrans\\src\\main\\resources\\Url1.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Фаил не найден");
        }

        try {
            scan2 = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\Megatrans\\src\\main\\resources\\Url2.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Фаил не найден");
        }


        while (scan1.hasNextLine()&&scan2.hasNextLine()) {

            strCol1.add(scan1.nextLine());
            strCol2.add(scan2.nextLine());

        }
        scan1.close();
        scan2.close();


        for (int i = 0; i <strCol1.size(); i++) {
            {

                try {
                  Document  tableBody1 = Jsoup.connect(strCol1.get(i)).get();
                    String str1 = tableBody1.body().getElementsByTag("td").text();
                    dslStatusNode.setTable(str1);
                    System.out.println("Object" + " " + "№" + " "+i+" " + str1);

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Cсылка1 не найдена");
                }

            }


        }

        for (int k = 0; k < strCol2.size(); k++) {

            {
                try {
                 Document tableBody2 = Jsoup.connect(strCol2.get(k)).get();
                    String str2 = tableBody2.body().getElementsByTag("td").text();
                    dslStatisticsNode.setTable(str2);
                    System.out.println("Object" + " " + "№" + " " +k+" "+ str2);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Cсылка2 не найдена");
                }

            }


        }


    }

}

