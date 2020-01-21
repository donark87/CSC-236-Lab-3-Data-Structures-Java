//Donark Patel
//CSC 236
//Lab 3A
//Date: 10/14/2018
//This application adds polynomial
import com.sun.scenario.effect.LinearConvolveCoreEffect;

import javax.swing.text.html.parser.AttributeList;

public class Polynomial implements PolynomialADT {
    private PolyNode firstNode;
    int coefficient;
    int exponent;
    public Polynomial(){
        this.firstNode = null;
    }
    public Polynomial(PolyNode firstNode) {
        this.firstNode = firstNode;
    }

    public PolyNode getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(PolyNode firstNode) {
        this.firstNode = firstNode;
    }
    public void addPolyNodeFirst(int coefficient, int exp){
        if(this.isEmpty())
                setFirstNode(new PolyNode(coefficient,exp, null));
        else
            setFirstNode(new PolyNode(coefficient,exp,getFirstNode()));
    }
    public void addPolyNodeLast(int coefficient, int exp){
        if(this.isEmpty())
            setFirstNode(new PolyNode(coefficient,exp, null));
        else {
            PolyNode current = getFirstNode();

            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new PolyNode(coefficient, exp, null));
        }
    }

    public Polynomial addPolynomials(Polynomial toAdd)
    {
        Polynomial sum = new Polynomial();

        PolyNode current1 = this.getFirstNode();

        PolyNode current2 = toAdd.getFirstNode();

        PolyNode sumCurrent = sum.getFirstNode();

        while(current1 != null || current2 != null)
        {
            if(current1.getExponent() == current2.getExponent())
            {
                sum.addPolyNodeLast(current1.getCoefficient()+ current2.getCoefficient(),
                        current1.getExponent());
                current1 = current1.getNext();
                current2 = current2.getNext();
            }
            else if(current1.getExponent() > current2.getExponent()
                    || current2 == null && current1 != null)
            {
                sum.addPolyNodeLast(current1.getCoefficient(),current1.getExponent());
                current1 = current1.getNext();
            }
            else if(current1.getExponent() < current2.getExponent()
                    || current1 == null && current2 != null)
            {
                sum.addPolyNodeLast(current2.getCoefficient(),current2.getExponent());
                current2 = current2.getNext();
            }
        }
        return sum;
    }
    public boolean isEmpty(){
        return getFirstNode() == null;
    }
    public String toString()
    {
        String TheString = "Nothing in this polynomial yet.";
        final String ADDITION = " + ";
        final String SUBTRACTION = " - ";

        PolyNode Current = this.getFirstNode();

        if (!(this.isEmpty()))
        {
            TheString = Current.toString();
            while (Current.getNext() != null)
            {
                if (Current.getNext().getCoefficient() < 0)
                {
                    TheString += SUBTRACTION + Current.getNext().toString().substring(1);
                }
                else if (Current.getNext().getCoefficient() > 0)
                {
                    TheString += ADDITION + Current.getNext().toString();
                }
                Current = Current.getNext();
            }
        }
        return TheString;
    }
}
