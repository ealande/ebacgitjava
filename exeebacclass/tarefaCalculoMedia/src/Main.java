public class Main {
    public static void main(String[] args) {
        System.out.println(imprimirMedia());
        System.out.println(recuperacao());

    }
    public static float imprimirMedia() {
        float nota1 = 2;
        float nota2 = 6;
        float nota3 = 8;
        float nota4 = 5;
        return(nota1+nota2+nota3+nota4)/4;

    }

    public static String recuperacao () {
        if (imprimirMedia()>= 7) {
            return "Aprovado!";
        } else if (imprimirMedia()>=5) {
            return"Recuperação!";
        } else{
            return "Reprovado!";
        }
    }
}
