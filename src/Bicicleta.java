public class Bicicleta {


    //Los sets y gets IMPRESCINDIBLES son los siguientes

    private String modelo;

    private double velocidad;
    public void setVelocidad(double velocidad) { //El set de velocidad es imprescindible para poder modificarla en los metodos de frenar,parar y acelerar.
        this.velocidad = velocidad;
    }

    private int plato = 1;
    public void setPlato(int plato) { //El set de plato es imprescindible para poder modificar su valor en cambiarPlato.
        this.plato = plato;
    }

    private int piñon = 1;
    public void setPiñon(int piñon) { //El set de piñon es imprescindible para poder modificar su valor en cambiarPiñon.
        this.piñon = piñon;
    }




    public Bicicleta(String modelo, double velocidad) { //Los imprescindibles para el constructor son el modelo que es el id de la bici, y su velocidad. Plato y piño no son necesarios.
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Bicicleta: " + modelo + " , velocidad:" + velocidad + " , plato:" + plato +
                " , piñon:" + piñon;
    }

    public void acelerar() {
        if (velocidad < 40) {
            setVelocidad(velocidad + 5);
        } else {
            System.out.println("La velocidad esta al maximo");
        }
    }

    public void frenar() {
        setVelocidad(velocidad / 2);
    }

    public void parar() {
        setVelocidad(0);
    }

    public boolean cambiarPlato(int cambiarAlPlato) {

        if (plato == 1) {
            if (cambiarAlPlato == 2) {
                setPlato(2);
                return true;
            } else {
                return false;
            }
        } else if (plato == 2) {
            if (cambiarAlPlato == 3) {
                setPlato(3);
                return true;
            } else if (cambiarAlPlato == 1) {
                setPlato(1);
                return true;
            } else {
                return false;
            }
        } else if (plato == 3) {
            if (cambiarAlPlato == 2) {
                setPlato(2);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public boolean cambiarPiñon(int cambiaralpiñon) {
        for (int i = piñon; i < 7 ; i++) {
            if (cambiaralpiñon < plato + 2 ){
                return false;
            }
        }


        return false;
    }
}
