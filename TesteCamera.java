public class TesteCamera {
    public static void main(String[] args) {
        // Criar uma instância da câmera
        CameraFotografica minhaCamera = new CameraFotografica("Canon", "EOS Rebel", 24);

        // Tirar uma foto
        minhaCamera.tirarFoto();

        // Ajustar a resolução
        minhaCamera.ajustarResolucao(36);
    }
}
