package vn.com.adventofcode.common;

import org.apache.commons.lang3.function.TriFunction;

/**
 * @author : AnhTuPhi
 * @created : 12/1/2024 - 11:49 PM - Sunday
 * @project : adventofcode
 **/
public record Tuple<A, B, C>(A a, B b, C c) {
    public static <A, B, C> Tuple<A, B, C> of(A a, B b, C c) {
        return new Tuple(a, b, c);
    }

    public <D, E, F> Tuple<D, E, F> map(TriFunction<A, B, C, Tuple<D, E, F>> func) {
        return func.apply(a(), b(), c());
    }
}