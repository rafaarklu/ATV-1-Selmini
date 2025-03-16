import java.util.ArrayList;

public class atv4 {

static class Triangulo {
    private double a, b, c;
    

    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularPerimetro() {
        return a + b + c;
    }

    public double calcularArea() {
        double p = calcularPerimetro() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double calcularX() {
        double lambda = (a * a + b * b - c * c) / (2 * a * b);
        return (b + a * lambda) / 3;
    }

    public double calcularY() {
        double lambda = (a * a + b * b - c * c) / (2 * a * b);
        return (a / 3) * Math.sqrt(1 - lambda * lambda);
    }

    public void imprimirDados() {
        System.out.printf("Área: %.2f, Perímetro: %.2f, Centróide: (%.2f, %.2f)\n",
                calcularArea(), calcularPerimetro(), calcularX(), calcularY());
    }
}


    public static void main(String[] args) {
        
        ArrayList<Triangulo> triangulos = new ArrayList<>();
        
        triangulos.add(new Triangulo(3, 4, 5));
        triangulos.add(new Triangulo(6, 8, 10));
        triangulos.add(new Triangulo(5, 12, 13));
        
        for (Triangulo t : triangulos) {
            t.imprimirDados();
        }
    }
    
}


