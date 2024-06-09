import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    // Curso de Java - Edutin Academy
    // 1.Tipos de variables
    /*
     * int telefono = 55112233;
     * float flotante = 70.578888f;
     * double doble = 1.75678888888;
     * char letra = 'a';
     * 
     * System.out.println(telefono);
     * System.out.println(flotante);
     * System.out.println(doble);
     * System.out.println(letra);
     */

    // 2.Comentarios
    // Esto es un comentario de una linea
    /*
     * Esto es un comentario
     * de varias lineas
     */

    // 3.Tipos de operadores
    /*
     * int a = 2;
     * int b = 3;
     * 
     * System.out.println("Operador suma: " + a + b);
     * System.out.println("Operador resta: " + (a - b));
     * System.out.println("Operador multiplicación: " + a * b);
     * System.out.println("Operador división: " + a / b);
     * System.out.println("Operador módulo: " + a % b);
     */

    // 4.Operadores de asignación
    /*
     * int c = 5;
     * int d = 6;
     * 
     * c += 1;
     * d -= 1;
     * c *= 2;
     * d /= 2;
     * c %= 2;
     */
    /*
     * System.out.println("c: " + c);
     * System.out.println("d: " + d);
     */

    // 5.Operadores relacionales
    /*
     * int a = 10;
     * int b = 5;
     * 
     * System.out.println("a == b: " + (a == b));
     * System.out.println("a < b: " + (a < b));
     * System.out.println("a <= b: " + (a <= b));
     * System.out.println("a > b: " + (a > b));
     * System.out.println("a >= b: " + (a >= b));
     * System.out.println("a != b: " + (a != b));
     */

    // 6.Operadores lógicos
    /*
     * boolean valor1 = true;
     * boolean valor2 = true;
     * boolean valor3 = true;
     * boolean valor4 = false;
     */

    // Operador logico &&
    // System.out.println("Primer resultado: " + (valor1 && valor2));//True
    // System.out.println("Segundo resultado: " + (valor3 && valor4));//False

    // Operador logico ||
    // System.out.println("Tercer resultado: " + (valor1 || valor2));//True
    // System.out.println("Cuarto resultado: " + (valor1 || valor4));//True

    // Operador logico !
    // System.out.println("Quinto resultado: " + !valor1);//False
    // System.out.println("Sexto resultado: " + !valor4);//True

    // 7.Condicionales IF y ELSE
    // int edad = 8;

    // Condicion 1
    // System.out.println("Condicion 1");
    // if(edad >= 18){
    // System.out.println("Eres mayor de edad");
    // }else{
    // System.out.println("Eres menor de edad");
    // }

    // Condicion 2
    // System.out.println("Condicion 2");
    // if(edad >=5 && edad <=10){
    // System.out.println("Tu salon es el 1A");
    // }else{
    // System.out.println("Tu salon es el 1B");
    // }

    // Condicional ELSE IF
    // int hora = 25;

    // 1 hora a 11 horas
    // if(hora >= 1 && hora < 12){
    // System.out.println("Buenos dias");
    // }else if(hora >= 12 && hora < 18){
    // System.out.println("Buenas tardes");
    // }else if(hora >= 18 && hora < 24){
    // System.out.println("Buenas noches");
    // }else{
    // System.out.println("Hora no valida");
    // }

    /*
     * int numero = -1;
     * 
     * if(numero > 0){
     * System.out.println("El numero es positivo");
     * }else if(numero < 0){
     * System.out.println("El numero es negativo");
     * }else{
     * System.out.println("El numero es cero");
     * }
     */

    // Condicional Switch
    // Forma anterior de la version JDK 14
    /*
     * char vocal = 'H';
     * 
     * switch(vocal){
     * case 'A':
     * System.out.println("Vocal A");
     * break;
     * case 'E':
     * System.out.println("Vocal E");
     * break;
     * case 'I':
     * System.out.println("Vocal I");
     * break;
     * case 'O':
     * System.out.println("Vocal O");
     * break;
     * case 'U':
     * System.out.println("Vocal U");
     * break;
     * default:
     * System.out.println("No se reconoce la vocal");
     * }
     */

    // Forma actual de la version JDK 14
    /*
     * int mes = 7;
     * String nombre_mes = "";
     * 
     * switch(mes){
     * //Instrucciones
     * case 1 -> nombre_mes = "Enero";
     * case 2 -> nombre_mes = "Febrero";
     * case 3 -> nombre_mes = "Marzo";
     * case 4 -> nombre_mes = "Abril";
     * case 5 -> nombre_mes = "Mayo";
     * case 6 -> nombre_mes = "Junio";
     * case 7 -> nombre_mes = "Julio";
     * case 8 -> nombre_mes = "Agosto";
     * case 9 -> nombre_mes = "Septiembre";
     * case 10 -> nombre_mes = "Octubre";
     * case 11 -> nombre_mes = "Noviembre";
     * case 12 -> nombre_mes = "Diciembre";
     * }
     * 
     * System.out.println("El mes es: " + nombre_mes);
     */

    // 8.Ciclos
    // Ciclo for

    // Primer ejemplo
    /*
     * for(int i = 0; i <= 100; i++){
     * //Instrucciones
     * System.out.println("El valor de i es: " + i);
     * }
     */

    // Segundo ejemplo
    // Tablas de multiplicar del numero 2
    /*
     * System.out.println("Tabla de multiplicar del número 2");
     * for(int i = 1; i <= 10; i++){
     * System.out.println("2" + "X" + i + " = " + i*2);
     * }
     */

    // Ciclo While y Do While
    /*
     * int x = 1;
     * 
     * while(x <= 5){
     * System.out.println("El valor de X: " + x);
     * x++;
     * }
     */

    // Ciclo do while
    /*
     * int x = 0;
     * 
     * do{
     * System.out.println("El valor de X: " + x);
     * x++;
     * }while(x <= 5);
     */

    // 9.Estructuras de datos
    // Arreglos
    /*
     * String nombres[] = new String [4];
     * nombres[0] = "Fer";
     * nombres[1] = "Elena";
     * nombres[2] = "Fatima";
     * nombres[3] = "Leonel";
     */

    // Formas de recorrer un array
    /*
     * for(int i = 0; i < nombres.length; i++){
     * System.out.println(nombres[i]);
     * }
     */

    // Arreglos multidimensionales o matrices
    /*
     * int [][] numeros = new int [3][3];
     * int i, j;
     */

    // Recorrer filas
    /*
     * for(i = 0; i < numeros.length; i++){
     * System.out.println();
     * //Recorrer las columnas
     * for(j = 0; j < numeros.length; j++){
     * //Imprime el valor de la matriz en la posicion actual
     * System.out.print(numeros[i][j] + " ");
     * }
     * }
     */

    /*int[][] matriz = new int[3][3];
    matriz[0][0] = 12;
    matriz[0][1] = 24;
    matriz[1][0] = 36;
    matriz[1][1] = 48;

    int filas, columnas;

    // Recorrer filas
    for (filas = 0; filas < matriz.length; filas++) {
      System.out.println("");
      // Recorrer columnas
      for (columnas = 0; columnas < matriz.length; columnas++) {
        System.out.print(matriz[filas][columnas] + " ");
      }
    }*/
    
    //Arreglos dinamicos
    //List<String> animales = new ArrayList<>();

    //Agrega elementos al arreglo

    //animales.add("Leon");
    //animales.add("Tigre");
    //animales.add("Gato");
    //animales.add("Perro");

    //System.out.println("Primer arreglo de animales: " + animales);

    //animales.add("Elefante");
    
    //System.out.println("Segundo arreglo de animales: " + animales);

    //animales.add(2, "Caballo");

    //System.out.println("Segundo arreglo de animales: " + animales);

    //List<String> lenguajesProgramacion = new ArrayList<>();
    
    //lenguajesProgramacion.add("Java");
    //lenguajesProgramacion.add("JavaScript");
    //lenguajesProgramacion.add("PHP");
    //lenguajesProgramacion.add("Python");

    //System.out.println("Lenguajes de programacion: " + lenguajesProgramacion);

    //lenguajesProgramacion.remove(3);
    
    //System.out.println("Lenguajes de programacion: " + lenguajesProgramacion);

    //Introduccion a los patrones de diseño
    //El patron modelo vista controlador
    
    //Modelo: Es la capa donde se trabaja con los datos, aqui es donde tendremos                las funciones para acceder, insertar, modificar y eliminar la                     información de la base de datos.
    //Vistas: También son conocidas como una interfaz de usuario, es donde el                   usuario va a interactuar con la aplicación, en la vista trabajamos                con datos pero no accedemos directamente a estos.
    //Controlador: Contiene el código necesario para responder a las acciones que                    realizan los usuarios. Su funcion es en servir como puente                        entre las vistas y los modelos.


    //Como hacer una interfaz gráfica en Java














    
  }
}
