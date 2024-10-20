package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    // Imprimir os primeiros 25 números de um dado valor
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
