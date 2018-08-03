package org.tree.model;

import java.util.ArrayList;

public class PredictionObject {

    String name;
    ArrayList<PredictionObject> children;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<PredictionObject> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<PredictionObject> children) {
        this.children = children;
    }
}
