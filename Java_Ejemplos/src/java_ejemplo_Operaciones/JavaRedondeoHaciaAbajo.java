/**
 * @created on : 02-ago-2017, 13:24:32
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_ejemplo_Operaciones;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaRedondeoHaciaAbajo {

    public static void main(String[] args) {
        BigDecimal positiveDecimal = new BigDecimal("2.5");
        BigDecimal positiveRedondeado = positiveDecimal.setScale(0, RoundingMode.DOWN);
        System.out.println("Decimal positivo: " + positiveDecimal);
        System.out.println("Decimal redondeado: " + positiveRedondeado);
    }
}
