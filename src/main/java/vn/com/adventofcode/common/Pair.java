package vn.com.adventofcode.common;

import java.util.function.BiFunction;

/**
 * @author : AnhTuPhi
 * @created : 12/1/2024 - 11:51 PM - Sunday
 * @project : adventofcode
 **/
public record Pair<A, B>(A a, B b) implements Comparable<Pair<A, B>> {

    public static <A, B> Pair<A, B> pair(A a, B b) {
        return new Pair<>(a, b);
    }

    public A getLeft() {
        return a;
    }

    public B getRight() {
        return b;
    }

    public <C> C map(BiFunction<A, B, C> func) {
        return func.apply(a(), b());
    }

    public Pair<B, A> flip() {
        return new Pair<>(b, a);
    }

    @Override
    public int compareTo(Pair<A, B> t) {
        if (a instanceof Comparable && t.a instanceof Comparable) {
            return ((Comparable) a).compareTo(t.a);
        }
        return 0;
    }
}