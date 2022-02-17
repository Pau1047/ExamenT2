public class Strings {
    public static void main(String[] args) {

        //Ejercicio 3
        String frasecontar = "Esto es un ejemplo";

        //Ejercicio 4
        String frase = "Murcielago";
        System.out.println(frase);
        cambiaVocalesEj4(frase);
        System.out.println(frase);
    }

        //Ejercicio 3
  public static int cuentaPalabras (String frasecontar){
        String espacio = " ";
        int contador = 0;

        for (int i = 0; i <frasecontar.length() ; i++) {
            if(){
                contador++;
            }
        }


        contador ++;
        return  contador;
    }



    //Ejercicio 4
    public static String cambiaVocalesEj4(String fraseCambiar){

        fraseCambiar.replace("a", "@");
        fraseCambiar.replace("e", "3");
        fraseCambiar.replace("i", "1");
        fraseCambiar.replace("o", "0");
        fraseCambiar.replace("u","*");
        return fraseCambiar;
    }

}
