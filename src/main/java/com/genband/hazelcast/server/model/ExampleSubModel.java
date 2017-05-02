package com.genband.hazelcast.server.model;

public class ExampleSubModel {
    private String attrA;
    private String attrB;

    public String getAttrA() {
        return attrA;
    }

    public void setAttrA(String attrA) {
        this.attrA = attrA;
    }

    public String getAttrB() {
        return attrB;
    }

    public void setAttrB(String attrB) {
        this.attrB = attrB;
    }

    @Override
    public String toString() {
        return "ExampleSubModel [attrA=" + attrA + ", attrB=" + attrB + "]";
    }
    
    

}
