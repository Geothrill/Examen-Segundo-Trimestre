/**
 * Created by pepe_ on 30/03/2017.
 */
public class Lavadora extends Electrodomesticos {
    private String tipoCarga;
    private int centrifugado;
    private String secadora;
    private Double precio = this.pvp();


    private double ingresoTotalLavadoras(Double... precio){
        Double total = 0.0;
        for (Double cantidad: precio){
            total += cantidad;

        }
        return total;
    }

    private String centrifugado(){
        return this.centrifugado + " RPM";
    }

    public Lavadora(String marca,
                    String modelo,
                    double precioBase,
                    char consumo,
                    double altura,
                    double anchura,
                    double peso,
                    String tipoCarga,
                    int centrifugado,
                    String secadora) {
        super(marca, modelo, precioBase, consumo, altura, anchura, peso);
        this.tipoCarga = tipoCarga;
        this.centrifugado = centrifugado;
        this.secadora = secadora;
    }

    public Lavadora() {
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        String upper = tipoCarga.toUpperCase();
        upper =  upper.replaceAll("\\s","");

        if (upper == "FRONTAL"){
            this.tipoCarga = upper;
        }
        else if (upper == "SUPERIOR"){
            this.tipoCarga = upper;
        }
        else{
            String carga[] ={"FRONTAL","SUPERIOR"};
            this.tipoCarga = carga[(int) (Math.random()*2)];
        }
    }

    public int getCentrifugado() {
        return centrifugado;
    }

    public void setCentrifugado(int centrifugado) {
        this.centrifugado = centrifugado;
    }

    public String getSecadora() {
        return secadora;
    }

    public void setSecadora(String secadora) {
        String upper = secadora.toUpperCase();
        upper =  upper.replaceAll("\\s","");

        if (upper == "SI"){
            this.secadora = upper;
        }
        else if (upper == "NO"){
            this.secadora = upper;
        }
        else{
            String carga[] ={"SI","NO"};
            this.secadora = carga[(int) (Math.random()*2)];
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += super.toString();
        resultado += "Tipo de carga: " + this.tipoCarga;
        resultado += "Velocidad de centrifugado: " + centrifugado();
        resultado += "Tiene funcion secadora: " + this.secadora;
        return resultado;
    }
}
