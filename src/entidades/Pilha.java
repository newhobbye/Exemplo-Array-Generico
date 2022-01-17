package entidades;

import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {


    private List<T> elementos;
    private  int posicaoUltimoElementoAdicionado;

    public Pilha() {
        this.elementos = new ArrayList<>();
    }

    public void removerElemento() throws Exception {
        if (elementos.isEmpty())
            throw new Exception("Não há elementos na pilha");

        this.posicaoUltimoElementoAdicionado = elementos.size() - 1;
        elementos.remove(posicaoUltimoElementoAdicionado);
    }

    public void adicionarElemento(T t) {
        elementos.add(t);
    }




}
