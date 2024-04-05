public class App {
    public static void main(String[] args) throws Exception {
        ClientePessoaFisica cl1 = new ClientePessoaFisica("Sitkovsky" ,"Recife" , "123");
        System.out.println(cl1.getCpf());
        System.out.println(cl1.getNome());
        System.out.println(cl1.getEndereco());

        ClientePesoaJuridica cl2 = new ClientePesoaJuridica("Ze da manga", "Esquina do Seu Ciço", "321");
        System.out.println(cl2.getCnpj());
        System.out.println(cl2.getNome());
        System.out.println(cl2.getEndereco());
        }

}
