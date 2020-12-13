package br.edu.ifnmg.poo.compra;

import br.edu.ifnmg.poo.compra.ItemElement;

/**
 *
 * @author exemplo internet
 */
public class Book implements ItemElement {
    private int price;
    private String isbnNumber;

    
    // <editor-fold defaultstate="colapsed" desc="Gettters and setters">

    public void setPrice(int price) {
        this.price = price;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    
    public int getPrice() {
		return price;
    }
    public String getIsbnNumber() {
		return isbnNumber;
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="colapsed" desc="Construtor">
    public Book(int cost, String isbn){
		this.price=cost;
		this.isbnNumber=isbn;
    }
    //</editor-fold>
    
    @Override
    public int accept(ShoppingCartVisitor visitor) {
		return visitor.visit(this);
    }

}