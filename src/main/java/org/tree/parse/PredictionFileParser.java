package org.tree.parse;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class PredictionFileParser {

    static String filePath = "/Users/rahulshekhar/Downloads/tree.txt";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        printDecision(br);
    }

    static void printDecision(BufferedReader br) throws IOException {
        String line = null;
        LinkedList<String> decisions = new LinkedList<String>();
        while((line = br.readLine())!=null){
            line=line.trim();
            if(line.contains("Predict")){
                printList(decisions);
                System.out.print(line);
                continue;
            }
            else if(line.contains("Else")){
                removeTillLastIf(decisions);
            }
            decisions.add(line.trim());
        }
    }

    static void printList(LinkedList<String> decisions) {
        System.out.println("");
        String decision = null;
        for(int i = 0; i<decisions.size(); i++){
            decision = decisions.get(i);
            decision = decision.replace("If (", "");
            decision = decision.replace("Else (", "");
            decision = decision.replace(")", "");
            System.out.print(decision);
            if(i < decisions.size() -1){
                System.out.print(", and ");
            }
            else {
                System.out.print(" then ");
            }
        }
    }
    static void removeTillLastIf(LinkedList<String> decisions){
        while(!decisions.removeLast().contains("If")){

        }
    }

}