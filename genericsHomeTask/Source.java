package genericsHomeTask;

public class Source<T> {
    private T data;

    Source(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Source{" +
                "data=" + data +
                '}';
    }
}
