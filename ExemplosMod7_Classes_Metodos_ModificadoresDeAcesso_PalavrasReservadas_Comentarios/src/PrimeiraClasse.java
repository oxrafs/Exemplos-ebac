public class PrimeiraClasse {

    public static void main(String[] args){

        System.out.println("Ola Rafael");

        Cliente cliente = new Cliente();

        cliente.cadastrarEndereco("rua pedro sampaio");

        cliente.setCodigo(1);

        System.out.println(cliente.getCodigo());

        System.out.println(cliente.getEndereco());

        System.out.println(cliente.retornarNomeCliente());

        System.out.println(cliente.valorTotal());
    }
}