public class Automovil {
    String marca;
    int modelo;
    double motor;
    int numeroPuertas;
    int CantidadAsientos;
    double velocidadMaxima;
    double velocidadActual;
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
            double velocidadMaxima, double velocidadActual, Automovil.tipoComb tipoCombustible,
            Automovil.tipoAuto tipoAutomovil, Automovil.tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.numeroPuertas = numeroPuertas;
        CantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
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
            System.out.println(x:"No puede incrementar a un velocidad superior a la maxima");
        }
    }
    void desacelerar(int decrementoVelocidad){
        if ((velocidadActual-decrementoVelocidad)>0) {
            velocidadActual=velocidadActual-decrementoVelocidad;
        } else {
            System.out.println(x:"No se puede desacelerar por debajo de 0");
        }
    }
    void frenar(){
        velocidadActual=0;
    }
    double calcularTiempoLlegada(int distancia){
        return distancia/velocidadActual;
    }
}
