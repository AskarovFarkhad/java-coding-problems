import java.util.Objects;

public record Movie(
        String name,
        double rating,
        String genre) {

    @Override
    public String toString() {
        return "Movie{" + name + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(name, movie.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}