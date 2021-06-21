package beachmarck;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import java.net.InetAddress;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Will-Not
 */

public class ManupilaArquivo {

    public static String leitor() throws IOException {
        String arquivo = System.getProperty("user.dir");
        BufferedReader buffRead = new BufferedReader(new FileReader(arquivo + "ranking.txt"));
        String nome = "";
        String pontos = "";
        String linha = "";
        String retorno = "<html><body>"
                + "<table border = 1>"
                + "<tr>"
                + "<td WIDTH=100>Máquina</td><td WIDTH=100>Pontuação</td>"
                + "</tr>"
                + "<tr>";
        while (true) {
            if (linha != null) {
                if (linha != "") {
                    String partes[] = linha.split(";");
                    nome = partes[0];
                    pontos = partes[1];
                    Double valor = (Double.parseDouble(pontos));
                    String pontuacao = String.format("%.2f", valor);
                    retorno = retorno + "<td>" + nome + "</td><td>" + pontuacao + "</td>" + "<tr>";
                }
            } else {
                break;
            }
            linha = buffRead.readLine();
        }
        buffRead.close();
        retorno = retorno + "</table>";
        return retorno;
    }

    public static void escritor(String Laco) throws IOException {
        String arquivo = System.getProperty("user.dir");
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(arquivo+"ranking.txt", true));
        String nome = InetAddress.getLocalHost().getHostName();
        String laco = Laco;

        buffWrite.append(nome + ";" + laco);
        buffWrite.newLine();
        buffWrite.close();
    }

    public void ordenar(File arqEntrada, File arqSaida) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        // Contém as linhas ordenadas, sem duplicação  
        SortedSet<String> linhasOrdenadas = new TreeSet<String>();
        // Lê as linhas do arquivo de entrada  
        try {
            br = new BufferedReader(new FileReader(arqEntrada));
            for (String linha = br.readLine(); linha != null; linha = br.readLine()) {
                // O método "add" vai adicionando a "linhasOrdenadas" de forma  
                // que o conjunto fique sempre ordenado
                if (linha != "") {
                    linhasOrdenadas.add(linha);
                }
            }
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                }
            }
        }
        // Grava as linhas do arquivo de saída  
        try {
            bw = new BufferedWriter(new FileWriter(arqSaida));
            // Forma de percorrer linhasOrdenadas de forma ordenada.  
            for (String linha : linhasOrdenadas) {
                bw.write(linha);
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException ex) {
                }
            }
        }
    }

}
