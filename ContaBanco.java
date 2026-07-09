public class ContaBanco{
private int numConta;
private String tipo;
private String dono;
private float saldo;
private boolean status;

public ContaBanco(){
}

public ContaBanco(float saldo, boolean status){
this.saldo = 0;
this.status = false;
}

public int getNumConta(){
return numConta;
}

public void setNumConta(int numConta){
this.numConta = numConta;
}

public String getTipo(){
return tipo;
}

public void setTipo(String tipo){
this.tipo = tipo;
}

public String getDono(){
return dono;
}

public void setDono(String dono){
this.dono = dono;
}

public float getSaldo(){
return saldo;
}

public void setSaldo(float saldo){
this.saldo = saldo;
}

public boolean getStatus(){
return status;
}

public void setStatus(boolean status){
this.status = status;
}

public void abrirConta(String tipo){

this.setTipo (tipo);

this.setStatus (true);

if("cc".equals(tipo)){
this.setSaldo (50);
}else if("cp".equals(tipo)){
this.setSaldo (150);
}
System.out.println("Conta aberta com sucesso");
}
public String fecharConta(){
	if(this.saldo > 0){
	return("Você ainda tem um saldo de: " + this.saldo + " 	saque e encerre a conta");
}
	if(this.saldo == 0){
	this.status = false;
	return("Conta encerrada");
} 
	else{
	return("Você tem um saldo de: " + this.saldo + " " + 	"não é possivel encerrar a conta");
}
}
public float depositar(float deposito){
if(this.status == true){
if(deposito > 0){
this.saldo += deposito;
}
}
return saldo;
}

public void sacar(int saque){
if(this.getStatus()){
if(this.getSaldo() >= saque){
this.setSaldo(this.getSaldo()- saque);
System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
}else {
System.out.println("Saldo insuficiente para saque");
}
}else {
System.out.print("Impossivel sacar de uma conta fechada");
} 
}


public float pagarMensal(){
int cobrancaCC = 12;
int cobrancaCP = 20;

if(tipo == "cc"){
if(status == true){
if(saldo > cobrancaCC){
saldo -= cobrancaCC;
}
}
}
if(tipo == "cp"){
if(status == true){
if(saldo > cobrancaCP){
saldo -= cobrancaCC;
}}}

return saldo;

}

public void estadoAtual(){
System.out.println("------------------");
System.out.println("Conta: " + this.getNumConta());
System.out.println("Tipo: " + this.getTipo());
System.out.println("Dono: " + this.getDono());
System.out.println("Saldo: " + this.getSaldo());
System.out.println("Status: " + this.getStatus());
}


}
