package calc;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
