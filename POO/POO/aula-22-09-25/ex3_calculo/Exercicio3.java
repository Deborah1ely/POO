public class Exercicio3{

    public static double celsiusParaFahrenheit(double c){
        System.out.println("Resultado Celsius para Fahrenheit: "+((c*9/5)+32));
        return (c*9/5)+32;
    }

    public static double fahrenheitParaCelsius(double f){
        System.out.println("Resultado Fahrenheit para Celsius: "+((f-32)/1.8));
        return (f-32)/1.8;
    }

}