import java.util.UnknownFormatConversionException;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, empates, derrotas;

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String n){
        this.nacionalidade = n;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String no){
        this.nome = no;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int i){
        this.idade = i;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double a){
        this.altura = a;
    }
    public double getPeso(){
        return this.peso;
    }
    public void setPeso(double p){
        this.peso = p;
        this.setCategoria();
    }
    public String getCategoria(){
        return this.categoria;
    }
    private void setCategoria(){
        if (this.peso < 52.2 || this.peso > 120.7){
            System.out.println("peso inválido");
        } else if (peso <= 70.3) {
            this.categoria = "leve";
        } else if (peso > 70.3 && peso <= 88.5) {
            this.categoria = "médio";
        } else if (peso > 88.5 && peso <= 120.7) {
            this.categoria = "pesado";
        }
    }
    public int getVitorias(){
        return this.vitorias;
    }
    public void setVitorias(int v){
        this.vitorias = v;
    }
    public int getEmpates(){
        return this.empates;
    }
    public void setEmpates(int e){
        this.empates = e;
    }
    public int getDerrotas(){
        return this.derrotas;
    }
    public void setDerrotas(int d){
        this.derrotas = d;
    }

    //Métodos

    public void apresentar(){
            System.out.println("Vai entrando ai " + getNome());
            System.out.println("Diretamente do " + getNacionalidade());
            System.out.println("Idade: " + getIdade());
            System.out.println("Altura: " + getAltura());
            System.out.println("Peso: " + getPeso());
            System.out.println("Cartel: " + getVitorias() + " - " + getDerrotas() + " - " + getEmpates());
    }
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
    }
    public void ganharLuta(){
        setVitorias(getVitorias() + 1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }

    //Métodos especiais


    public Lutador(String no, String n, int i, double a, double p, int v, int d, int e) {
        this.nome = no;
        this.nacionalidade = n;
        this.idade = i;
        this.altura = a;
        this.setPeso(p);
        this.vitorias = v;
        this.derrotas = d;
        this.empates = e;
    }
}
