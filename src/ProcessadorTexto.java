public abstract class ProcessadorTexto {

    // Template Method: define o fluxo completo
    public final String processar(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] transformados = transformar(caracteres);
        return juntarCaracteres(transformados);
    }

    // Passo comum: transformar String em array de chars
    protected char[] extrairCaracteres(String texto) {
        if (texto == null) {
            return new char[0];
        }
        return texto.toCharArray();
    }

    // Passo que varia: cada subclasse implementa
    protected abstract char[] transformar(char[] chars);

    // Passo comum: juntar chars em String
    protected String juntarCaracteres(char[] chars) {
        return new String(chars);
    }
}
