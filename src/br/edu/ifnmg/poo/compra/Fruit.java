package br.edu.ifnmg.poo.compra;

import br.edu.ifnmg.poo.compra.ItemElement;

/**
 *
 * @author exemplo internet
 */
public class Fruit implements ItemElement {
    private int pricePerKg;
    private int weight;
    private String name;
    
    
    // <editor-fold defaultstate="colapsed" desc="Gettters and setters">
    public int getPricePerKg() {
        return pricePerKg;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public String getName(){
        return this.name;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }
    //</editor-fold>

   // <editor-fold defaultstate="colapsed" desc="Construtor">
    public Fruit(int priceKg, int wt, String nm){
        this.pricePerKg=priceKg;
        this.weight=wt;
        this.name = nm;
    
    }
    //</editor-fold>

    
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

}