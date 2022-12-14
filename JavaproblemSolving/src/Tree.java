public interface  Tree <T extends Number>{
    void insert(T value);


    void inOrder();
    void preOrder();
    void postOrder();
    void delete();
    void deleteRoot();
}
