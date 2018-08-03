package org.tree.model;

public class PredictionFileNode {
    int key;
    private PredictionFileNode inZeroNode;
    private PredictionFileNode inOneNode;
    private PredictionFileNode notInZeroNode;
    private PredictionFileNode notInOneNode;
    float value;
    int level;

    public PredictionFileNode getInZeroNode() {
        return inZeroNode;
    }

    public void setInZeroNode(PredictionFileNode inZeroNode) {
        this.inZeroNode = inZeroNode;
    }

    public PredictionFileNode getInOneNode() {
        return inOneNode;
    }

    public void setInOneNode(PredictionFileNode inOneNode) {
        this.inOneNode = inOneNode;
    }

    public PredictionFileNode getNotInZeroNode() {
        return notInZeroNode;
    }

    public void setNotInZeroNode(PredictionFileNode notInZeroNode) {
        this.notInZeroNode = notInZeroNode;
    }

    public PredictionFileNode getNotInOneNode() {
        return notInOneNode;
    }

    public void setNotInOneNode(PredictionFileNode notInOneNode) {
        this.notInOneNode = notInOneNode;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }


    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
