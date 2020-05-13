package com.company;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        //Create empty transition lists
        ArrayList<Transition> emptyTransitionList0 = new ArrayList<Transition>();
        ArrayList<Transition> emptyTransitionList1 = new ArrayList<Transition>();
        ArrayList<Transition> emptyTransitionList2 = new ArrayList<Transition>();
        ArrayList<Transition> emptyTransitionList3 = new ArrayList<Transition>();
        ArrayList<Transition> emptyTransitionList4 = new ArrayList<Transition>();
        ArrayList<Transition> emptyTransitionList5 = new ArrayList<Transition>();
        ArrayList<Transition> emptyTransitionList6 = new ArrayList<Transition>();

        //Create the nodes
        Node node0 = new Node("node0", emptyTransitionList0);
        Node node1 = new Node("node1", emptyTransitionList1);
        Node node2 = new Node("node2", emptyTransitionList2);
        Node node3 = new Node("node3", emptyTransitionList3);
        Node node4 = new Node("node4", emptyTransitionList4);
        Node node5 = new Node("node5", emptyTransitionList5);
        Node node6 = new Node("node6", emptyTransitionList6);

        //Create the output (results)
        Output one = new Output("One");
        Output two = new Output("Two");
        Output three = new Output("Three");
        Output four = new Output("Four");
        Output five = new Output("Five");
        Output six = new Output("Six");

        //Create the transitions Node to Node
        Transition transition01 = new Transition(0.5, node0, node1);
        Transition transition02 = new Transition(0.5, node0, node2);
        Transition transition13 = new Transition(0.5, node1, node3);
        Transition transition14 = new Transition(0.5, node1, node4);
        Transition transition25 = new Transition(0.5, node2, node5);
        Transition transition26 = new Transition(0.5, node2, node6);
        Transition transition31 = new Transition(0.5, node3, node1);
        Transition transition62 = new Transition(0.5, node6, node2);

        //Create the transitions Node to Output
        Transition transition3one = new Transition(0.5, node3, one);
        Transition transition4two = new Transition(0.5, node4, two);
        Transition transition4three = new Transition(0.5, node4, three);
        Transition transition5four = new Transition(0.5, node5, four);
        Transition transition5five = new Transition(0.5, node5, five);
        Transition transition6six = new Transition(0.5, node6, six);

        //Add transitions to Nodes
        node0.addTransition(transition01);
        node0.addTransition(transition02);
        node1.addTransition(transition13);
        node1.addTransition(transition14);
        node2.addTransition(transition25);
        node2.addTransition(transition26);
        node3.addTransition(transition31);
        node3.addTransition(transition3one);
        node4.addTransition(transition4two);
        node4.addTransition(transition4three);
        node5.addTransition(transition5four);
        node5.addTransition(transition5five);
        node6.addTransition(transition62);
        node6.addTransition(transition6six);

        //Create Monte Carlo Machine
        MCM monteCarloMachine = new MCM(node0);
        System.out.println(monteCarloMachine.run());
    }
}
