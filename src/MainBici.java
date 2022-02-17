public class MainBici {
    public static void main(String[] args) {
        Bicicleta bici1 = new Bicicleta("bh", 0);
        System.out.println(bici1);
        bici1.acelerar();
        System.out.println(bici1);
        bici1.frenar();
        System.out.println(bici1);
        bici1.parar();
        System.out.println(bici1);

        System.out.println(bici1.cambiarPlato(2));
        System.out.println(bici1);
        System.out.println(bici1.cambiarPiñon(2));
        System.out.println(bici1);


    }
}
