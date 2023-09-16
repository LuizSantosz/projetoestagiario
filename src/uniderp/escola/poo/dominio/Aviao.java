package uniderp.escola.poo.dominio;

public class Aviao extends BaseVeiculo{
    private int porta;
    private String carga;
    private int volante;
    public int getPorta() {
        return porta;
    }
    public void setPorta(int porta) {
        this.porta = porta;
    }
    public String getCarga() {
        return carga;
    }
    public void setCarga(String carga) {
        this.carga = carga;
    }
    public int getVolante() {
        return volante;
    }
    public void setVolante(int volante) {
        this.volante = volante;
    }
    public Aviao(int codigo, String nome, String modelo, String cor, String chassi, String anoModelo, String fabricacao,
            int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas, String fabricante,
            double potencia, String tipoCombustivel, int codigoRenovam, String nomeProprietario, String estadoUF,
            String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String placa, String documentos,
            int porta, String carga, int volante) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, fabricacao, eixos, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, codigoRenovam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
                qtdeMotores, qtdeOcupantes, placa, documentos);
        this.porta = porta;
        this.carga = carga;
        this.volante = volante;
    }
        
}