package cuentaBancoApp;

public abstract class Cuenta implements ITasaBasica {
    //public String nombre;
    private String nombre;
    private String rut;
    protected String numerCuenta;
    private double balance;
    protected double tasa;
    private static int index = 10000;

    public Cuenta(String nombre, String rut, int depositoInicial){
        this.nombre = nombre;
        this.rut = rut;
        balance = depositoInicial;
        index++;
        this.numerCuenta = asignarNumeroCuento();
        //llamo asignar tasa para que las clases hijas asignen la tasa correspondiente
        //sobreescribiendo el metodo
        asignarTasa();
    }

    private String asignarNumeroCuento(){
        //numero para agragar a los dos ultimos numeros del rut
        int cincoNumerosUnicos = index;
        //numero randoms
        int numeroRandom = (int) (Math.random() * Math.pow(10,3));

        return rut.substring((rut.length()-2)) + String.valueOf(cincoNumerosUnicos) + String.valueOf(numeroRandom);
    }

    /*public Cuenta(String nombre){
        System.out.println("Nombre Abastracto: " + nombre);
    }*/
    //metodos comunes
    public abstract void asignarTasa();


    public void depostio(double monto){
        balance = balance + monto;
        System.out.println("Deposito: $" + monto);
        imprimirBalance();
    }

    public void retirar(double montoRetiro){
        balance = balance - montoRetiro;
        System.out.println("Retiro: $" + montoRetiro);
        imprimirBalance();
    }

    public void transferir(String destinatario, double montoTranferir ){
        balance = balance - montoTranferir;
        System.out.println("Tansferir $" + montoTranferir + " a " + destinatario);
        imprimirBalance();
    }

    public void imprimirBalance(){
        System.out.println("Tu balance es: " + balance);
    }

    public void inCompuesto(){
        double interesCompuesto = balance * (tasa/100);
        System.out.println("Interes Compuesto: $" + interesCompuesto);
        balance = balance + interesCompuesto;
        imprimirBalance();
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre + " Rut " + rut + " Balance " + balance + " Numero de Cuenta " + numerCuenta
                + " Tasa " + tasa);
    }
}
