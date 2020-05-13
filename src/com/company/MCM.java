package com.company;

import java.util.ArrayList;
import java.util.Random;

public class MCM {
    private Node startNode;
    public MCM(Node StartNode){
        this.startNode = StartNode;
    }
    public Transition getRandomElement(ArrayList<Transition> list)
    {
        Random rand = new Random();
        return list.get(new Random().nextInt(list.size()));
    }
    public String run(){
        Node currNode = this.startNode;
        while (true){
            Transition chosenTransition = getRandomElement(currNode.getTransitions());
            if (chosenTransition.getOutput() != null){
                return chosenTransition.getOutput().getResult();
            }
            else {
                currNode = chosenTransition.getEnd();
            }
        }
    }
}
