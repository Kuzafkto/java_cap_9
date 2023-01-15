package Ejercicio9;

import java.text.DecimalFormat;
import Ejercicio8.Terminal;

public class Movil extends Terminal {
    private String tarifa;
    private double total;

    public Movil() {
        super();
        this.tarifa = "rata";
        this.total = 0.06;
    }

    public Movil(String n) {
        super(n);
        this.tarifa = "rata";
        this.total = 0.06;
    }

    public Movil(String n, String t) {
        super(n);
        this.tarifa = t;
    }

    @Override/*Se le hace override a exactamente la misma funcion pero se le agregan los cambios que conlleva movil (el saldo) */
    public void llama(Terminal t, int s) {
        super.llama(t, s);
        double minutos = (double) s / 60;
        switch (this.tarifa) {
            case "rata":
                this.total += minutos * 0.06;
                break;
            case "mono":
                this.total += minutos * 0.12;
                break;
            case "bisonte":
                this.total += minutos * 0.30;
                break;
            default:
                System.out.println("Tiene una tarifa incorrecta");
                break;
        }
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nº " + this.num + " - " + this.time + "s de conversación - tarificados " + formatoEuros.format(this.total) + "";
    }
}
