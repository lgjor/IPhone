public class App {
    public static void main(String[] args) throws Exception {
        IPhone iphonetop = new IPhone();

        iphonetop.ligar("123456789");
        iphonetop.atender();
        iphonetop.iniciarCorreioVoz();
        iphonetop.selecionarMusica("Musica 1");
        iphonetop.tocar();
        iphonetop.pausar();
        iphonetop.adicionarNovaAba();
        iphonetop.exibirPagina("https://www.google.com");
        iphonetop.atualizarPagina();
    }
}
