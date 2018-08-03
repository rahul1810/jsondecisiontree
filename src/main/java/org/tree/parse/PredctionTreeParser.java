package org.tree.parse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import org.tree.model.PredictionObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;


public class PredctionTreeParser {

    private static final Type PREDICTION_OBJECT_TYPE = new TypeToken<PredictionObject>() {
    }.getType();

    private static String separator = ":";
    private static String separator2 = " -> ";

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "/Users/rahulshekhar/Downloads/tree.json";
        Gson gson = new Gson();
        JsonReader reader = new JsonReader(new FileReader(fileName));
        PredictionObject jsonObject = gson.fromJson(reader, PREDICTION_OBJECT_TYPE);
        String[] decisionArray = new String [2];
        List<String> decsionList = new LinkedList<String>();
        decsionList.add(jsonObject.getName());
        printDecisionTrees(jsonObject, decsionList, 0);
    }

    static void printDecisionTrees(PredictionObject current, List<String> decisions, int level){
        if(current.getChildren() == null){
            print(decisions);
        }
        else{
            for(PredictionObject child: current.getChildren()){
                decisions.add(level + separator +child.getName());
                printDecisionTrees(child, decisions, level + 1);
                decisions.remove(decisions.size()-1);
            }
        }
    }

    static void print(List<String> decisionList){
        System.out.print("\n");
        String current = null;
        String negation = null;
        for(int i=0; i<decisionList.size(); i++){
            current = decisionList.get(i);
            negation = current.replace("in", "not in");
            if(i < decisionList.size() - 1 && decisionList.get(i+1).equals(negation)){

            }
            else{
                System.out.print(current);
                if(i< decisionList.size() -1){
                    System.out.print(separator2);
                }
            }
        }
    }

}
