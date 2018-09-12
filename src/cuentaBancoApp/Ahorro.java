package cuentaBancoApp;

public class Ahorro extends Cuenta {
    private int numCajaDeposito;
    private int keyNumCajaDeposito;

    public Ahorro(String nombre, String rut, int depositoInicial){
        //el super tienee que ir primero
        super(nombre, rut, depositoInicial);
        //System.out.println("Cuenta Ahorro: ");
        numerCuenta = "1" + numerCuenta;
        //System.out.println("Numero Cuenta: " + numerCuenta);
        generarIDCajaDeposito();
        generarKeyNumCajaDeposito();

    }

    private void generarIDCajaDeposito(){
        numCajaDeposito = (int) (Math.random() * Math.pow(10,3));
    }
    private void generarKeyNumCajaDeposito(){
        keyNumCajaDeposito = (int) (Math.random() * Math.pow(10,4));
    }

    public void asignarTasa(){
        tasa = obtenerTasaBase() - 0.25;
    }

    public void mostrarInformacion(){
        //uso super para llamar al metodo de la clase abstracta y luego imprimo info relevante a cada
        //tipo de cuenta
        System.out.println("Tipo: Cuenta de Ahorro");
        //metodo de la clase abstracta
        super.mostrarInformacion();
        System.out.println("numero caja: " + this.numCajaDeposito);
        System.out.println("Key caja: " + this.keyNumCajaDeposito);

    }
}
