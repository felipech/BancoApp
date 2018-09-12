package cuentaBancoApp;

import java.util.LinkedList;
import java.util.List;

public class MainCuentaBancoApp {

    public static void main(String [] args ){
        /*
        CuentaCorriente comprobacion = new CuentaCorriente("Felipe Choque", "177405396", 100);
        Ahorro ahorro = new Ahorro("Patricio Choque", "112325486", 200);

        comprobacion.mostrarInformacion();
        ahorro.inCompuesto();
        ahorro.mostrarInformacion();
        */
        /*ahorro.depostio(1000);
        ahorro.retirar(120);
        ahorro.transferir("Papá", 500);*/

        List<Cuenta> listaCuentas = new LinkedList<>();

        //leer el archivo csv

        String archivo = "NewBankAccounts.csv";
        List<String[]> list = utlitario.CSV.leer(archivo);
        for (String[] cuentas: list) {
            //System.out.println("Cuenta nueva: ");
            String nombre = cuentas[0];
            String rut = cuentas[1];
            String tipo = cuentas[2];
            int depositoInicial = Integer.parseInt(cuentas[3]);

            if (tipo.equals("Savings")){
                //System.out.println("Cuenta ahorro");
                listaCuentas.add(new Ahorro(nombre,rut,depositoInicial));
            }else if (tipo.equals("Checking")){
                //System.out.println("Cuenta corriente");
                listaCuentas.add(new CuentaCorriente(nombre,rut,depositoInicial));
            }else {
                System.out.println("Error al leer el tipo de cuenta");
            }
        }

        listaCuentas.get(5).mostrarInformacion();


    }

}
