package com.company;

public class Transition {
    private final Double weight;
    private final Node start;
    private Node end;
    private Output output;
    public Transition(Double weight, Node start, Node end){
        this.weight = weight;
        this.start = start;
        this.end = end;
    }
    public Transition(Double weight, Node start, Output result){
        this.weight = weight;
        this.start = start;
        this.output = result;
    }
    public Double getWeight(){
        return this.weight;
    }
    public Node getStart(){
        return this.start;
    }
    public Node getEnd(){
        return this.end;
    }
    public Output getOutput(){return this.output;}
}

