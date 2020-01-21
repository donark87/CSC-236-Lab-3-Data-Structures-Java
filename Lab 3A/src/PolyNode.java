//Donark Patel
//CSC 236
//Lab 3A
//Date: 10/14/2018
//This application adds polynomial

public class PolyNode {
    private int coefficient;
    private int exponent;
    PolyNode link;

    public PolyNode() {
        coefficient = 0;
        exponent = 0;
        link = null;
    }

    public PolyNode(int coefficient, int exponent, PolyNode link) {
        this.coefficient = coefficient;
        this.exponent = exponent;
        this.link = link;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }
    public PolyNode getNext()
    {
        return link;
    }
    public void setNext(PolyNode l)
    {
        link = l;
    }

    public String toString()
    {
        String str = "";

        if(exponent > 0 )
        {
            str = coefficient + "x^" + exponent;

        }
        else if(exponent == 0 )
        {
            str = ("" + getCoefficient());

        }
        return str;
    }
}
