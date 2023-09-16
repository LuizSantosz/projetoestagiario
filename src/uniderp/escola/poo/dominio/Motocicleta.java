package uniderp.escola.poo.dominio;

public class Motocicleta extends BaseVeiculo{
    
    private int guidao;

    public int getGuidao() {
        return guidao;
    }

    public void setGuidao(int guidao) {
        this.guidao = guidao;
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String anoModelo,
            String fabricacao, int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, int codigoRenovam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String placa,
            String documentos, int guidao) {
        super(codigo, nome, modelo, cor, chassi, anoModelo, fabricacao, eixos, pesoLiquido, pesoTotal, assentos, rodas,
                fabricante, potencia, tipoCombustivel, codigoRenovam, nomeProprietario, estadoUF, cidadeUF, tipoVeiculo,
                qtdeMotores, qtdeOcupantes, placa, documentos);
        this.guidao = guidao;
    }
}
