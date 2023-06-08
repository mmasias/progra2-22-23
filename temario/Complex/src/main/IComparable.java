package main;

public interface IComparable {
    boolean greaterThan(IComparable object);
    boolean lessThan(IComparable object);
    default boolean equalsTo(IComparable object){
        return !greaterThan(object) && !lessThan(object);
    }
}
