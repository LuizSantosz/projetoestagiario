package uniderp.escola.poo.dominio;

public class Onibus extends BaseVeiculo{

    private int janelas;
    private int volante;

    public int getJanelas() {
        return janelas;
    }
    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }
    public int getVolante() {
        return volante;
    }
    public void setVolante(int volante) {
        this.volante = volante;
    }

    public Onibus(int codigo, String nome, String modelo, String cor, String chassi, String anoModelo,
            String fabricacao, int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, int codigoRenovam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String placa,
            String documentos, int janelas, int volante) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, fabricacao, eixos, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, codigoRenovam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
                qtdeMotores, qtdeOcupantes, placa, documentos);
        this.janelas = janelas;
        this.volante = volante;
    }
}
