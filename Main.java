package LojaDeConstrucao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public void main(String[] args){
        LojaDeMaterial material = new LojaDeMaterial();
        ExecutorService executor = Executors.newFixedThreadPool(4);

        for(int i = 1; i <= 10; i++){
            executor.submit(new Operario("Operario" + i, material));
        }
        executor.shutdown();
    }
}
