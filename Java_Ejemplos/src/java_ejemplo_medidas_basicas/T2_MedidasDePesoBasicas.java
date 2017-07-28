package java_ejemplo_medidas_basicas;

/**
 * @created on : 16-jul-2017, 15:51:25
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
//package java_ejemplo_captura_teclado;
public class T2_MedidasDePesoBasicas {

    private double gramos;

    public T2_MedidasDePesoBasicas(double cantidad, String unidad) {
        if (unidad == "gr") {
            gramos = cantidad;
        }
        if (unidad == "kg") {
            gramos = cantidad * 1000;
        }
        if (unidad == "lb") {
            gramos = cantidad / 0.0022;
        }
        if (unidad == "oz") {
            gramos = cantidad / 0.0353;
        }

    }
    // Devuelve el peso en libras

    public double getLibras() {
        return gramos * 0.002205;
    }

    // Devuelve el peso en onzas
    public double getOnzas() {
        return gramos * 0.035274;
    }

    // Devuelve el peso en kilogramos
    public double getPeso() {
        return gramos / 1000;
    }

    // Devuelve el peso en gramos
    public double getGramos() {
        return gramos;
    }

}
