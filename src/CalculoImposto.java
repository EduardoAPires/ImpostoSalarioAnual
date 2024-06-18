public class CalculoImposto {
    public static void main(String[] args) {
        double salarioAnual = 50000;
        double impostoUm = 9.28 / 100;
        double impostoDois = 36.93 / 100;
        double impostoTres = 49.50 / 100;
        double valorImposto;

        if (salarioAnual <= 37149){
            valorImposto = salarioAnual * impostoUm;
        } else if (salarioAnual >= 37150 && salarioAnual<= 73031) {
            valorImposto = salarioAnual * impostoDois;
        }else{
            valorImposto = salarioAnual * impostoTres;
        }
        System.out.println("O valor a ser pago de imposto é de R$"+valorImposto);
    }
}
