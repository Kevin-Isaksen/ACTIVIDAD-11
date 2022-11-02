package FigurasGeometricas;

public class Triangle implements Shape {

    private double lado, altura;

    public Triangle (double lado, double altura) { this.lado = lado; this.altura = altura;}

    public Triangle (double lado) { this.lado = lado; }

    public void setLado_Triangle (double lado) { this.lado = lado; }

    public double getLado_Triangle () { return altura; }

    public void setAltura_Triangle (double altura) { this.altura = altura; }

    public double getAltura_Triangle () { return altura; }

    @Override
    public double getArea() { return (( lado * altura) / 2); }

    @Override
    public double getPerimeter() { return (lado * 3); }
}