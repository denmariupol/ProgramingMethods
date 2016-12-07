package Chapter_11_Threads.Examples.S_ExecutorService_Callable;

import java.util.Random;
import java.util.concurrent.Callable;

/**
 * Created by Ingener_mobil on 01.12.2016.
 * поток с возвращением результата
 *
 * Интерфейс Callable представляет поток, возвращающий
 * значение вызывающему потоку. Определяет один метод
 * V call() throws Exception, в код реализации
 * которого и следует поместить решаемую задачу.
 * Результат выполнения метода  call() может быть
 * получен через экземпляр класса Future, методами
 * V get() или  V get(long timeout, TimeUnit unit)
 * Перед извлечением результатов работы потока Callable
 * можно проверить, завершилась ли задача успешно,
 * методами isDone() и isCancelled() соответственно.
 */
public class CalcCallable implements Callable<Number> {
    @Override
    public Number call() throws Exception {
        Number res = new Random().nextGaussian();
        return res;
    }
}
