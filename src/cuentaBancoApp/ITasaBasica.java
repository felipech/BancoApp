package cuentaBancoApp;

public interface ITasaBasica {

    default double obtenerTasaBase(){
        return 2.5;
    }
}
