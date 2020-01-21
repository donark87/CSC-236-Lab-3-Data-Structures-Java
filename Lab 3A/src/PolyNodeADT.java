//Donark Patel
//CSC 236
//Lab 3A
//Date: 10/14/2018
//This application adds polynomial

public interface PolyNodeADT {
    public int getCoefficient();

    public int getExponent();

    public void setCoefficient(int coefficient);

    public void setExponent(int exponent);
    public PolyNode getNext();
    public void setNext(PolyNode l);

    public String toString();
}
