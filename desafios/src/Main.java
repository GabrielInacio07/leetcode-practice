class Main {

    public static void main(String[] args) {

        String word = "abctu";
        String word2 = "pqrqweqwe";
        StringBuilder resultado = new StringBuilder();

        char[] array = word.toCharArray();
        char[] array2 = word2.toCharArray();

        int menorTamanho = Math.min(array.length, array2.length);
        for (int i = 0; i < menorTamanho; i++){

            resultado.append(array[i]);
            resultado.append(array2[i]);
        }

        resultado.append(word.substring(menorTamanho));
        resultado.append(word2.substring(menorTamanho));

        System.out.println(resultado);
    }
}