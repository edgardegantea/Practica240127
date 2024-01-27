package figuras_geometricas;

public class Cuadrado {

    public void calcularPerimetro() {
        Figura cuadrado = new Figura();

        cuadrado.base = 5;

        cuadrado.perimetro = cuadrado.largo * 4;
        cuadrado.resultado = "Perímetro = " + cuadrado.perimetro + " u^2";
        System.out.println(cuadrado.resultado);
    }

}
