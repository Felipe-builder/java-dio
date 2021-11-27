package one.digitalinnovation.estruturadedados.conceitosbasicos.aula6;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    /**
     * Adiciona o nó a lista
     * @param elemento;
     */
    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null); // ele deve ser o último nó, portanto a frente dele deve ser 'null'
        novoNo.setNoPrevio(ultimoNo); // faz referência ao 'ultimoNo' da presente lista na posicao anterior, "noPrevio".
        // agora que o novoNo foi devidamente preparado para entrar na lista, segue-se a logica de adicionamneto.
        if (primeiroNo == null){
            primeiroNo = novoNo; // adiciona direto na primeira posição, já que ainda ao ha nada na lista
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo); /* agora o até então 'ultimoNo' que possuia 'null' como referencia de 'noProximo'
            passa a possuir o 'novoNo' deixando de ser conceitualmente o 'ultimoNo' da lista */
        }
        ultimoNo = novoNo; //ocorre de fato a alteraçao na lista, sendo agora o 'novoNo' o ultimo da lista
        tamanhoLista++;
    }

    /**
     * vai fazer realocar a posciao do 'no' em que foi escolhido o index para que passe a posicao a frente e se desconecte
     * do seu no anterior, para entao conectar como o 'novoNo' que este por sua vez fará conexão na lista entre o 'no'
     * escolhido pelo index, e o 'no' que ficava logo a trás dele.
     * @param index;
     * @param elemento;
     */
    public void add(int index, T elemento) {
        NoDuplo<T> noAuxiliar = getNo(index); // 'noAuxiliar' vai ter os atributos do 'no' da posicao em que queremos colocar o novo 'no'
        NoDuplo<T> novoNo = new NoDuplo<>(elemento); // vai trazer o 'novoNo'
        novoNo.setNoProximo(noAuxiliar); // 'novoNo' vai fazer referencia posterior ao 'noAuxiliar'

        //agora será desligado as referencias de ligação entre o 'noAuxiliar' e o anterior a ele
        if(novoNo.getNoProximo() != null) {
            novoNo.setNoPrevio(noAuxiliar.getNoPrevio()); //'novoNo' vai receber a posicao anterior do 'noAuxiliar' em seu atribuo 'noPrevio'
            novoNo.getNoProximo().setNoPrevio(novoNo); // o no posterior ao 'novoNo' tera como 'noPrevio' o 'novoNo'
        } else {
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo = novoNo;
        }

        if(index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;
    }

    /**
     * vai deletar um nó com base no index passado
     * @param index
     */
    public void remove(int index) {
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo(); //O 'primeiroNo' passa formalmente a ser o 'no' adiante
            if(primeiroNo != null) {
                primeiroNo.setNoPrevio(null); // O 'primeiroNo' agora é conceitualmente e de fato o primeiro No, pois o no anterior foi apagado da memoria
            }
        }else {
            NoDuplo<T> noAuxiliar = getNo(index);
            noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
            if (noAuxiliar != ultimoNo) {
                noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());
            } else {
                ultimoNo = noAuxiliar; // acredito que o correto aqui seria noAuxiliar.getNoPrevio
            }
        }

        this.tamanhoLista--;
    }

    /**
     * Busca o 'NoDuplo' através do index.
     * percorre a lista até a condição do 'i' ter alcançado o 'index', neste caso encontrou o 'noDuplo' procurado.
     * Já na condição do 'noAuxiliar' ter chegado ao valor null ou até mesmo ser null é cessado mostrando o último 'no'
     * @param index;
     * @return noAuxilar;
     */
    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++){
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        String strRetorno = "";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo="+noAuxiliar.getConteudo() + "}->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
