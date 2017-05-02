package com.genband.hazelcast.server.model;

public class ExampleModel {

    private String attributeA;
    private String attributeB;
    private int attributeC;
    private ExampleSubModel attributeD;

    public String getAttributeA() {
        return attributeA;
    }

    public void setAttributeA(String attributeA) {
        this.attributeA = attributeA;
    }

    public String getAttributeB() {
        return attributeB;
    }

    public void setAttributeB(String attributeB) {
        this.attributeB = attributeB;
    }

    public int getAttributeC() {
        return attributeC;
    }

    public void setAttributeC(int attributeC) {
        this.attributeC = attributeC;
    }

    public ExampleSubModel getAttributeD() {
        return attributeD;
    }

    public void setAttributeD(ExampleSubModel attributeD) {
        this.attributeD = attributeD;
    }

    @Override
    public String toString() {
        return "ExampleModel [attributeA=" + attributeA + ", attributeB=" + attributeB + ", attributeC=" + attributeC
                + ", attributeD=" + attributeD + "]";
    }

}
