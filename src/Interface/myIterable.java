package Interface;

import java.util.function.Consumer;

public interface myIterable<T> {
    myIterator<T> iterator();
    void forEach(Consumer<? super T> elem);

}
