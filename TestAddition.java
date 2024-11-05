import org.junit.Test;
import org.junit.Assert;

public class TestAddition {
    @Test
    public static void main(String[] args) {

        Expression deux = new Nombre(2); // création d'un objet de type Expression avec le constructeur de la classe Nombre

		Expression trois = new Nombre(3); // création d'un objet de type Expression avec le constructeur de la classe Nombre

		Expression a = new Addition(deux, trois);
    
    	assertEquals(a.toString(),"Résultat de 2 + 3 : 5");

    	System.out.println("Lets goooo");
	}
}
