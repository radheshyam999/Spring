public class Bst<T extends Number> implements Tree {
    class Node<T extends Number>{
        T value;
        Node<T> right;
        Node<T> left;
        Node(T value){
            this.value = value;
        }
    }

    Bst(){}

    /**
     * @param value
     */
     private Node root;
    @Override
    public void insert(Number value) {
        if (root == null) {
            // if tree is empty
            root = new Node((T) value);
        }else{
            // if tree is not empty
            Node<T> temp  = root;
            if (value.intValue() > temp.value.intValue()) {

            }

        }
    }

    /**
     *
     */
    @Override
    public void inOrder() {

    }

    /**
     *
     */
    @Override
    public void preOrder() {

    }

    /**
     *
     */
    @Override
    public void postOrder() {

    }

    /**
     *
     */
    @Override
    public void delete() {

    }

    /**
     *
     */
    @Override
    public void deleteRoot() {

    }
}

