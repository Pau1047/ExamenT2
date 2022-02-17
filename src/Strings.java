public class Strings {
    public static void main(String[] args) {

        //Ejercicio 3
        String frasecontar = "Esto es un ejemplo";

        //Ejercicio 4
        String frase = "Murcielago";
        System.out.println(frase);
        cambiaVocalesEj4(frase);

    }


    public static void rotacion (String palabra){

    }






        //Ejercicio 3
 /* public static int cuentaPalabrasVocal (String frasecontar){
        String espacio = " ";
        int contador = 0;

        for (int i = 0; i <frasecontar.length() ; i++) {
            if(frasecontar.charAt() = espacio){
                contador++;
            }
        }


        contador ++;
        return  contador;
    }
*/


    //Ejercicio 4
    public static void cambiaVocalesEj4(String fraseCambiar){

        fraseCambiar = fraseCambiar.replace("a", "@");
        fraseCambiar =  fraseCambiar.replace("e", "3");
        fraseCambiar = fraseCambiar.replace("i", "1");
        fraseCambiar = fraseCambiar.replace("o", "0");
        fraseCambiar = fraseCambiar.replace("u","*");
        System.out.println(fraseCambiar);
    }

}
