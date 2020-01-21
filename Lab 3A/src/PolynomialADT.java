//Donark Patel
//CSC 236
//Lab 3A
//Date: 10/14/2018
//This application adds polynomial

public interface PolynomialADT {
    public PolyNode getFirstNode();

    public void setFirstNode(PolyNode firstNode);
    public void addPolyNodeFirst(int coefficient, int exp);
    public void addPolyNodeLast(int coefficient, int exp);

    public Polynomial addPolynomials(Polynomial toAdd);

    public boolean isEmpty();
    public String toString();

}
