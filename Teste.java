public class Teste{
	public static void main (String[] args){



ContaBanco conta1 = new ContaBanco();
conta1.setNumConta(001);
conta1.setDono("Jubileu");
conta1.abrirConta("cc");

ContaBanco conta2 = new ContaBanco();

conta2.setNumConta(002);
conta2.setDono("Creusa");
conta2.abrirConta("cp");
conta1.depositar(100);
conta2.depositar(500);
conta2.sacar(100);
conta1.sacar(150);
conta1.fecharConta();
conta1.estadoAtual();
conta2.estadoAtual();
}

}
	




