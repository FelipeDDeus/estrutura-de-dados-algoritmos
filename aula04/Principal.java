public class Principal {

    public static void main(String[] args) {
        // Testando a Pilha
        System.out.println("=== Testando a Pilha ===");
        Pilha<String> pilha = new Pilha<>();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimePilha();

        System.out.println("Topo da pilha: " + pilha.peek());
        System.out.println("Elemento removido: " + pilha.pop());
        pilha.imprimePilha();

        // Testando a Fila
        System.out.println("\n=== Testando a Fila ===");
        Fila<String> fila = new Fila<>();
        fila.enfileirar("1");
        fila.enfileirar("2");
        fila.enfileirar("3");
        fila.imprimeFila();

        System.out.println("Elemento removido: " + fila.desenfileirar());
        fila.imprimeFila();
    }
}
