
package javaapplication11;


public class Calculadora {
    
  
   /*  public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;
    
    //Constructor de la calse
    public Calculadora(String propietario){
        this.tipoCalculadora="Calculadora Básica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Azul";
        this.nombrePropietario=propietario;
    }*/
   
    
    //Constructor vacio
    public Calculadora(){
    }
    
    //Are de declaración de metodos
    //en clase hemos dicho "funciones" anteriormente, pero en POO son metodos.
    public int sumar(int primerNumero, int segundoNumero ){
        int resultado;
        resultado= primerNumero + segundoNumero;
        return resultado;
    }
    
    public int restar(int primerNumero, int segundoNumero){
        int resultado;
        resultado = primerNumero - segundoNumero;
        return resultado;
    }
    
    public int multiplicar(int primerNumero, int segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        if(contador == 2){
            return true;
        }else{
            return false;
        }
    } 
    }




    

