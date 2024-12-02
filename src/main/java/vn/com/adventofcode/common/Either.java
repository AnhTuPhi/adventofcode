package vn.com.adventofcode.common;

/**
 * @author : AnhTuPhi
 * @created : 12/1/2024 - 11:53 PM - Sunday
 * @project : adventofcode
 **/
import java.util.Objects;
import java.util.Optional;

public record Either<A, B>(Optional<A> a, Optional<B> b) {
    public Either(A a, B b) {
        this(Optional.ofNullable(a), Optional.ofNullable(b));
    }

    public A getA() {
        return a.orElse(null);
    }

    public B getB() {
        return b.orElse(null);
    }

    public boolean isA() {
        return a.isPresent();
    }

    public boolean isB() {
        return b.isPresent();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Either<?, ?> either = (Either<?, ?>) o;

        if (!Objects.equals(a, either.a)) return false;
        return Objects.equals(b, either.b);
    }

    @Override
    public int hashCode() {
        int result = a.isPresent() ? a.hashCode() : 0;
        result = 31 * result + (b.isPresent() ? b.hashCode() : 0);
        return result;
    }
}