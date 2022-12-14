public interface MyList<T> {
    void add(T value);

    void addAtBegning(T value);

    void addAll(T...arr);
    int size();

    // for deleting at particular location
    boolean delete(int index);

    void reverse();
    // insert at particluar location
    void insert(int index, Object value);

    boolean delete();
    void deleteAll();
    boolean search(T x);
    void printAllElements();

}
