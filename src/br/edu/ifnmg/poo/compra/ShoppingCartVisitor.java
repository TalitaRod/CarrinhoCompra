package br.edu.ifnmg.poo.compra;

/**
 *
 * @author exemplo internet
 */
public interface ShoppingCartVisitor {

	int visit(Book book);
	int visit(Fruit fruit);
}