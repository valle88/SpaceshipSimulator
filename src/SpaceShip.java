public class SpaceShip {
     private String nombre;
     private String matricula;
     private  int aceleracion;
     private int velocidadX = 0;
     private  int velocidadY= 0;
    private int coordenadaX =0;
    private int coordenadaY= 0;
    private int direccionX= 0;
    private int direccionY= 0;

    public SpaceShip(String nombre, String matricula, int aceleracion, int velocidadX, int velocidadY, int coordenadaX, int coordenadaY, int direccionX, int direccionY) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.aceleracion = aceleracion;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.direccionX = direccionX;
        this.direccionY = direccionY;
    }

    public int speedUp(){
        aceleracion = 3;
        int velocidad = aceleracion * 60;
        double posicion = velocidad + (coordenadaX+ coordenadaY);
    }


}
