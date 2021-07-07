package one.digitalinnovation.colletionsandstreams.list.classes;

public class Celular {
    private String nome;
    private String IMEI;

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    // Reflexivo =  x.equals(x) tem que ser true para tudo que for diferente de null
    // Simêtrico = para x e y diferentes de null, se x.equals(y) == true logo y.equals(x) == true
    // Transitividade para x, y, z diferentes de null, se x.equals(y) == true, logo y.equals(x) == true e
    // x.equals(z) == true logo y.equals(z) tambem tem que ser true
    // Consistente x.equals(y) deve sempre retorna o mesmo valor
    // para x diferente de null x.equals(null) tem que retornar false;

    //Para HasCode
    // Se x.equals(y) == true, y.hashCode() == x.hashCode(); O contrário não é verdade
    // y.hashCode() == x.hashCode() não necessáriamente o equals deverá retornar true
    // se x.equals(y) == false; retornará false
    // y.hashCode() != x.hashCode(), x.equals(y) deverá ser false



    @Override
    public int hashCode() {
        return IMEI.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null) return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
