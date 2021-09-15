package one.digitalinnovation.estruturadedados.conceitosbasicos.aula4;

public class Fila<T> {
    private No<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    /**
     * Vai adicionar o nova 'No' a fila. Pegando primeiramente o 'refNoEntradaFila' e capturando no atributo 'refNo' do
     * 'novoNo', que por fim colocara o 'novoNo' no 'refNoEntradaFila'
     * @param object;
     */
    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    /**
     * Vai procurar qual o primeiro na fila. Sendo sua condiçao para definiçao de 'primeiro na fila' o fato de estar
     * estritamente ligada da situacao do atributo 'refNo' da classe 'No' ser null, ou seja, ao aplicar
     * 'primeiroNo.getRefNo()' e ter como resultado o null;
     * trata-se entao do ultimo 'No' da fila, caso contrario o loop seguira pegando a proxima referencia do 'No'
     * ate a condicao de 'primeiro da fila'
     * @return
     */
    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    /**
     * Este método vai buscar o primeiro nó da fila que será a variável 'primeiroNo' e teria-la posteriormente da fila.
     * Caso não for uma fila vazia;
     * @param 'primeiroNo' será a variavel de retorno, o último nó a ser percorrido pelo while;
     * @param 'noAuxiliar' será o imediatamente anterior ao primeiro nó.
     * @return primeiroNo
     */
    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if (primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo(); // traz a referencia do nó a frente para o 'primeiroNo'
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    /**
     * verifica se 'refNoEntradaFila' é null.
     * @return caso este atributo seja null então a fila está vazia.
     */
    public boolean isEmpty(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true){
                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNo() != null) {
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
