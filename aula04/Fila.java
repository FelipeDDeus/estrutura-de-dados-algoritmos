public class Fila<T> {
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Fila() {
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public void enfileirar(T dado) { //enqueue, adiciona um elemento ao final da fila
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }
    }

    public T desenfileirar() { //dequeue, remove o elemento no início da fila
        if (primeiroNo == null) {
            System.out.println("Fila Vazia");
            return null;
        }
        T dado = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNode();
        if (primeiroNo == null) {
            ultimoNo = null;
        }
        return dado;
    }

    public boolean isEmpty() { //verificar se a fila está vazia
        return primeiroNo == null;
    }

    public void imprimeFila() {
        if (primeiroNo == null) {
            System.out.println("Fila Vazia");
        } else {
            System.out.println("Dados da fila:");
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.printf("- %s\n", aux.getDado());
                aux = aux.getNextNode();
            }
        }
    }
}
