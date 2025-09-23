import java.io.IOException;

public class Triangulo{
    double base;
    double altura;

    double calculaArea(){
        double area;
        area = (this.base * this.altura)/2;
        return area;
    }
}