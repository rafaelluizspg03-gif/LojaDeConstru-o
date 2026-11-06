package LojaDeConstrucao;

public class LojaDeMaterial {
    private int material = 5;
    
    public synchronized void comprar(String operario){
        if(material > 0){
            System.out.println(operario + "encontrou produto para consertar sua casa");
            material--;
            System.out.println(
                operario + "comprou.consertar sua casa: " + material
            );
        }
    }
}
