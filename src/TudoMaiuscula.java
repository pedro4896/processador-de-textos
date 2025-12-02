public class TudoMaiuscula extends ProcessadorTexto {

    @Override
    protected char[] transformar(char[] chars) {
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toUpperCase(chars[i]);
        }
        return resultado;
    }

    // Mantém a "assinatura" parecida com o enunciado
    public static String converterTextoEmMaiusculo(String entrada) {
        TudoMaiuscula proc = new TudoMaiuscula();
        return proc.processar(entrada);
    }
}
