package uniderp.escola.poo.dominio;

public abstract class BaseVeiculo {
    protected int codigo;
    protected String nome;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected String anoModelo;
    protected String fabricacao;
    protected int eixos;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected int assentos;
    protected int rodas;
    protected String fabricante;
    protected double potencia;
    protected String tipoCombustivel;
    protected int codigoRenovam;
    protected String nomeProprietario;
    protected String estadoUF;
    protected String cidadeUF;
    protected String tipoVeiculo;
    protected int qtdeMotores;
    protected int qtdeOcupantes;
    protected String placa;
    protected String documentos;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public String getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }
    public String getFabricacao() {
        return fabricacao;
    }
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public int getCodigoRenovam() {
        return codigoRenovam;
    }
    public void setCodigoRenovam(int codigoRenovam) {
        this.codigoRenovam = codigoRenovam;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getDocumentos() {
        return documentos;
    }
    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }
    public BaseVeiculo(int codigo, String nome, String modelo, String cor, String chassi, String anoModelo,
            String fabricacao, int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, int codigoRenovam, String nomeProprietario,
            String estadoUF, String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String placa,
            String documentos) {
        this.codigo = codigo;
        this.nome = nome;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.anoModelo = anoModelo;
        this.fabricacao = fabricacao;
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.assentos = assentos;
        this.rodas = rodas;
        this.fabricante = fabricante;
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
        this.codigoRenovam = codigoRenovam;
        this.nomeProprietario = nomeProprietario;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
        this.placa = placa;
        this.documentos = documentos;
    }
}
