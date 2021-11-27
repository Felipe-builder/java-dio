package one.digitalinnovation.estruturadedados.conceitosbasicos.aula7;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista = 0;
    }


    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        // testar se a lista está vazia
        if (this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximo(cauda); // finaliza a lista circular
        }else {
            novoNo.setProximo(this.cauda); // novoNo será posto atrás da antiga cauda
            this.cabeca.setProximo(novoNo); // fará referência de proximo ao novoNo que será por sua vez a cauda da lista
            this.cauda = novoNo; // a cauda da lista agora é o novoNo
        }
        this.tamanhoLista++;
    }


    /**
     * Vai remover um 'Nó' da lista com base no index passado. O 'Nó' do index vai ser desligado da lista, alterando o
     * atributo 'proximo' do 'Nó' que está imediatamente anterior o 'Nó' do index(nó do index, o qual queremos remover).
     * O então 'Nó' anterior terá seu atribuo 'proximo' alterado por o 'Nó' que esta a frente do qual queremos remover.
     *
     * @param index int;
     */
    public void remove(int index){
        // verifica se o index passado está dentro do limite de tamanho da lista
        if(index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista");

        //noAuxiliar receberá o nó do index 0 ou seja o 'calda'
        No<T> noAxuliar = this.cauda;

        //condições para remoção do nó
        if(index == 0){
            //caso for 0 o index passado basta remover o nó do index 0
            this.cauda = this.cauda.getProximo(); // passou o próximo nó de calda para ser o 'calda'

            this.cabeca.setProximo(this.cauda); // o reinicio da lista então será o calda
        } else if(index == 1){
            //caso o index for 1 então remove o no do index=1 tranformando o 'proximo' do calda em o próximo do qual
            //está a frende do 'calda'
            this.cauda.setProximo(this.cauda.getProximo().getProximo()); // o index=1 foi removido
        } else {
            for (int i = 0; i < index-1; i++) {
                //vai procurar o 'no' anterior ao qual queremos mover por isso (i < index-1)
                noAxuliar = noAxuliar.getProximo();
            }
            noAxuliar.setProximo(noAxuliar.getProximo().getProximo()); // 'no' que desejamos remover foi removido
            // passando a referencia de proximo do 'no' anterior a ele, para o proximo a ele
        }
        this.tamanhoLista--; //tamnaho da lista atualizado
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");

        if(index == 0) {
            return this.cauda;
        }
        
        No<T> noAuxiliar = this.cauda;

        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getProximo();
        }

        return noAuxiliar;
    }

    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "ListaCircular{";
        No<T> noAuxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No(conteudo="+ noAuxiliar.getConteudo() + ")] -->";
            noAuxiliar = noAuxiliar.getProximo();
        }
        strRetorno += !this.isEmpty() ? "(cauda)}" : "[]";
        return strRetorno;
    }
}
