///ESTEFANIA VILLEGAS BARCENAS



package mx.edu.cesba;

import java.util.Scanner;

public class Matematicas
{
    public static void main(String[] args){
    Scanner variables = new Scanner(System.in);
    
   int Funciones ;
 
    
 System.out.println("En este  programa te dara un menu de opciones y cada uno realizra  una operacion correspondiente");
 System.out.println("*");
 System.out.println("1 para el area del circulo");
 System.out.println("2 rendondear para arriba");
 System.out.println("3 mumero se redondea hacia abajo");
 System.out.println("4 redondear al mas cercano");
 System.out.println("5 Elevar potencia");
 System.out.println("6 sacara la raiz cuadrada");
 System.out.println("7 sacara la raiz cubica");
 System.out.println("8 sin,cos y tan");
 System.out.println ("9 Numero aleatorio entre 0 y 1: ");
 
  Funciones = variables.nextInt();
 
        switch (Funciones) {
            case 1:
               System.out.println("Ingrese el radio para saber el area del circulo");
               double radio;
              radio = variables.nextDouble(); 
              double area = Math.PI * Math.pow(radio, 2);//el valor del radio al cuadrado con math.pow en un lugar se pone el valor y el otro a la potencia que se quiera elevar
              System.out.println ("El area del circulo con radio "+radio+" es: "+area);
                break;
                
            case 2:
                System.out.println("Ingrese el mumero que quiere redondear hacia arriba");
                double numero;
                numero = variables.nextDouble();
                double resultado = Math.ceil(numero);          //Sirve para redondear un numero hacia arriba
                 System.out.println("Redondeando hacia arriba el numero " +numero+ " es:"+resultado);
              
                break;
            case 3:
                 System.out.println("Ingrese el mumero que quiere redondear hacia abajo");
                double numer;
                numer = variables.nextDouble();
                double resultad = Math.floor(numer);
                 System.out.println ("Redondea hacia abajo el numero "+numer+" es:"+resultad);
              
                break;
            case 4:
                System.out.println("Ingrese el numero que se redondeara al mas cercano");
                double nume;
                nume = variables.nextDouble();
                double resulta = Math.round(nume);                                       //Redonde al numero mas cercano.
                System.out.println ("Redondea al numero mas cercano "+nume+" es:"+resulta);
                
                break;
            case 5:
                System.out.println("");
                double base;
                double exponente;
                System.out.println("De una base");
                base = variables.nextDouble();
                System.out.println("De un exponente");
                exponente = variables.nextDouble();
                
             double resul = Math.pow(base,exponente);                                 
             System.out.println ("Para numeros elevados "+base +" Al exponente " + exponente +" es:"+resul);
                
                break;
            case 6:
                System.out.println("Da un numero al que se le sacara la raiz");
                double num;
                num = variables.nextDouble();
                double re = Math.sqrt(num);                          //Raiz cuadrada.
                System.out.println("Raiz cuadrada de "+num+" es:"+re);
               
                break;
            case 7:
                System.out.println("Da un numero al que se le sacara la raiz cubica");
              
                double n;
                n = variables.nextDouble();
                double r = Math.cbrt(n);                         //Raiz cubica.
                System.out.println ("Raiz cubica de "+n+" es:"+r);
               
                break;
                
            case 8:
             System.out.println("Da el numero al que se le sacara sin,cos y tan");
              
             double ta;
             ta = variables.nextDouble();   
             double angulo = Math.toRadians(ta); //Convertimos a 45 grados
             double seno = Math.sin(angulo); 
             double cos = Math.cos(angulo);
             double tan = Math.tan(angulo);                                  //Para grados.
             System.out.println("Seno de 45 grados:" + seno);
             System.out.println("coseno de 45 grados:" + cos);
             System.out.println("tangente de 45 grados:" + tan);
               
            break;  
            
             case 9:
                 double aleatorio = Math.random();                    //Numero aleatorio entre el 0 y 1.
                 System.out.println ("Numero aleatorio entre 0 y 1: "+aleatorio);
               
                break;
               
            
            default:
               
                break;
        }

       
}
}