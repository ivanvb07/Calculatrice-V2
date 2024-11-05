/**
 * 
 * Reportez vous également à la classe {@link Object}
 * @author : Ivan Veljovic Bulatovic
 * 
 */

public class Addition extends Operation { // initialisation de la classe Addition héritant d'Operation

  /**
   * <p>Cette fonction est le constructeur par défaut de la classe qui fait appel à celui de la classe Operation</p>
   */
  public Addition() { // constructeur par défaut
    super(); // appel du constructeur par défaut de la classe Operation
  }

  /**
   * <p>Cette fonction est le constructeur champ-à-champ de la classe qui fait appel à celui de la classe Operation</p>
   * @param nb1 : objet de type Expression hérité de la classe Expression
   * @param nb2 : objet de type Expression hérité de la classe Expression
   */
  public Addition(Expression nb1, Expression nb2) { // constructeur champ-à-champ
    super(nb1, nb2); // appel du constructeur champ-à-champ de la classe Operation
  }

  /**
   * <p>Cette fonction est le constructeur par copie de la classe qui fait appel à celui de la classe Operation</p>
   * @param a : objet de type Operation hérité de la classe Operation
   */
  public Addition(Operation a) {// constructeur par copie
    super(a); // appel du constructeur par copie de la classe Operation
  }
  /**
   * <p>Cette fonction permet d'additionner les deux opérandes et de renvoyer le résultat</p>
   * @return  : objet de type double (nombre à virgule)
   */
  public double valeur() { // implémentation de la méthode abstraite valeur de la classe Expression
    return this.getOPerande1().valeur() + this.getOPerande2().valeur(); // renvoie la somme des valeurs des deux
                                                                        // opérandes
  }
  /**
   * <p>Cette fonction permet d'afficher le résultat avec du texte</p>
   * @return  : objet de type String (chaîne de caractères)
   */
  public String toString() { // méthode toString
    String ch = "Résultat de " + this.getOPerande1().valeur() + " + " +
        this.getOPerande2().valeur() + " : ";
    ch += this.valeur();
    return ch;
  }
}
