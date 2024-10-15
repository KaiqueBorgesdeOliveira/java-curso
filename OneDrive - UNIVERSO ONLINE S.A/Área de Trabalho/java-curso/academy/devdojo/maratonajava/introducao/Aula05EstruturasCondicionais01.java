package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
        // !
            System.out.println("Você pode encher a cara");
        }
        if(!isAutorizadoComprarBebida){
            System.out.println("Vai pra casa");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca pode ser feito");
        }
        System.out.println("Fora do If");
    }
}
