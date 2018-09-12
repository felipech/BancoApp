package cuentaBancoApp;

public class CuentaCorriente extends  Cuenta{

    private int numeroTarjetaDebito;
    private int pinTarjetaDebito;


    public CuentaCorriente (String nombre, String rut, int depositoInicial){
        super(nombre, rut, depositoInicial);
        //System.out.println("Cuenta Corriente: ");
        //dependiendo de el tipo de cuenta se pone un 0 o 1
        numerCuenta = "0" + numerCuenta;
        asignarTarjetaDebito();
        //System.out.println("Numero Cuenta: " + numerCuenta);
    }

    private void asignarTarjetaDebito(){
        numeroTarjetaDebito = (int) (Math.random() * Math.pow(10,12));
        pinTarjetaDebito = (int) (Math.random() * Math.pow(10,4));
        //System.out.println("Tarjeta de Debito: " + this.numeroTarjetaDebito);

    }
    //tasa para la cuenta corriente
    public void asignarTasa(){
        tasa = obtenerTasaBase() * 0.15;
    }

    public void mostrarInformacion(){
        System.out.println("Tipo: Cuenta Corriente");
        super.mostrarInformacion();
        System.out.println("Tu numero de tarjeta de debito es: " + this.numeroTarjetaDebito);
        System.out.println("Tu pin de tarjeta de debito es: " + this.pinTarjetaDebito);
        System.out.println();

    }


}
