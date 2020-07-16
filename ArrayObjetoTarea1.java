/*
 Diseñe un algoritmo;de tal manera,que le permita crear una matriz de objetos
con una matriz de elementos de datos de dato primitivos.
Análisis:El array Modelo_planta_friccion deberá contener espacios de memoria
cada uno del tamaño de la clase Modelo_planta_friccion en los que se deberá
almacenar la dirección de 9 objetos de Modelo_planta_friccion.Los objetos de
Modelo_planta_friccion deben crearse con el constructor de la clase Modelo_planta_friccion.

 */
package arrayobjetotarea1;
class Modelo_planta_friccion
{
    public double valor;
    public String nombre;
    Modelo_planta_friccion(double valor,String nombre){
        this.valor=valor;
        this.nombre=nombre;
    }



}
/**
 *
 * @author USER
 */
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo_planta_friccion []arreglo;
        arreglo = new Modelo_planta_friccion [9];
        arreglo[0]=new Modelo_planta_friccion(0.12 ,"Masa");
        arreglo[1]=new Modelo_planta_friccion(34.5 ,"Velocidad");
        arreglo[2]=new Modelo_planta_friccion(132.5 ,"Desplazamiento-Relativo");
        arreglo[3]=new Modelo_planta_friccion(150.36 ,"Fuerza-Friccion");
        arreglo[4]=new Modelo_planta_friccion(23.65 ,"Fuerza-control");
        arreglo[5]=new Modelo_planta_friccion(56.3 ,"Ganancia-Sistema");
        arreglo[6]=new Modelo_planta_friccion(0.01 ,"Taza-Momento");
        arreglo[7]=new Modelo_planta_friccion(0.9 ,"Taza-Aprendizaje");
        arreglo[8]=new Modelo_planta_friccion(0.1 ,"Periodo-Muestreo");
        System.out.println("---------UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE----------");
        System.out.println("NOMBRE:LENIN PAUL INACAZA SIMBA");
        System.out.println("MATERIA:ROGRAMACION");
        System.out.println("NRC:7450");
        System.out.println("DOCENTE:ING.LUIS GUERRA");
        System.out.println("TEMA:ARRAY OBJETOS");
        System.out.println("SE PRESENTA LOS VALORES CORRESPONDIENTES AL MODELADO DE LA PLANTA DE FRICCION");
         for(int i=0;i<arreglo.length;i++)
            System.out.println("Elemento en "  + i + " : Posee un valor de  " +
                    arreglo[i].valor  + " Con respecto al Parametro " +arreglo[i].nombre);


    }

}
