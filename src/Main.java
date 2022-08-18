public class Main {
    public static void main(String[] args) {
        int a = 41;
        int b = 12;
        int c = 23;

        int resultado = suma(a, b, c);
        System.out.println("La suma de a " + a + " +b " + b + " +c " + c + " es: " + resultado);

        Coche myCoche = new Coche();
        myCoche.incrementDoors();
        myCoche.incrementDoors();

        System.out.println("El numero de puertas del coche es: " + myCoche.numberDoors);
    }
    public static int suma(int numero1, int numero2, int numero3){
        return numero1+numero2+numero3;
    }
}
