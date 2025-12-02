public class TudoMinuscula extends ProcessadorTexto {

    @Override
    protected char[] transformar(char[] chars) {
        char[] resultado = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            resultado[i] = Character.toLowerCase(chars[i]);
        }
        return resultado;
    }

    // Mantém a "assinatura" parecida com o enunciado
    public static String converterTextoEmMinusculo(String entrada) {
        TudoMinuscula proc = new TudoMinuscula();
        return proc.processar(entrada);
    }
}
