public class ClientePesoaJuridica extends Cliente {
    private String cnpj;

    public ClientePesoaJuridica(String nome, String endereco, String cnpj){
        super (nome, endereco);
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return cnpj;
    }
}