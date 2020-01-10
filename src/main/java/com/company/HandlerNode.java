package com.company;


public class HandlerNode {

    public DslStatusNode getDslStatusNode() {
        return dslStatusNode;
    }

    public DslStatisticsNode getDslStatisticsNode() {
        return dslStatisticsNode;
    }

    private DslStatusNode dslStatusNode =new DslStatusNode();
    private DslStatisticsNode dslStatisticsNode=new DslStatisticsNode();



    }

