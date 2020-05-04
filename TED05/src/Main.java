import builder.*;
import model.Arquivo;
import builder.EditorBuilder;
import builder.EditorDeCSVBuilder;

public class Main {

    public static void main(String[] args) {

        // Imagine uma telinha para o usuário configurar o arquivo

        // O usuario escolheu criar uma planilha e a nomeou como "TESTE"
        String tipoEscolhido = "csv";
        String nomeEscolhido = "TESTE";
        Arquivo arquivoCriado = null;
        ArquivoBuilder arquivoBuilder = null;
        EditorBuilder editorBuilder = null;

        // Valida qual o tipo do arquivo selecionado e o cria de acordo com esse tipo
        if (tipoEscolhido.equals("csv")) {
            // Cria o arquivo
            arquivoBuilder = new ArquivoCSVBuilder();
            ArquivoFabrica arquivoCSVFabrica = new ArquivoFabrica(arquivoBuilder);
            arquivoCSVFabrica.criarArquivo(nomeEscolhido);
            arquivoCriado = arquivoCSVFabrica.getArquivo();
            // Abre o arquivo usando o editor correto
            editorBuilder = new EditorDeCSVBuilder();
            EditorFabrica editorFabrica = new EditorFabrica(editorBuilder);
            editorFabrica.construirEditor(arquivoCriado);
        }
        if (tipoEscolhido.equals("txt")) {
            // Cria o arquivo
            arquivoBuilder = new ArquivoTXTBuilder();
            ArquivoFabrica arquivoTXTFabrica = new ArquivoFabrica(arquivoBuilder);
            arquivoTXTFabrica.criarArquivo(nomeEscolhido);
            arquivoCriado = arquivoTXTFabrica.getArquivo();
            // Abre o arquivo usando o editor correto
            editorBuilder = new EditorDeTXTBuilder();
            EditorFabrica editorFabrica = new EditorFabrica(editorBuilder);
            editorFabrica.construirEditor(arquivoCriado);
        }
        if (tipoEscolhido.equals("pptx")) {
            // Cria o arquivo
            arquivoBuilder = new ArquivoPPTXBuilder();
            ArquivoFabrica arquivoPPTXFabrica = new ArquivoFabrica(arquivoBuilder);
            arquivoPPTXFabrica.criarArquivo(nomeEscolhido);
            arquivoCriado = arquivoPPTXFabrica.getArquivo();
            // Abre o arquivo usando o editor correto
            editorBuilder = new EditorDePPTXBuilder();
            EditorFabrica editorFabrica = new EditorFabrica(editorBuilder);
            editorFabrica.construirEditor(arquivoCriado);
        }

        // O usuario escolheu editar o conteudo adicionando o texto "TESTANDO O CONTEUDO"
        editorBuilder.editarArquivo("TESTANDO O CONTEUDO");

        // O usuario tentou realizar a impressão desse arquivo
        editorBuilder.imprimirArquivo();

        // O usuario tentou realizar a cópia desse arquivo
        editorBuilder.copiarArquivo();

        // O usuario fechou esse arquivo
        editorBuilder.fecharArquivo();

    }

}
