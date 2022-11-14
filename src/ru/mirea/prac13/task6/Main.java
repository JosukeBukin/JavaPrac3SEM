package ru.mirea.prac13.task6;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        StringBuilder str6 = new StringBuilder();
        try{
            FileReader reader = new FileReader("src/ru/mirea/prac13/task6/text.txt");
            int c;
            char[] b = new char[1];
            while ((c = reader.read(b)) != -1){
                str6.append(b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(GetLine(str6));
    }

    public static StringBuilder GetLine(StringBuilder str){
        ArrayList<String> arrayList;
        arrayList = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == ' ') {
                arrayList.add(str.substring(temp, i));
                temp = i + 1;
            }
        }
        StringBuilder template = new StringBuilder(arrayList.get(0));
        for (int i = 1; i < arrayList.size(); i++){
            if (arrayList.get(i).charAt(arrayList.get(i).length()-1) == template.charAt(0)){
                template.insert(0, arrayList.get(i)+" ");
            }
            if (arrayList.get(i).charAt(0) == template.charAt(template.length()-1)){
                template.insert(template.length(), " "+arrayList.get(i));
            }
        }

        return template;
    }
}
