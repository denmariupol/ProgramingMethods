package Chapter_11_Threads.Examples.N_ResourcePool;

import java.util.LinkedList;

/**
 * Created by Ingener_mobil on 28.11.2016.
 * Класс Runner демонстрирует работу пула ресурсов аудиоканалов.
 * При заполнении очереди каналов в данном решении необходимо следить, чтобы число
 каналов, передаваемых списком в конструктор класса ChannelPool, совпадало
 со значением константы POOL_SIZE этого же класса. Константа используется
 для инициализации семафора и при большем или меньшем размерах передаваемого списка
 возникают коллизии, которые, кстати, есть смысл спровоцировать
 и разобраться в причинах и следствиях.

 пуле ресурсов с ограниченным числом, в данном случае аудиоканалов, и значительно бо́льшим
 числом клиентов, желающих воспользоваться одним из каналов. Каждый клиент получает доступ к каналу,
 причем пользоваться можно только одним каналом. Если все каналы заняты, то клиент ждет в течение заданного интервала
 времени. Если лимит ожидания превышен, генерируется исключение и клиент
 уходит, так и не воспользовавшись услугами пула.
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList<AudioChannel> list = new LinkedList<AudioChannel>();
        list.add(new AudioChannel(771));
        list.add(new AudioChannel(883));
        list.add(new AudioChannel(550));
        list.add(new AudioChannel(337));
        list.add(new AudioChannel(442));

        ChannelPool<AudioChannel> pool = new ChannelPool<AudioChannel>(list);
        for (int i = 0; i < 20; i++) {
            new Client(pool).start();
        }
    }
}
