import java.util.*;

public class Main {
    public static void main(String[] args) {
        adicionarNomesOrdenar();
    }

    public static void adicionarNomesOrdenar() {
        System.out.println("Digite os nomes separados por vírgula:");
        List<String> listaNomes = new ArrayList<String>();
        Scanner nomesScanner = new Scanner(System.in);
        String nomesUsuarios = nomesScanner.nextLine();
        String[] nomesSplit = nomesUsuarios.split(",");

        for ( int z=0; nomesSplit.length > z; z++){
        listaNomes.add(nomesSplit[z]);}

        Collections.sort(listaNomes);
        System.out.println(listaNomes);
    }


}
