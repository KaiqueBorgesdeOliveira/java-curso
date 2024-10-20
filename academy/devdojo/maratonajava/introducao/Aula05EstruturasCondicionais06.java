package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dado os valores de 1 a 7 imprima se é dia útil ou final de semana, considerando 1 como domingo
        int diaSemana = 7;

       /* System.out.println("Dia da semana de 1 a 7: " + diaSemana);

        switch (diaSemana){
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terça");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
        if(diaSemana <= 5){
            System.out.println("Dia útil");
        } else if (diaSemana >= 5 && diaSemana <= 7) {
            System.out.println("Fim de Semana");
        } else{
            System.out.println("Opção Inválida");
        }
        */

        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }

    }
}
