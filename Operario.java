package LojaDeConstrucao;

public class Operario implements Runnable {
    private final String nome;
    private final LojaDeMaterial material;

    public Operario(String nome, LojaDeMaterial material){
        this.nome = nome;
        this.material = material;
    }

    @Override 
    public void run(){
        material.comprar(nome);
    }
}
