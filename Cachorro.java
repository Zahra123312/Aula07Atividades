package TesteAnimalnterface;

public class Cachorro implements Animal{
  public void fazerSom(){
      System.out.println("AU AU ");
  }


  public void mover() {
      System.out.println("O cachorro está correndo");
  }
}
