/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author BETSABE
 */
public class Personas {

    private Object[][] personas = new Object[1][7];
    private Object[][] datos = new Object[1][5];
    private Object[][] caluloIMC = new Object[1][7];
    int persona = 0;
    int cuantasPersonas;

    private String nombre = "";
    private int edad = 0;
    private char sexo = 'M';
    private double peso = 0;
    private double altura = 0;
    private int dui = 0;
    Random aleatorio = new Random();
    JTextArea hoja = new JTextArea();

    public Personas() {
    }

    public Personas(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dui = dui;
    }

    public Personas(String nombre, int edad, char sexo, double peso, double altura, int dui) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.dui = generarDui();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        // return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
        
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcuarIMC(double peso, double altura) {
        double IMC;
        IMC = (peso / (Math.pow(altura, 2)));
        if (IMC < 20) {
            JOptionPane.showMessageDialog(null, "IMC: -1");
            //return=-1;
        } else if (IMC >= 20 && IMC <= 25) {
            JOptionPane.showMessageDialog(null, "IMC: 0");
            //return 0;
        } else {
            JOptionPane.showMessageDialog(null, "IMC: 1");
            //return 1;
        }
    }

    private int generarDui() {
        int duiGenerado = aleatorio.nextInt(999999999);
        this.dui = duiGenerado;
        return dui;
    }

    public boolean MayorDeEdad(int edad) {
        if (edad >= 18) return true;
        return false;
    }

    private boolean verificarSexo(char sexo) {
        if (sexo == 'h' || sexo == 'm') return true;
        return false;
    }
  
    public void crearPersona(String nombre, int edad, char sexo, double peso, double altura) {
        int numPersona = personas.length - 1;
        personas[numPersona][0] = numPersona;
        personas[numPersona][1] = nombre;
        personas[numPersona][2] = edad;
        personas[numPersona][3] = sexo;
        personas[numPersona][4] = peso;
        personas[numPersona][5] = altura;
        personas[numPersona][6] = generarDui();

        JOptionPane.showMessageDialog(null, "Persona creada con éxito, Objeto 1");
    }
    
    public void crearPersona(String nombre, int edad, char sexo) {
        int numPersona = datos.length - 1;
        datos[numPersona][0] = numPersona;
        datos[numPersona][1] = nombre;
        datos[numPersona][2] = edad;
        datos[numPersona][3] = sexo;
        datos[numPersona][4] = generarDui();

        JOptionPane.showMessageDialog(null, "Persona creada con éxito, Objeto 2");
    }

    public void crearPersona() {
        int numPersona = caluloIMC.length - 1;
        caluloIMC[numPersona][0] = numPersona;
        caluloIMC[numPersona][1] = nombre;
        caluloIMC[numPersona][2] = edad;
        caluloIMC[numPersona][3] = sexo;
        caluloIMC[numPersona][4] = peso;
        caluloIMC[numPersona][5] = altura;
        caluloIMC[numPersona][6] = generarDui();

        JOptionPane.showMessageDialog(null, "Persona creada con éxito, Objeto 3");
    }

    public void mostrarPersona(int numeroObjeto) {
        String salida = "";
        int maxLength = 1;
        int maxColumn = 0;
        switch (numeroObjeto) {
            case 1:
                salida = "ID\tPersona\tEdad\tSexo\tPeso\tAltura\tdui\n";
                maxColumn = 7;
                int fila,columna;
                for (fila=0;fila < maxLength;fila++){
                    for (columna=0;columna<maxColumn;columna++){
                        salida=salida+personas[fila][columna]+"\t";
                    }
                    salida=salida+"\n";
                }
                break;
            case 2:
                salida = "ID\tPersona\tEdad\tSexo\n";
                maxColumn = 4;
                int filaDos,columnaDos;
                for (filaDos=0;filaDos < maxLength;filaDos++){
                    for (columnaDos=0;columnaDos<maxColumn;columnaDos++){
                        salida=salida+datos[filaDos][columnaDos]+"\t";
                    }
                    salida=salida+"\n";
                }
                break;                
            default:
               salida = "ID\tPersona\tEdad\tSexo\tPeso\tAltura\tdui\n";
                maxColumn = 7;
                int filaTres,columnaTres;
                for (filaTres=0;filaTres < maxLength;filaTres++){
                    for (columnaTres=0;columnaTres<maxColumn;columnaTres++){
                        salida=salida+caluloIMC[filaTres][columnaTres]+"\t";
                    }
                    salida=salida+"\n";
                }
                break;
        }
        hoja.setText(salida);
        JOptionPane.showMessageDialog(null, hoja);
    }
}
