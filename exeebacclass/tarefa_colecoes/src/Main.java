import java.util.*;

public class Main {
    public static void main(String[] args) {
        adicionarNomesOrdenar();
        nomesGenero();
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

    public static void nomesGenero(){
        System.out.println("Digite o nome e gênero seguindo o padrão 'nome - G' e separe-os por vírgula:");

        List<String> listaNomesGenero = new ArrayList<String>();
        List<String> listaNomesMasculino = new ArrayList<String>();
        List<String> listaNomesFeminino = new ArrayList<String>();


        Scanner nomesScanner = new Scanner(System.in);
        String nomesUsuariosGenero = nomesScanner.nextLine();
        String[] nomesSplit = nomesUsuariosGenero.split(",");

        for ( int z=0; nomesSplit.length > z; z++){
            listaNomesGenero.add(nomesSplit[z]);}

        for (int i = 0; listaNomesGenero.size() > i; i++){
            if (nomesSplit[i].contains("- M")){
                listaNomesMasculino.add(nomesSplit[i]);

            } else{
                listaNomesFeminino.add(nomesSplit[i]);
            }

        }

        System.out.println("Sexo Feminino:" + listaNomesFeminino);
        System.out.println("Sexo Masculino:" + listaNomesMasculino);
    }
}
