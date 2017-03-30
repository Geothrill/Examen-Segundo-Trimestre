/**
 * Created by pepe_ on 30/03/2017.
 */
public class Frigorifico extends Electrodomesticos {
    private double capTotal;
    private double capCongelador;
    private double precio = pvp();

    public double ingresoTotalFrigorifico(Double... precio){
        Double total = 0.0;
        for (Double cantidad: precio){
            total += cantidad;
        }
        return total;}

    public Frigorifico() {
    }

    public Frigorifico(String marca,
                       String modelo,
                       double precioBase,
                       char consumo,
                       double altura,
                       double anchura,
                       double peso,
                       double capTotal,
                       double capCongelador) {
        super(marca, modelo, precioBase, consumo, altura, anchura, peso);
        this.capTotal = capTotal;
        this.capCongelador = capCongelador;
    }

    public double getCapTotal() {
        return capTotal;
    }

    public void setCapTotal(double capTotal) {
        this.capTotal = capTotal;
    }

    public double getCapCongelador() {
        return capCongelador;
    }

    public void setCapCongelador(double capCongelador) {
        this.capCongelador = capCongelador;
    }

    public String toString(){
        String resultado="";
        resultado+= super.toString();
        resultado+= "Capacidad total: " + this.capTotal + " L";
        resultado+= "Capacidad del congelador: " + this.capCongelador + " L";
        return resultado;
    }
}
