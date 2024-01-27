package figuras_geometricas;

public class Figura {
    float ancho, largo, base, altura;
    double area, perimetro;
    String nombre_figura, resultado;

    public Figura() {
    }

    public Figura(float ancho, float largo, float base, float altura, double area, double perimetro, String nombre_figura, String resultado) {
        this.ancho = ancho;
        this.largo = largo;
        this.base = base;
        this.altura = altura;
        this.area = area;
        this.perimetro = perimetro;
        this.nombre_figura = nombre_figura;
        this.resultado = resultado;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public float getLargo() {
        return largo;
    }

    public void setLargo(float largo) {
        this.largo = largo;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public String getNombre_figura() {
        return nombre_figura;
    }

    public void setNombre_figura(String nombre_figura) {
        this.nombre_figura = nombre_figura;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
}
