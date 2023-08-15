package Tarefa;

public class ClasseTeste {
    public static void main(String arg[]){
        Juridica juridica = new Juridica();
        juridica.setCnpj(1234560000168L);
        juridica.setNome("Empresa Teste EBAC");
        juridica.setCodigo(1d);
        System.out.println(juridica.getNome() + " tem número de CNPJ " + juridica.getCnpj() + " e código " + juridica.getCodigo());

        Fisica fisica = new Fisica();
        fisica.setCpf(12345678901L);
        fisica.setNome("Joazinho");
        fisica.setCodigo(2d);
        System.out.println(fisica.getNome() + " tem número de CPF " + fisica.getCpf() + " e código " + fisica.getCodigo());

    }
}
