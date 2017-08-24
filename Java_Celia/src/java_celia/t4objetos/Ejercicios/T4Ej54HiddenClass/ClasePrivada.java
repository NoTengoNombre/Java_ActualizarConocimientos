/**
 * @created on : 24-ago-2017, 22:52:50
 * @see
 * @since
 * @version
 * @author Raul Vela Salas
 */
package java_celia.t4objetos.Ejercicios.T4Ej54HiddenClass;

class ClasePrivada implements InterfazPublico {

    @Override
    public void getString(String s) {
        System.out.println(s);
    }

    @Override
    public void getNumero(int n) {
        System.out.println(n);
    }

    @Override
    public void getDecimal(double d) {
        System.out.println(d);
    }

    @Override
    public void getBoolean(boolean b) {
        System.out.println(b);
    }

    @Override
    public void getVer() {
        System.out.println("Ver ");
        this.getBoolean(FALSO);
        this.getNumero(NUMERO);
        this.getDecimal(DECIMAL);
        this.getString(MENSAJE);
    }

}
