public class Automovil {
    String marca;
    int modelo;
    double motor;
    int numeroPuertas;
    int CantidadAsientos;
    double velocidadMaxima;
    double velocidadActual=0;
    enum tipoComb{
        GASOLINA,BIOGASOLINA,DISEL,BIODISEL,GAS_NATURAL
    }
    tipoComb tipoCombustible;
    enum tipoAuto{
        SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }
    tipoAuto tipoAutomovil;
    enum tipoColor{
        BLANCO, NEGRO, ROJO, AMARILLO, NARANJA, VERDE, AZUL, VIOLETA
    }
    tipoColor color;
    public Automovil(String marca, int modelo, double motor, int numeroPuertas, int cantidadAsientos,
            double velocidadMaxima, Automovil.tipoComb tipoCombustible,
            Automovil.tipoAuto tipoAutomovil, Automovil.tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        CantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.color = color;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
    public int getCantidadAsientos() {
        return CantidadAsientos;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        CantidadAsientos = cantidadAsientos;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    public tipoComb getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(tipoComb tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public tipoAuto getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(tipoAuto tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    public tipoColor getColor() {
        return color;
    }
    public void setColor(tipoColor color) {
        this.color = color;
    }
    void acelerar(int incrementoVelocidad){
        if ((velocidadActual+incrementoVelocidad)<velocidadMaxima) {
        velocidadActual=velocidadActual+incrementoVelocidad;            
        } else {
            System.out.println("No puede incrementar a un velocidad superior a la maxima");
        }
    }
    void desacelerar(int decrementoVelocidad){
        if ((velocidadActual-decrementoVelocidad)>0) {
            velocidadActual=velocidadActual-decrementoVelocidad;
        } else {
            System.out.println("No se puede desacelerar por debajo de 0");
        }
    }
    void frenar(){
        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
    void imprimir(){
        System.out.println("marca ="+marca);
        System.out.println("modelo ="+modelo);
        System.out.println("motor ="+motor);
        System.out.println("Tipo de combustible ="+tipoCombustible);
        System.out.println("Tipo de automovil ="+tipoAutomovil);
        System.out.println("Numero de puertas ="+numeroPuertas);
        System.out.println("Cantidad de asientos ="+CantidadAsientos);
        System.out.println("Velocidad maxima ="+velocidadMaxima);
        System.out.println("color ="+color);
    }
    public static void main (String []args){
        Automovil auto1 = new Automovil("ford", 2014, 2, 5, 5, 250, tipoComb.GASOLINA, tipoAuto.COMPACTO, tipoColor.NEGRO);
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual ="+auto1.velocidadActual);
        auto1.acelerar(20);
        System.out.println("Velocidad actual ="+auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual ="+auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual ="+auto1.velocidadActual);
        auto1.desacelerar(10);
        System.out.println("Velocidad Actual ="+auto1.velocidadActual);
    }
}

