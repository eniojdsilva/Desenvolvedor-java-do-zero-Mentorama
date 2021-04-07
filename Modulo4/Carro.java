public class Carro {

    public static final String VERMELHO = "vermelho";
    public static final String PRETA = "preta";

    private Integer quantidadePneus;
    private Integer quantidadeCalotas;
    private Integer quantidadeParafusosPneus;
    private String cor;
    private Integer numeroDePortas;
    private Integer numeroDoChassi;
    private Integer anoFabricacao;
    private Integer combustivel;

    public Carro(Integer quantidadePneus, Integer numeroDePortas, Integer numeroDoChassi, int i, Integer combustivel){
        setQuantidadePneus(quantidadePneus);
        setNumeroDePortas(numeroDePortas);
        setNumeroDoChassi(numeroDoChassi);
        setAnoFabricacao(i);
        setCombustivel(combustivel);
    }

    public Integer getQuantidadePneus(){
        return quantidadePneus + 2;
    }

    public void setQuantidadePneus(Integer quantidadePneus){
        setQuantidadeCalotas(quantidadePneus);
        setQuantidadeParafusosPneus(quantidadePneus * 4);
        this.quantidadePneus = quantidadePneus;
    }


    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }
    

    public Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }

    public void setQuantidadeCalotas(Integer quantidadeCalotas) {
        this.quantidadeCalotas = quantidadeCalotas;
    }

    public Integer getQuantidadeParafusosPneus() {
        return quantidadeParafusosPneus;
    }

    public void setQuantidadeParafusosPneus(Integer quantidadeParafusosPneus) {
        this.quantidadeParafusosPneus = quantidadeParafusosPneus;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public Integer getNumeroDoChassi() {
        return numeroDoChassi;
    }

    public void setNumeroDoChassi(Integer numeroDoChassi) {
        this.numeroDoChassi = numeroDoChassi;
    }

    public Integer getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(Integer anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Integer getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Integer combustivel) {
        this.combustivel = combustivel;
    }

    public void imprimeValores(){
        System.out.println("Quantidade de Pneus " + getQuantidadePneus());
        System.out.println("Quantidade de calotas " + getQuantidadeCalotas());
        System.out.println("Quantidade de parafusos " + getQuantidadeParafusosPneus());
        System.out.println("Cor " + getCor());
        System.out.println("Número de portas " + getNumeroDePortas());
        System.out.println("Número do Chassi " + getNumeroDoChassi());
        System.out.println("Ano de Fabricação " + getAnoFabricacao());
        System.out.println("Combustível " + getCombustivel() + " Litros");
    }
}