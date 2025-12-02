public class Main {

    public static void main(String[] args) {

        String textoOriginal = "Padrões de Projeto em Java";

        String emMaiusculo = TudoMaiuscula.converterTextoEmMaiusculo(textoOriginal);
        String emMinusculo = TudoMinuscula.converterTextoEmMinusculo(textoOriginal);

        System.out.println("Texto original:   " + textoOriginal);
        System.out.println("Tudo maiúsculo:   " + emMaiusculo);
        System.out.println("Tudo minúsculo:   " + emMinusculo);
    }
}
