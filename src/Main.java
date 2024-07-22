//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 30.4;
        double celsiusToFahrenheint = (temperaturaCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temperaturaCelsius, celsiusToFahrenheint);

        System.out.println(mensagem);

        int temperaturaFahrenheitInteira = (int) celsiusToFahrenheint;

        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaFahrenheitInteira);
    }
}