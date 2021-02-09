class SaldoInsuficienteException extends Exception{
  public SaldoInsuficienteException(){
    super("Saldo insuficiente");
  }
}

class Cuenta{
  private double saldo;
  public Cuenta(){
    saldo = 0;
  }
  public void depositar(double monto){
    System.out.println("Depositando: "+ monto);
    saldo += monto;
  }
  public void retirar(double monto) throws SaldoInsuficienteException{
    System.out.println("Retirando: "+ monto);
    if(saldo < monto){
      throw new SaldoInsuficienteException();
    }
    saldo -= monto;
  }

  public double getSaldo(){
    return saldo;
  }
}

public class Cajero{
  public static void main(String [] args){
    Cuenta cuenta = new Cuenta();
    try{
      cuenta.depositar(2000);
      cuenta.retirar(1000);
      cuenta.getSaldo();
      cuenta.retirar(1000);
      cuenta.retirar(1000);
      cuenta.getSaldo();
      cuenta.depositar(200);
      cuenta.retirar(100);
      cuenta.getSaldo();
    }catch(SaldoInsuficienteException e){
      e.printStackTrace();
    }
  }
}
