/**
 * Created by pepe_ on 30/03/2017.
 */


public class Electrodomesticos {
    public String marca;
    public String modelo;
    public double precioBase;
    public char consumo;
    public double altura;
    public double anchura;
    public double peso;
    public double precioTotal = pvp();

    /**
     * Metodo para calcular el precio bruto en funcion del consumo del electrodomestico
     * @return precio bruto
     */
    public double precioBruto(){
        double precioBruto=0;
        if (consumo == 'A') {
            precioBruto= this.precioBase + 100;
        }
        else if (consumo == 'B'){
            precioBruto= this.precioBase + 80;
        }
        else if (consumo == 'C'){
            precioBruto= this.precioBase + 60;
        }
        else if (consumo == 'D'){
            precioBruto= this.precioBase + 50;
        }
        else if (consumo == 'E'){
            precioBruto= this.precioBase + 30;
        }
        else if (consumo == 'F'){
            precioBruto= this.precioBase + 10;
        }
        return precioBruto;
    }

    /**
     * Metodo para calcular el precio que conlleva transportar el producto en funcion de su peso
     * @return el precio a pagar extra
     */
    public double precioTransporte(){
        double precioTransporte=0;
        if (peso>=0 && peso <20) {
            precioTransporte= 10;
        }
        else if (peso>=20 && peso <= 50){
            precioTransporte= 50;
        }
        else if (peso>=50 && peso <= 80){
            precioTransporte= 80;
        }
        else if (peso> 80) {
            precioTransporte = 100;
        }
        return precioTransporte;

    }

    /**
     * Metodo para calcular el precio de venta al publico
     * @return el precio de venta al publico
     */
    public double pvp(){

        return  precioBruto() + precioTransporte();

    }

    /**
     * Metodo para diferenciar entre 1 metro o varios metros
     * @return un string con dicha diferencia
     */
    public String altura(){
        String resultado="";
        if (this.altura == 1) {
            resultado= this.altura + " Metro";
        }
        else{
            resultado = this.altura + "Metros";
        }
        return resultado;
    }
    /**
     * Metodo para diferenciar entre 1 metro o varios metros
     * @return un string con dicha diferencia
     */
    public String anchura(){
        String resultado="";
        if (this.anchura == 1) {
            resultado= this.anchura + " Metro";
        }
        else{
            resultado = this.anchura + "Metros";
        }
        return resultado;
    }
    public String precioBase(){
        String resultado=this.precioBase() + " €";
        return resultado;
    }
    public String peso(){
        String resultado= this.peso + " kg.";
        return resultado;
    }

    public Electrodomesticos() {
    }

    public Electrodomesticos(String marca, String modelo, double precioBase,char consumo, double altura, double anchura, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
        this.consumo = consumo;
        this.altura = altura;
        this.anchura = anchura;
        this.peso = peso;
    }



    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase < 0) {
            this.precioBase = 0;
        } else {
            this.precioBase = precioBase;
        }
    }

    public char getConsumo(){
        return consumo;
    }


    public void setConsumo(char consumo){
        consumo = Character.toUpperCase(consumo);
        if (consumo == 'A') {
            this.consumo = consumo;
        }
        else if (consumo == 'B'){
            this.consumo = consumo;
        }
        else if (consumo == 'C'){
            this.consumo = consumo;
        }
        else if (consumo == 'D'){
            this.consumo = consumo;
        }
        else if (consumo == 'E'){
            this.consumo = consumo;
        }
        else if (consumo == 'F'){
            this.consumo = consumo;
        }
        else{
            char aleatorio[] = {'A','B','C','D','E','F'};
            this.consumo= aleatorio[(int) (Math.random()*6)];
        }

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <0) {
            this.altura = 0;
        } else {
            this.altura = altura;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        if (anchura < 0) {
            this.anchura = 0;
        } else {
            this.anchura = anchura;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0) {
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }

    public String toString() {
        String resultado="";
        resultado+= "Marca: " + this.marca + "\n";
        resultado+= "Modelo: " + this.modelo + "\n";
        resultado+= "Precio Base: " + precioBase() + "\n";
        resultado+= "Consumo Electrico: " + this.consumo + "\n";
        resultado+= "Altura: " + altura() + "\n";
        resultado+= "Anchura: " + anchura() + "\n";
        resultado+= "Peso: " + peso() + "\n";
        resultado+= "Precio Bruto: " + precioBruto() + " €" + "\n";
        resultado+= "Precio Transporte: " + precioTransporte() + " €" + "\n";
        resultado+= "PVP: " + pvp() + " €" + "\n";


        return resultado;
    }
}
