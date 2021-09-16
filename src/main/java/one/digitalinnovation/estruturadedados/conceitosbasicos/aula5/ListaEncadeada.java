package one.digitalinnovation.estruturadedados.conceitosbasicos.aula5;

public class ListaEncadeada<T> {

    No<T> referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    /**
     * metódo que adiciona um 'item' a lista.
     * Se a lista for vazia ele adiciona imediatamen um item. Se nao, entao ele adiciona na referencia da ultima iteraçao
     * do loop o proximo item.
     * @param conteudo
     */
    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size()-1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    public T get(int index){
        return getNo(index).getConteudo();
    }

    /**
     * Método que encontra a item da lista segundo o indice passado. Ele vai percorrer a lista ate parar no valor do index
     * passado e entao retornar o no da lista em que parou.
     * @param index;
     * @return No<T>
     */
    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }


    /**
     * Localiza o 'No' na pilha com o index através do médoto .get()
     * Caso o index seja 0, simplesmente 'referenciaEntrada' vai receber o próximo valor, descartanto da lista o valor
     * da posicao anterior, e retornando-o.
     * Se o index for diferente de 0, haverá a instaciação do 'noAnterior' através do (index-1) e posteriormente é posto
     * no seu atributo 'proximoNo' o 'No' que está a frente do 'noPivor' o qual vai ser excluído por conseguinte.
     * @param index int;
     * @return T conteudo;
     */
    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    /**
     * Metodo que identifica o tamanho da lista.
     * Começa incrementando +1 a variavel "tamanhoLista" para cada laço repetido, enquanto houver "No".
     *
     * @return tamanhoLista;
     */
    public int size(){
        int tamanhoLista = 0;
        No<T> referenciaAux = referenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    private void validaIndice(int index){
        if (index >= size()) {
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException(("Não existe conteúdo no índice " + index + " desta lista. Esta lista só i ate o indice " + ultimoIndice + "."));
        }
    }

    public boolean isEmpty() {
        return referenciaEntrada == null ? true : false;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
