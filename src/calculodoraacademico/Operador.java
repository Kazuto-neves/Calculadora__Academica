/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodoraacademico;

/**
 *
 * @author usuario
 */
public class Operador {
    public double Somar(double n1, double n2){return n1 + n2;}
    public double Subitrair(double n1, double n2){return n1 - n2;}
    public double Multiplicar(double n1, double n2){return n1 * n2;}
    public double Dividir(double n1, double n2){return n1 / n2;}
    public double Resto(double n1, double n2){return n1 % n2;}
    public double Inverter(double n1){return n1*-1;}
    public double Raiz(double n1){return Math.sqrt(n1);}
    public double Potencia_2(double n1){return Math.pow(n1, 2);}
    public double Potencia_N(double n1, double n2){return Math.pow(n1, n2);}
    public double Porcentagem(double n1,double n2){return ((n1*100)/n2);}
}
