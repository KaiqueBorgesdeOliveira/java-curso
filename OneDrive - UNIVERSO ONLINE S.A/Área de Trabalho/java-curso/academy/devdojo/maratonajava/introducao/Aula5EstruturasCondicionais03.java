package academy.devdojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salário > 5000
        double salario = 3000;
        // String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        // String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";
        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";
        // Operador Ternario - (condicao) ? verdadeiro : falso
        // String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        // System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);
        System.out.println(resultado);
    }
}
