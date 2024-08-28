public class Pilha<T> {
    private No<T> topo;

    public Pilha() {
        this.topo = null;
    }

    public void push(T dado) { //insere um elemento no topo da lista
        No<T> novoNo = new No<T>(dado);
        novoNo.setNextNo(topo);
        topo = novoNo;
    }

    public T pop() { //remove um elemento no topo da lista
        if (topo == null) {
            System.out.println("Pilha Vazia");
            return null;
        }
        T dado = topo.getDado();
        topo = topo.getNextNode();
        return dado;
    }

    public T peek() {   //acessa o elemento no topo da lista sem removê-lo
        if (topo == null) {
            System.out.println("Pilha Vazia");
            return null;
        }
        return topo.getDado();
    }

    public boolean isEmpty() { //Verificar se a pilha está vazia é essencial para evitar erros ao tentar pop em uma pilha sem elementos.
        return topo == null;
    }

    public void imprimePilha() {
        if (topo == null) {
            System.out.println("Pilha Vazia");
        } else {
            System.out.println("Dados da pilha:");
            No<T> aux = topo;
            while (aux != null) {
                System.out.printf("- %s\n", aux.getDado());
                aux = aux.getNextNode();
            }
        }
    }
}
