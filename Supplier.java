package lambda;

@FunctionalInterface
public interface Supplier<T> {
    T get();
}
