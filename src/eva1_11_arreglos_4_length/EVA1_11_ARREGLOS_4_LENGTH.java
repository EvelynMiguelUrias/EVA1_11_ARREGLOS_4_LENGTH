/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_arreglos_4_length;

/**
 *
 * @author Evelyn
 */
public class EVA1_11_ARREGLOS_4_LENGTH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//UNA VEZ QUE SE CREA EL ARREFLO ASI SE QUEDA
        //CREAMOS ARREGLO DE TAÑAMO 5
        int[] aiDatos = new int[5];
        //DAMOS VALORES AL ARREGLO
        aiDatos[0] = 10;
        aiDatos[1] = 20;
        aiDatos[2] = 30;
        aiDatos[3] = 40;
        aiDatos[4] = 50;
        //IMPRMIMOS EL ARREGLO DE TAMAÑO 10
        for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + i + "] = " + aiDatos[i] );    
        }
        //AHORA EL ARREGLO SE TIENE QUE EXPANDIR A 10 DATOS 
        //PARA NO PERDER DATOS COPIAMOS LOS DATOS Y CREAMOS UN NUEVO ARREGLO MAS GRANDE Y AHI NOS MOSTRARA LA COPIA
        System.out.println("ESTA ES LA COPIA"); 
        //CREAMOS LA COPIA DEL ARREGLO DE TAMAÑO 5
        int apCopia[] = new int[5];
        for (int i = 0; i < aiDatos.length; i++) {
            apCopia[i] = aiDatos[i];//DATO POR DATO , COPIAR
        }
        //CREAMOS EL NUEVO ARREGLO DEL TAMAÑO QUE NOSOTROS QUIERAMOS
        aiDatos = new int[10];
        for (int i = 0; i < apCopia.length; i++) {
            aiDatos[i] = apCopia[i];  
        }
        //IMPRIMIMOS EL NUEVO ARREGLO, EL CUAL SE IMPRIME CON TODO Y LA COPIA
        System.out.println("DESPUES DE DARLE TAMAÑO DE 10");
         for (int i = 0; i < aiDatos.length; i++) {
            System.out.println("[" + i + "] = " + aiDatos[i] );    
        }
        
        
    }    
}
