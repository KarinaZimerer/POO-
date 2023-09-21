Princípio de Encapsulamento em Programação Orientada a Objetos 🚀

O princípio de encapsulamento é um dos conceitos fundamentais na programação orientada a objetos (POO). Ele se concentra na ideia de ocultar os detalhes internos de uma classe e fornecer uma interface pública para interagir com essa classe. Vamos explorar esse conceito usando a classe CameraFotografica como exemplo.

Classe CameraFotografica 📸
A classe CameraFotografica é um exemplo simples que ilustra o princípio de encapsulamento em POO. Ela representa uma câmera fotográfica com funcionalidades básicas, como tirar fotos e ajustar configurações.

ℹ️ Este exemplo demonstra uma classe "CameraFotografica" que encapsula detalhes internos, fornece uma interface pública para ligar, tirar fotos, desligar e obter informações sobre a câmera. Isso segue as boas práticas de POO, tornando o código seguro, organizado e facilmente mantido.

Atributos Privados 🔒
marca (String): Representa a marca da câmera.
modelo (String): Representa o modelo da câmera.
resolucao (int): Representa a resolução da câmera em megapixels.
Esses atributos são declarados como privados (private) para ocultar seus detalhes internos. Eles não podem ser acessados diretamente de fora da classe.

Métodos Públicos 📦
tirarFoto(): void: Um método público que permite que o usuário tire uma foto.
ajustarResolucao(novaResolucao: int): void: Um método público que permite ao usuário ajustar a resolução da câmera.
Esses métodos fornecem uma interface pública para interagir com a classe CameraFotografica. Os detalhes de como eles funcionam internamente são ocultos.

Exemplo de Uso 🚀
Aqui está um exemplo de como usar a classe CameraFotografica:

java:



        public class ExemploCamera {
    public static void main(String[] args) {
        // Criar uma instância da câmera
        CameraFotografica minhaCamera = new CameraFotografica("Canon", "EOS Rebel", 24);
        // Tirar uma foto
        minhaCamera.tirarFoto();

        // Ajustar a resolução
        minhaCamera.ajustarResolucao(36);
    }
}


Conclusão 🎉
O princípio de encapsulamento em programação orientada a objetos nos ensina a ocultar os detalhes internos de uma classe e fornecer uma interface pública para interagir com ela. Isso promove a modularidade, a reutilização de código e a manutenção mais fácil de programas. A classe CameraFotografica é um exemplo simples que demonstra como aplicar esse princípio em um contexto de programação orientada a objetos.

🌟
Karina Zimerer 
StackX 2023 
Tarefa POO 






